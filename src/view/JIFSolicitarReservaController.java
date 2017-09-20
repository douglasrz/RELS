/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import model.Automovel;
import model.TipoDeAutomovel;
import model.Cadastrar;
import model.Data;
import model.Equipamento;
import model.Sala;
import model.TipoDeEquipamentos;
import model.TipoDeSala;
import model.Solicitacoes;
import model.Solicitante;

/**
 *
 * @author Anderson
 */
public class JIFSolicitarReservaController {

    private JIFReservasFeitasController controllerDaTabela;

    private Cadastrar cadastro;
    private JIFSolicitarReserva view;
    private Solicitacoes solicitacao;
    private Data dataInicioDoEmprestipo;
    private Data dataFimDoEmprestimo;
    private Solicitante solicitante;

    //essa classe serve para controlar o que acontece na view q ela controla, q no nesse caso ela controla
    //uma view do tipo JIFSolicitarReserva, se vc ver essa classe JIFSolicitarReserva vc percebe q ela é uma tela
    //nas classe de controller como de costume sempre tem um getEvent(), que justamente é q ver o que foi q ocorreu na view
    //na view q essa classe ta controlando ela vai verificar quando alguem clicar em cadastrar, quais foram as opcoes 
    //q ela deixou marcada e o q ele deixou escrito na tela de view
    public JIFSolicitarReservaController(JIFReservasFeitasController controllerDaTabela, JIFSolicitarReserva view, Solicitacoes solicitacao, Cadastrar cadastro) {
        this.view = view;
        this.cadastro = cadastro;
        this.solicitacao = solicitacao;
        this.controllerDaTabela = controllerDaTabela;
    }

    public void getEvent(ActionEvent evento) {
        if (evento.getActionCommand().equals("Solicitar")) {//Apertou o solicitar

            dataInicioDoEmprestipo = new Data();//cria uma nova data pra colocar num array de dataInicio no objeto da clsse Solicitacoes
            dataFimDoEmprestimo = new Data();//cria uma nova data pra colocar num array de dataFim no objeto da clsse Solicitacoes

            if (cadastro.getArrayDeSolicitantes().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não possui ninguém com essa matricula");
            }

            for (int j = 0; j < cadastro.getArrayDeSolicitantes().size(); j++) {
                //vai percorrer o array de solicitantes q ta no objeto 'cadastro' em busca de um solicitante em especifico
                solicitante = (Solicitante) cadastro.getArrayDeSolicitantes().get(j);//pegou um solicitante

                boolean solicitacaoAceita = false;

                boolean aconteceuOErro = false;
                int matricula = 0;

                try {
                    matricula = Integer.parseInt(view.getTxtMatricula());

                } catch (NumberFormatException erro) {
                    String errou = view.getTxtMatricula();
                    aconteceuOErro = true;
                    JOptionPane.showMessageDialog(null, "Matricula digitada esta errada Erro: " + errou + ".");
                }

                if (aconteceuOErro == false) {
                    if (matricula == solicitante.getMatricula()) {//verificando se a matricula que eu digitei no view é igual a matricula do cara q eu peguei la do array de solicitantes
                        //se for começa a setar os valores das datas de inicio e fim do emprestimo

                        dataInicioDoEmprestipo.setAno(Integer.parseInt((String) view.jComboBoxAnoDoInicialDoEmprestimo.getSelectedItem()));//se quiser entender isso aqui pesquisa sobre
                        dataInicioDoEmprestipo.setMes(Integer.parseInt((String) view.jComboBoxMesDoInicialDoEmprestimo.getSelectedItem()));// como manipular um jComboBox
                        dataInicioDoEmprestipo.setDia(Integer.parseInt((String) view.jComboBoxDiaDoInicialDoEmprestimo.getSelectedItem()));// so to pegando os valores q tao la e setandoo os valores nas datas

                        if (view.jRadioButton8as10.isSelected()) {//setando o periodo um
                            dataInicioDoEmprestipo.setPeriodo1(true);
                        }
                        if (view.jRadioButton8as10.isSelected()) {//setando o periodo dois
                            dataInicioDoEmprestipo.setPeriodo2(true);
                        }
                        if (view.jRadioButton8as10.isSelected()) {//setando o periodo tres
                            dataInicioDoEmprestipo.setPeriodo3(true);
                        }
                        if (view.jRadioButton8as10.isSelected()) {//setando o periodo quatro
                            dataInicioDoEmprestipo.setPeriodo4(true);
                        }

                        //setando as datas finais
                        dataFimDoEmprestimo.setAno(Integer.parseInt((String) view.jComboBoxAnoDaEntraga.getSelectedItem()));
                        dataFimDoEmprestimo.setMes(Integer.parseInt((String) view.jComboBoxMesDaEntraga.getSelectedItem()));
                        dataFimDoEmprestimo.setDia(Integer.parseInt((String) view.jComboBoxDiaDaEntraga.getSelectedItem()));

                        //se o cara escolhei a opçao sala de aula
                        //então vai começar a ser feitas algumas verificações
                        if (view.jComboBoxSolicitavel.getSelectedItem().equals("Sala de Aula")) {//se o item selesionado for "Sala de Aula"
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("TAMANHO DO ARRAY DE SALAS:  " + cadastro.getSalas().size());
                            System.out.println("_____________________________________________________________________________");

                            //se o array de sala de tem na variavel 'cadastro' for maior q 0, então tem alguma sala cadastrardo, so nao sei qual é o tipo
                            if (cadastro.getSalas().size() > 0) {
                                //se a quantidade de salas cadastradas for maior que 0
                                //então elas vai percorrer o array de salas em busca de uma sala
                                //que seu tipo seja igual a SDL(sala de aula)
                                for (int i = 0; i < cadastro.getSalas().size(); i++) {
                                    //vai pegando uma sala por vez pra testar se é uma sala de aula

                                    Sala sala = cadastro.getSalas().get(i);// pegou uma sala e armazenou em uma variavel com o nome 'sala'

                                    System.out.println("tipo da sala: " + sala.getTipo() + ". Posição: " + cadastro.getSalas().indexOf(sala));

                                    //aqui eu verifico se é uma sala de aula(SDL)
                                    if (sala.getTipo() == TipoDeSala.SDL) {

                                        //se for, eu utilizo a variavel solicitacoes, uso o metodo solicitar dessa variavel e passo como parametro essas coisas ai
                                        solicitacao.solicitar(sala, solicitante, dataInicioDoEmprestipo, dataFimDoEmprestimo);
                                        controllerDaTabela.update();

                                        cadastro.getSalas().remove(i);//o metodo remove tem em todas as listas
                                        JIFObjetosCadastradosController.devolucao(i);

                                        solicitacaoAceita = true;

                                        JOptionPane.showMessageDialog(null, "Reserva solicitada no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + "(Sala de Aula).");

                                        System.out.println("Solicitei a reserva, no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + ".");
                                        System.out.println("_____________________________________________________________________________");
                                        //depois que eu peguei a sala e coloquei ela em um array de salas solicitadas
                                        //é so remover ela do array de salas cadastra
                                        //sendo assim ela nao fica mais disponivel pra ser solicitada, so quando o cara devouvel

                                        //se eu ja reservei a sala então eu uso o brek pra sair do for pro programa seguir em frente
                                        break;
                                        //break pra ele parar de procurar salas de aulas
                                        //pq ele ja encontrou uma, então ja ta bom
                                    }

                                    //se depois de procurar por todo o array de salas e nao encontrou nem uma sala do tipo especificado
                                    //então o i se igualou ao tamanho do array de salas
                                    //so pra eu saber q nao tem nenhuma sala especificada
                                    if (i == cadastro.getSalas().size() - 1) {
                                        solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                        //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                        JOptionPane.showMessageDialog(null, "Não possui nenhuma SDL(Sala de aula) cadastrado que possa ser disponibilizada.");
                                        System.out.println("Não possui nenhuma SDL(Sala de aula) cadastrado que possa ser disponibilizada.");
                                    }
                                }

                            } else {
                                // se o array de salas for 0 então
                                //Mostar uma mesnssagem q nao ha salas disponiveis para reservar
                                solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                JOptionPane.showMessageDialog(null, "Não possui mais salas disponiveis.");
                                System.out.println("Não exite mais salas disponiveis.");
                            }
                        }

                        //LEIA OS COMENTARIOS ACIMA Q VC VAI COMPREENDER OS OUTROS METEODOS
                        //É A MSM LOGICA
                        if (view.jComboBoxSolicitavel.getSelectedItem().equals("Laboratório de Química")) {
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("TAMANHO DO ARRAY DE SALAS:  " + cadastro.getSalas().size());
                            System.out.println("_____________________________________________________________________________");

                            if (cadastro.getSalas().size() > 0) {
                                //se a quantidade de salas cadastradas for maior que 0
                                //então elas vai percorrer o array de salas em busca de uma sala
                                //que seu tipo seja igual a SDL(sala de aula)
                                for (int i = 0; i < cadastro.getSalas().size(); i++) {
                                    //percorrendo todo array de sala em busca da sala de aula
                                    //ela pega a primeira que encontrar

                                    Sala sala = cadastro.getSalas().get(i);

                                    System.out.println("tipo da sala: " + sala.getTipo() + ". Posição: " + cadastro.getSalas().indexOf(sala));

                                    if (sala.getTipo() == TipoDeSala.LDQ) {
                                        solicitacao.solicitar(sala, solicitante, dataInicioDoEmprestipo, dataFimDoEmprestimo);
                                        controllerDaTabela.update();

                                        cadastro.getSalas().remove(i);
                                        JIFObjetosCadastradosController.devolucao(i);

                                        JOptionPane.showMessageDialog(null, "Reserva solicitada no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + "(Laboratório de Química).");

                                        solicitacaoAceita = true;

                                        System.out.println("Solicitei a reserva, no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + ".");
                                        System.out.println("_____________________________________________________________________________");
                                        //depois que eu peguei a sala e coloquei ela em um array de salas solicitadas
                                        //é so remover ela do array de salas cadastra

                                        //Cadastrar.salas.remove(i);
                                        break;
                                        //break pra ele parar de procurar salas de aulas
                                        //pq ele ja encontrou uma, então ja ta bom
                                    }

                                    if (i == cadastro.getSalas().size() - 1) {
                                        solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                        //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                        JOptionPane.showMessageDialog(null, "Não possui nenhum LDQ(Laboratorio de quimica) cadastrado que possa ser disponibilizada.");
                                        System.out.println("Não possui nenhuma LDQ(Laboratorio de quimica) cadastrado que possa ser disponibilizada.");
                                    }
                                }

                            } else {
                                //Mostar uma mesnssagem q nao ha salas disponiveis para reservar
                                solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                JOptionPane.showMessageDialog(null, "Não possui mais salas disponiveis.");
                                System.out.println("Não exite mais salas disponiveis.");
                            }
                        }

                        if (view.jComboBoxSolicitavel.getSelectedItem().equals("Laboratório de Física")) {
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("TAMANHO DO ARRAY DE SALAS:  " + cadastro.getSalas().size());
                            System.out.println("_____________________________________________________________________________");

                            if (cadastro.getSalas().size() > 0) {
                                //se a quantidade de salas cadastradas for maior que 0
                                //então elas vai percorrer o array de salas em busca de uma sala
                                //que seu tipo seja igual a SDL(sala de aula)
                                for (int i = 0; i < cadastro.getSalas().size(); i++) {
                                    //percorrendo todo array de sala em busca da sala de aula
                                    //ela pega a primeira que encontrar

                                    Sala sala = cadastro.getSalas().get(i);

                                    System.out.println("tipo da sala: " + sala.getTipo() + ". Posição: " + cadastro.getSalas().indexOf(sala));

                                    if (sala.getTipo() == TipoDeSala.LDF) {
                                        solicitacao.solicitar(sala, solicitante, dataInicioDoEmprestipo, dataFimDoEmprestimo);
                                        controllerDaTabela.update();

                                        cadastro.getSalas().remove(i);
                                        JIFObjetosCadastradosController.devolucao(i);

                                        solicitacaoAceita = true;

                                        JOptionPane.showMessageDialog(null, "Reserva solicitada no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + "(Laboratório de Física).");

                                        System.out.println("Solicitei a reserva, no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + ".");
                                        System.out.println("_____________________________________________________________________________");
                                        //depois que eu peguei a sala e coloquei ela em um array de salas solicitadas
                                        //é so remover ela do array de salas cadastra

                                        //Cadastrar.salas.remove(i);
                                        break;
                                        //break pra ele parar de procurar salas de aulas
                                        //pq ele ja encontrou uma, então ja ta bom
                                    }

                                    if (i == cadastro.getSalas().size() - 1) {
                                        solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                        //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                        JOptionPane.showMessageDialog(null, "Não possui nenhum LDQ(Laboratorio de quimica) cadastrado que possa ser disponibilizada.");
                                        System.out.println("Não possui nenhuma LDQ(Laboratorio de quimica) cadastrado que possa ser disponibilizada.");
                                    }
                                }

                            } else {
                                //Mostar uma mesnssagem q nao ha salas disponiveis para reservar
                                solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                JOptionPane.showMessageDialog(null, "Não possui mais salas disponiveis.");
                                System.out.println("Não exite mais salas disponiveis.");
                            }
                        }

                        if (view.jComboBoxSolicitavel.getSelectedItem().equals("Laboratório de Informática")) {
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("TAMANHO DO ARRAY DE SALAS:  " + cadastro.getSalas().size());
                            System.out.println("_____________________________________________________________________________");

                            if (cadastro.getSalas().size() > 0) {
                                //se a quantidade de salas cadastradas for maior que 0
                                //então elas vai percorrer o array de salas em busca de uma sala
                                //que seu tipo seja igual a SDL(sala de aula)
                                for (int i = 0; i < cadastro.getSalas().size(); i++) {
                                    //percorrendo todo array de sala em busca da sala de aula
                                    //ela pega a primeira que encontrar

                                    Sala sala = cadastro.getSalas().get(i);

                                    System.out.println("tipo da sala: " + sala.getTipo() + ". Posição: " + cadastro.getSalas().indexOf(sala));

                                    if (sala.getTipo() == TipoDeSala.LDI) {
                                        solicitacao.solicitar(sala, solicitante, dataInicioDoEmprestipo, dataFimDoEmprestimo);
                                        controllerDaTabela.update();

                                        cadastro.getSalas().remove(i);
                                        JIFObjetosCadastradosController.devolucao(i);

                                        solicitacaoAceita = true;

                                        JOptionPane.showMessageDialog(null, "Reserva solicitada no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + "(Laboratório de Informática).");

                                        System.out.println("Solicitei a reserva, no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + ".");
                                        System.out.println("_____________________________________________________________________________");
                                        //depois que eu peguei a sala e coloquei ela em um array de salas solicitadas
                                        //é so remover ela do array de salas cadastra

                                        //Cadastrar.salas.remove(i);
                                        break;
                                        //break pra ele parar de procurar salas de aulas
                                        //pq ele ja encontrou uma, então ja ta bom
                                    }

                                    if (i == cadastro.getSalas().size() - 1) {
                                        solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                        //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                        JOptionPane.showMessageDialog(null, "Não possui nenhum LDI(Laboratorio de informatica) cadastrado que possa ser disponibilizada.");
                                        System.out.println("Não possui nenhuma LDI(Laboratorio de informatica) cadastrado que possa ser disponibilizada.");
                                    }
                                }

                            } else {
                                //Mostar uma mesnssagem q nao ha salas disponiveis para reservar
                                solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                JOptionPane.showMessageDialog(null, "Não possui mais salas disponiveis.");
                                System.out.println("Não exite mais salas disponiveis.");
                            }
                        }

                        if (view.jComboBoxSolicitavel.getSelectedItem().equals("Auditório")) {
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("TAMANHO DO ARRAY DE SALAS:  " + cadastro.getSalas().size());
                            System.out.println("_____________________________________________________________________________");

                            if (cadastro.getSalas().size() > 0) {
                                //se a quantidade de salas cadastradas for maior que 0
                                //então elas vai percorrer o array de salas em busca de uma sala
                                //que seu tipo seja igual a SDL(sala de aula)
                                for (int i = 0; i < cadastro.getSalas().size(); i++) {
                                    //percorrendo todo array de sala em busca da sala de aula
                                    //ela pega a primeira que encontrar

                                    Sala sala = cadastro.getSalas().get(i);

                                    System.out.println("tipo da sala: " + sala.getTipo() + ". Posição: " + cadastro.getSalas().indexOf(sala));

                                    if (sala.getTipo() == TipoDeSala.AUD) {
                                        solicitacao.solicitar(sala, solicitante, dataInicioDoEmprestipo, dataFimDoEmprestimo);
                                        controllerDaTabela.update();

                                        cadastro.getSalas().remove(i);
                                        JIFObjetosCadastradosController.devolucao(i);

                                        solicitacaoAceita = true;

                                        JOptionPane.showMessageDialog(null, "Reserva solicitada no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + "(Auditório).");

                                        System.out.println("Solicitei a reserva, no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + sala.getTipo() + ".");
                                        System.out.println("_____________________________________________________________________________");
                                        //depois que eu peguei a sala e coloquei ela em um array de salas solicitadas
                                        //é so remover ela do array de salas cadastra

                                        //Cadastrar.salas.remove(i);
                                        break;
                                        //break pra ele parar de procurar salas de aulas
                                        //pq ele ja encontrou uma, então ja ta bom
                                    }

                                    if (i == cadastro.getSalas().size() - 1) {
                                        solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                        //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                        JOptionPane.showMessageDialog(null, "Não possui nenhum AUD(Autitório) cadastrado que possa ser disponibilizada.");
                                        //System.out.println("Não possui nenhuma AUD(Autitório) cadastrado que possa ser disponibilizada.");
                                    }
                                }

                            } else {
                                //Mostar uma mesnssagem q nao ha salas disponiveis para reservar
                                solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                JOptionPane.showMessageDialog(null, "Não exite mais salas disponiveis.");
                                //System.out.println("Não possui mais salas disponiveis.");
                            }
                        }

                        if (view.jComboBoxSolicitavel.getSelectedItem().equals("Carro")) {
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("TAMANHO DO ARRAY DE AUTOMOVEIS:  " + cadastro.getAutomoveis().size());
                            System.out.println("_____________________________________________________________________________");

                            if (cadastro.getAutomoveis().size() > 0) {
                                //se a quantidade de salas cadastradas for maior que 0
                                //então elas vai percorrer o array de salas em busca de uma sala
                                //que seu tipo seja igual a SDL(sala de aula)
                                for (int i = 0; i < cadastro.getAutomoveis().size(); i++) {
                                    //percorrendo todo array de sala em busca da sala de aula
                                    //ela pega a primeira que encontrar

                                    Automovel automovel = cadastro.getAutomoveis().get(i);

                                    System.out.println("tipo da automovel: " + automovel.getTipo() + ". Posição: " + cadastro.getAutomoveis().indexOf(automovel));

                                    if (automovel.getTipo() == TipoDeAutomovel.CARRO) {
                                        solicitacao.solicitar(automovel, solicitante, dataInicioDoEmprestipo, dataFimDoEmprestimo);
                                        controllerDaTabela.update();

                                        cadastro.getAutomoveis().remove(i);
                                        JIFObjetosCadastradosController.devolucao(i);

                                        solicitacaoAceita = true;

                                        JOptionPane.showMessageDialog(null, "Reserva solicitada no nome de: " + solicitante.getNome() + ". O automóvel solicitada é do tipo: " + automovel.getTipo() + ".");

                                        System.out.println("Solicitei a reserva, no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + automovel.getTipo() + ".");
                                        System.out.println("_____________________________________________________________________________");
                                        //depois que eu peguei a sala e coloquei ela em um array de salas solicitadas
                                        //é so remover ela do array de salas cadastra

                                        //Cadastrar.salas.remove(i);
                                        break;
                                        //break pra ele parar de procurar salas de aulas
                                        //pq ele ja encontrou uma, então ja ta bom
                                    }

                                    if (i == cadastro.getAutomoveis().size() - 1) {
                                        solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                        //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                        JOptionPane.showMessageDialog(null, "Não possui nenhum Carro cadastrado que possa ser disponibilizada.");
                                        System.out.println("Não possui nenhuma Carro cadastrado que possa ser disponibilizada.");
                                    }
                                }

                            } else {
                                //Mostar uma mesnssagem q nao ha salas disponiveis para reservar
                                solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                JOptionPane.showMessageDialog(null, "Não possui mais automoveis disponiveis.");
                                System.out.println("Não exite mais automoveis disponiveis.");
                            }
                        }

                        if (view.jComboBoxSolicitavel.getSelectedItem().equals("Ônibus")) {
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("TAMANHO DO ARRAY DE AUTOMOVEIS:  " + cadastro.getAutomoveis().size());
                            System.out.println("_____________________________________________________________________________");

                            if (cadastro.getAutomoveis().size() > 0) {
                                //se a quantidade de salas cadastradas for maior que 0
                                //então elas vai percorrer o array de salas em busca de uma sala
                                //que seu tipo seja igual a SDL(sala de aula)
                                for (int i = 0; i < cadastro.getAutomoveis().size(); i++) {
                                    //percorrendo todo array de sala em busca da sala de aula
                                    //ela pega a primeira que encontrar

                                    Automovel automovel = cadastro.getAutomoveis().get(i);

                                    System.out.println("tipo da automovel: " + automovel.getTipo() + ". Posição: " + cadastro.getAutomoveis().indexOf(automovel));

                                    if (automovel.getTipo() == TipoDeAutomovel.ONIBUS) {
                                        solicitacao.solicitar(automovel, solicitante, dataInicioDoEmprestipo, dataFimDoEmprestimo);
                                        controllerDaTabela.update();

                                        cadastro.getAutomoveis().remove(i);
                                        JIFObjetosCadastradosController.devolucao(i);

                                        solicitacaoAceita = true;

                                        JOptionPane.showMessageDialog(null, "Reserva solicitada no nome de: " + solicitante.getNome() + ". O automóvel solicitada é do tipo: " + automovel.getTipo() + ".");

                                        System.out.println("Solicitei a reserva, no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + automovel.getTipo() + ".");
                                        System.out.println("_____________________________________________________________________________");
                                        //depois que eu peguei a sala e coloquei ela em um array de salas solicitadas
                                        //é so remover ela do array de salas cadastra

                                        //Cadastrar.salas.remove(i);
                                        break;
                                        //break pra ele parar de procurar salas de aulas
                                        //pq ele ja encontrou uma, então ja ta bom
                                    }

                                    if (i == cadastro.getAutomoveis().size() - 1) {
                                        solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                        //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                        JOptionPane.showMessageDialog(null, "Não possui nenhum Onibus cadastrado que possa ser disponibilizada.");
                                        System.out.println("Não possui nenhuma Onibus cadastrado que possa ser disponibilizada.");
                                    }
                                }

                            } else {
                                //Mostar uma mesnssagem q nao ha salas disponiveis para reservar
                                solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                JOptionPane.showMessageDialog(null, "Não possui mais automoveis disponiveis.");
                                System.out.println("Não exite mais automoveis disponiveis.");
                            }
                        }

                        if (view.jComboBoxSolicitavel.getSelectedItem().equals("Datashow")) {
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("TAMANHO DO ARRAY DE EQUIPAMENTOS:  " + cadastro.getEquipamentos().size());
                            System.out.println("_____________________________________________________________________________");

                            if (cadastro.getEquipamentos().size() > 0) {
                                //se a quantidade de salas cadastradas for maior que 0
                                //então elas vai percorrer o array de salas em busca de uma sala
                                //que seu tipo seja igual a SDL(sala de aula)
                                for (int i = 0; i < cadastro.getEquipamentos().size(); i++) {
                                    //percorrendo todo array de sala em busca da sala de aula
                                    //ela pega a primeira que encontrar

                                    Equipamento equipamento = cadastro.getEquipamentos().get(i);

                                    System.out.println("tipo da equipamento: " + equipamento.getTipo() + ". Posição: " + cadastro.getEquipamentos().indexOf(equipamento));

                                    if (equipamento.getTipo() == TipoDeEquipamentos.DATASHOW) {
                                        solicitacao.solicitar(equipamento, solicitante, dataInicioDoEmprestipo, dataFimDoEmprestimo);
                                        controllerDaTabela.update();

                                        cadastro.getEquipamentos().remove(i);
                                        JIFObjetosCadastradosController.devolucao(i);

                                        solicitacaoAceita = true;

                                        JOptionPane.showMessageDialog(null, "Reserva solicitada no nome de: " + solicitante.getNome() + ". O Equipamento solicitada é do tipo: " + equipamento.getTipo() + ".");

                                        System.out.println("Solicitei a reserva, no nome de: " + solicitante.getNome() + ". O Equipamento solicitada é do tipo: " + equipamento.getTipo() + ".");
                                        System.out.println("_____________________________________________________________________________");
                                        //depois que eu peguei a sala e coloquei ela em um array de salas solicitadas
                                        //é so remover ela do array de salas cadastra

                                        //Cadastrar.salas.remove(i);
                                        break;
                                        //break pra ele parar de procurar salas de aulas
                                        //pq ele ja encontrou uma, então ja ta bom
                                    }

                                    if (i == cadastro.getEquipamentos().size() - 1) {
                                        solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                        //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                        JOptionPane.showMessageDialog(null, "Não possui nenhuma Datashow cadastrado que possa ser disponibilizada.");
                                        System.out.println("Não possui nenhuma Datashow cadastrado que possa ser disponibilizada.");
                                    }
                                }

                            } else {
                                //Mostar uma mesnssagem q nao ha salas disponiveis para reservar
                                solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                JOptionPane.showMessageDialog(null, "Não exite mais equipamentos disponiveis.");
                                //System.out.println("Não possui mais equipamentos disponiveis.");
                            }
                        }

                        if (view.jComboBoxSolicitavel.getSelectedItem().equals("Notebook")) {
                            System.out.println("_____________________________________________________________________________");
                            System.out.println("TAMANHO DO ARRAY DE EQUIPAMENTOS:  " + cadastro.getEquipamentos().size());
                            System.out.println("_____________________________________________________________________________");

                            if (cadastro.getEquipamentos().size() > 0) {
                                //se a quantidade de salas cadastradas for maior que 0
                                //então elas vai percorrer o array de salas em busca de uma sala
                                //que seu tipo seja igual a SDL(sala de aula)
                                for (int i = 0; i < cadastro.getEquipamentos().size(); i++) {
                                    //percorrendo todo array de sala em busca da sala de aula
                                    //ela pega a primeira que encontrar

                                    Equipamento equipamento = cadastro.getEquipamentos().get(i);

                                    System.out.println("tipo da equipamento: " + equipamento.getTipo() + ". Posição: " + cadastro.getEquipamentos().indexOf(equipamento));

                                    if (equipamento.getTipo() == TipoDeEquipamentos.NOTEBOOK) {
                                        solicitacao.solicitar(equipamento, solicitante, dataInicioDoEmprestipo, dataFimDoEmprestimo);
                                        controllerDaTabela.update();

                                        cadastro.getEquipamentos().remove(i);
                                        JIFObjetosCadastradosController.devolucao(i);

                                        solicitacaoAceita = true;

                                        JOptionPane.showMessageDialog(null, "Reserva solicitada no nome de: " + solicitante.getNome() + ". O Equipamento solicitada é do tipo: " + equipamento.getTipo() + ".");

                                        System.out.println("Solicitei a reserva, no nome de: " + solicitante.getNome() + ". A sala solicitada é do tipo: " + equipamento.getTipo() + ".");
                                        System.out.println("_____________________________________________________________________________");
                                        //depois que eu peguei a sala e coloquei ela em um array de salas solicitadas
                                        //é so remover ela do array de salas cadastra

                                        //Cadastrar.salas.remove(i);
                                        break;
                                        //break pra ele parar de procurar salas de aulas
                                        //pq ele ja encontrou uma, então ja ta bom
                                    }

                                    if (i == cadastro.getEquipamentos().size() - 1) {
                                        solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                        //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                        JOptionPane.showMessageDialog(null, "Não possui nenhum Notebook cadastrado que possa ser disponibilizada.");
                                        System.out.println("Não possui nenhuma Notebook cadastrado que possa ser disponibilizada.");
                                        break;
                                    }
                                }

                            } else {
                                //Mostar uma mesnssagem q nao ha salas disponiveis para reservar
                                solicitacaoAceita = true; //nao efetuou a solicitacao então colocar true, pq la em baixo ele vai reificar se solicitou
                                //se nao solicitou ele vai dizer q nao exeite niguem com essa matricula
                                JOptionPane.showMessageDialog(null, "Não exite mais equipamentos disponiveis.");
                                break;
                                //System.out.println("Não possui mais equipamentos disponiveis.");
                            }
                        }
                    }
                }

                if (j == cadastro.getArrayDeSolicitantes().size() - 1 && solicitacaoAceita == false) {
                    JOptionPane.showMessageDialog(null, "Não exite ninguém com essa matricula");
                    break;
                }

            }
        }
    }
}
