/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.Solicitacoes;
import model.Solicitante;
import model.Solicitavel;

/**
 *
 * @author Anderson
 */
public class JIFReservasFeitasController {
    
    private JIFReservasFeitas view;
    private Solicitacoes solicitacoes;
    
    private Solicitante solicitante;
    private Solicitavel solicitavel;

    public JIFReservasFeitasController(JIFReservasFeitas view, Solicitacoes solicitacoes) {
        this.view = view;
        this.solicitacoes = solicitacoes;
    }
    
    
    public void devolucao(int i){
        DefaultTableModel tabela = (DefaultTableModel) view.jTableReservas.getModel();
        
        tabela.removeRow(i);
    }
    
    public void update() {

        if (solicitacoes.getListasDeSolicitantes().size() != 0) {
            
            int ultimaPosicaoDoArray = solicitacoes.getListasDeSolicitantes().size() - 1;

            solicitante = (Solicitante) solicitacoes.getListasDeSolicitantes().get(ultimaPosicaoDoArray);
            solicitavel = solicitacoes.getListasDeSolicitaveis().get(ultimaPosicaoDoArray);

            String nome = solicitante.getNome();//criei uma variavel nome, ai é so mostrar essa variavel na tabela
            String matricula = Integer.toString(solicitante.getMatricula());//do msm jeito é esse, so q esse é a matricula
            String id = Integer.toString(solicitavel.getID());
            String tipo = solicitavel.getTipoDoProduto();

            DefaultTableModel tabela = (DefaultTableModel) view.jTableReservas.getModel();
            //não sei como funciona

            tabela.addRow(new String[]{nome, matricula, tipo, id});
            //tmb nao sei como funciona
        }

        
        
        //DESCONSIDERE OS CODIGOS ABAIXO
        
        /**int ultimaPosicaoDoArray = cadastro.getArrayDeSolicitantes().size() - 1;

        solicitante = (Solicitante) cadastro.getArrayDeSolicitantes().get(ultimaPosicaoDoArray);

        String nome = solicitante.getNome();//criei uma variavel nome, ai é so mostrar essa variavel na tabela
        String matricula = Integer.toString(solicitante.getMatricula());//do msm jeito é esse, so q esse é a matricula

        DefaultTableModel tabela = (DefaultTableModel) view.jTableSolicitantes.getModel();
        //não sei como funciona

        tabela.addRow(new String[]{nome, matricula});
        //tmb nao sei como funciona
        **/
        
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
