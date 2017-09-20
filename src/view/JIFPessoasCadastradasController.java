/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import model.Cadastrar;
import model.Solicitante;

/**
 *
 * @author Anderson
 */
public class JIFPessoasCadastradasController {

    private JIFPessoasCadastradas view;//o controller perceisa saber quem é a view dele, por isso eu criei
    //essa variavel view do tipo JIFPessoasCadastradas, que é o nome da classe q tem a janela com a tabela pra colocar os solicitantes

    private Cadastrar cadastro;//precisso dessa vriavel, pq é aqui q foi guardado os sus solicitantes
    //num array chamado arrayDeSolicitantes

    private Solicitante solicitante;//pressido dessa variavel para a cada iteração no for ele pega um solicitante do arrayDeSolicitantes
    //e armazena nessa variavel solicitante,
    //ai nela vc faz um solicitante.getNome() pra mostrar o nome na tabela
    //i um solicitante.getMatricula() para pegar a matricula e colocar na tabela

    public JIFPessoasCadastradasController(JIFPessoasCadastradas view, Cadastrar cadastro) {
        //quando eu inializei esse controle, eu passo qual é a view que esse controller ta manipulando
        //e a variavel do tipo cadastro, q é onde as pessoas estão cadastradas
        this.view = view;
        this.cadastro = cadastro;
    }

    public void getEvent(ActionEvent evento) {
        //a variavel 'evento' recebeu aquele 'evt' que eu passei quando eu chamei esse geEvento
        // e começa a procurar na variavel cadastro todas as pessoas cadastradas
        if (evento.getActionCommand().equals("Excluir")) {

            DefaultTableModel tabela = (DefaultTableModel) view.jTableSolicitantes.getModel();

            int matricula = Integer.parseInt((String) tabela.getValueAt(view.jTableSolicitantes.getSelectedRow(), 1));

            if (cadastro.getArrayDeSolicitantes().size() > 0) {
                for (int i = 0; i < cadastro.getArrayDeSolicitantes().size(); i++) {

                    Solicitante solicitante = (Solicitante) cadastro.getArrayDeSolicitantes().get(i);

                    if (solicitante.getMatricula() == matricula) {
                        cadastro.getArrayDeSolicitantes().remove(i);
                        tabela.removeRow(view.jTableSolicitantes.getSelectedRow());
                        break;
                    }
                }

            }

        }
    }

    public void update() {

        if (!cadastro.getArrayDeSolicitantes().isEmpty()) {
            int ultimaPosicaoDoArray = cadastro.getArrayDeSolicitantes().size() - 1;

            solicitante = (Solicitante) cadastro.getArrayDeSolicitantes().get(ultimaPosicaoDoArray);

            String nome = solicitante.getNome();//criei uma variavel nome, ai é so mostrar essa variavel na tabela
            String matricula = Integer.toString(solicitante.getMatricula());//do msm jeito é esse, so q esse é a matricula

            DefaultTableModel tabela = (DefaultTableModel) view.jTableSolicitantes.getModel();
            //não sei como funciona

            tabela.addRow(new String[]{nome, matricula});
            //tmb nao sei como funciona
        }

        //DESCONSIDERE OS CODIGOS ABAIXO
        /**
         * int ultimaPosicaoDoArray = cadastro.getArrayDeSolicitantes().size() -
         * 1;
         *
         * solicitante = (Solicitante)
         * cadastro.getArrayDeSolicitantes().get(ultimaPosicaoDoArray);
         *
         * String nome = solicitante.getNome();//criei uma variavel nome, ai é
         * so mostrar essa variavel na tabela String matricula =
         * Integer.toString(solicitante.getMatricula());//do msm jeito é esse,
         * so q esse é a matricula
         *
         * DefaultTableModel tabela = (DefaultTableModel)
         * view.jTableSolicitantes.getModel(); //não sei como funciona
         *
         * tabela.addRow(new String[]{nome, matricula}); //tmb nao sei como
         * funciona
         *
         */
        /**
         * for (int i = 0; i < cadastro.getArrayDeSolicitantes().size(); i++) {
         * //nesse for o cadastro.getArrayDeSolicitantes().size() retorna o
         * tamanho do array de solicitantes
         *
         * solicitante = (Solicitante) cadastro.getArrayDeSolicitantes().get(i);
         * //peguei o solicitante na possição i que vai o 0 ate o tamanho total
         *
         * String nome = solicitante.getNome();//criei uma variavel nome, ai é
         * so mostrar essa variavel na tabela String matricula =
         * Integer.toString(solicitante.getMatricula());//do msm jeito é esse,
         * so q esse é a matricula
         *
         * DefaultTableModel tabela = (DefaultTableModel)
         * view.jTableSolicitantes.getModel(); //não sei como funciona
         *
         * tabela.addRow(new String[]{nome, matricula}); //tmb nao sei como
         * funciona
         *
         * }*
         */
    }
}
