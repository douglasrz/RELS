/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import model.Automovel;
import model.Cadastrar;
import model.Equipamento;
import model.Sala;
import model.Solicitacoes;
import model.Solicitante;
import model.Solicitavel;

/**
 *
 * @author Anderson
 */
public class JIFSolicitarDevolucaoController {

    private JIFReservasFeitasController controllerDaTabela;

    private JIFSolicitarDevolucao view;
    private Solicitacoes solicitacao;
    private Solicitante solicitante;
    private Cadastrar cadastro;
    private Solicitavel coisaSolicitada;

    public JIFSolicitarDevolucaoController(JIFReservasFeitasController controllerDaTabela, Cadastrar cadastro, JIFSolicitarDevolucao view, Solicitacoes solicitacao) {
        this.cadastro = cadastro;
        this.view = view;
        this.solicitacao = solicitacao;
        this.controllerDaTabela = controllerDaTabela;
    }

    public void getEvent(ActionEvent evento) {
        if (evento.getActionCommand().equals("Devolver")) {

            if (solicitacao.getListasDeSolicitantes().size() > 0) {//verificando se existe alguem no array de solicitacoes reservadas, se existir
                //pelo menos 1 pessoa que solicitou uma reserva, enão ela ta do array de solicitantes, q fica em um objeto da classe Solicitacoes

                for (int i = 0; i < solicitacao.getListasDeSolicitantes().size(); i++) {//ja q existe pelo menos 1 saia pelo array de solicitantes em busca
                    //de um solicitante em expecifico, q é o q possui a msm matricula digitada la na interface q faz as devoluçoes

                    solicitante = solicitacao.getListasDeSolicitantes().get(i);//pegando um solicitante a cada iteração no for

                    int matriculaParaComparar = Integer.parseInt(view.getTxtMatricula());//armazenando a matricula dessa pessoa q eu peguei pra comparar depois

                    if (solicitante.getMatricula() == matriculaParaComparar) {//comparando a matricula digitada na interface com a matricula do cara q eu peguei na interação do for
                        //se for igual, vá em busca dos equipamentos com o ID especificado na interface

                        for (int j = 0; j < solicitacao.getListasDeSolicitaveis().size(); j++) {//ja q existe alguem no array de solicites na classe Solicitacoes
                            //então tambem existem algum equipamento no array de coisas solicitadas

                            coisaSolicitada = solicitacao.getListasDeSolicitaveis().get(j);//pegando 1 por 1 a cada iteração do for

                            if (coisaSolicitada.getID() == Integer.parseInt(view.getTxtID())) {//comparando a coisa q eu peguei pra ver se o ID dessas coisa q eu peguei
                                //tem o msm ID digitado la na interface, se for vamo colocar essa coisa no array de cadastradas, assim ela fica disponivel pra ser
                                //solicitada dinovo

                                //se a variavel coisaSolicitada for do tipo Automovel eu devo colocar esse automovel no array de automoveis la no cadastro
                                if (coisaSolicitada instanceof Automovel) {
                                    cadastro.getAutomoveis().add((Automovel) coisaSolicitada);//coloquei o automovel no array de cadastrodos denovo
                                    //agora devo tira-lo do array de coisas solicitadas do objeto solicitacao que é do tipo Solicitacoes

                                    JIFObjetosCadastradosController.update(coisaSolicitada);
                                    solicitacao.devolver(j);//chamando o metodo devolver da classe Solicitacoes
                                    controllerDaTabela.devolucao(j);

                                    //eu retirei isso tudo pq perceba q toda linha com indice j será limpada, então da proxima vez q eu for solicitar alguma coisa
                                    //ela pode ir pra essa posicao q eu acabei de limpar, isso deixa mais organizado
                                    System.out.println("A coisa q eu quero devolver é um AUTOMOVEL");
                                    break;//ja devolvi então sai dos for todos e flw vlw
                                }

                                //OS COMENTARIOS EU DEI SÓ CTROL+C E CTROL+V SE NUM FIZER SENTIDO DAQUI PRA BAIXO USE A MSM LOGICA DAQUI DE CIMA
                                if (coisaSolicitada instanceof Sala) {
                                    cadastro.getSalas().add((Sala) coisaSolicitada);//coloquei o automovel no array de cadastrodos denovo
                                    //agora devo tira-lo do array de coisas solicitadas do objeto solicitacao que é do tipo Solicitacoes

                                    JIFObjetosCadastradosController.update(coisaSolicitada);
                                    solicitacao.devolver(j);//chamando o metodo devolver da classe Solicitacoes
                                    controllerDaTabela.devolucao(j);

                                    //eu retirei isso tudo pq perceba q toda linha com indice j será limpada, então da proxima vez q eu for solicitar alguma coisa
                                    //ela pode ir pra essa posicao q eu acabei de limpar, isso deixa mais organizado
                                    System.out.println("A coisa q eu quero devolver é um SALA");
                                    break;//ja devolvi então sai dos for todos e flw vlw
                                }

                                if (coisaSolicitada instanceof Equipamento) {
                                    cadastro.getEquipamentos().add((Equipamento) coisaSolicitada);//coloquei o automovel no array de cadastrodos denovo
                                    //agora devo tira-lo do array de coisas solicitadas do objeto solicitacao que é do tipo Solicitacoes

                                    JIFObjetosCadastradosController.update(coisaSolicitada);
                                    solicitacao.devolver(j);//chamando o metodo devolver da classe Solicitacoes
                                    controllerDaTabela.devolucao(j);

                                    //eu retirei isso tudo pq perceba q toda linha com indice j será limpada, então da proxima vez q eu for solicitar alguma coisa
                                    //ela pode ir pra essa posicao q eu acabei de limpar, isso deixa mais organizado
                                    System.out.println("A coisa q eu quero devolver é um EQUIPAMENTO");
                                    break;//ja devolvi então sai dos for todos e flw vlw
                                }

                            } else {
                                System.out.println("ID possivelmente errado.");
                            }

                        }

                        break;
                    }

                    if (solicitacao.getListasDeSolicitantes().size() - 1 == i) {
                        System.out.println("Nao existe ningem com essa matricula no arry de solicitantes");
                    }
                }

            } else {
                System.out.println("Nao existes solicitacoes pendentes.");
            }

        }
    }
}
