/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import model.Automovel;
import model.Cadastrar;
import model.Equipamento;
import model.Sala;
import model.Solicitante;
import model.Solicitavel;

/**
 *
 * @author Anderson
 */
public class JIFObjetosCadastradosController {

    private static Cadastrar cadastro;
    private static JIFObjetosCadastrados view;

    public JIFObjetosCadastradosController(JIFObjetosCadastrados view, Cadastrar cadastro) {
        this.cadastro = cadastro;
        this.view = view;
    }

    public static void devolucao(int i) {
        DefaultTableModel tabela = (DefaultTableModel) view.jObjetosCadastrados.getModel();

        tabela.removeRow(i);
    }

    public static void update(Solicitavel solicitavel) {

        if (solicitavel instanceof Equipamento) {
            if (!cadastro.getEquipamentos().isEmpty()) {
                int ultimaPosicaoDoArray = cadastro.getEquipamentos().size() - 1;

                solicitavel = (Equipamento) cadastro.getEquipamentos().get(ultimaPosicaoDoArray);

                String tipo = solicitavel.getTipoDoProduto();//criei uma variavel nome, ai é so mostrar essa variavel na tabela
                String id = Integer.toString(solicitavel.getID());//do msm jeito é esse, so q esse é a matricula

                DefaultTableModel tabela = (DefaultTableModel) view.jObjetosCadastrados.getModel();
                //não sei como funciona

                tabela.addRow(new String[]{tipo, id});
                //tmb nao sei como funciona
            }
        }
        if (solicitavel instanceof Sala) {
            if (!cadastro.getSalas().isEmpty()) {
                int ultimaPosicaoDoArray = cadastro.getSalas().size() - 1;

                solicitavel = (Sala) cadastro.getSalas().get(ultimaPosicaoDoArray);

                String tipo = solicitavel.getTipoDoProduto();//criei uma variavel nome, ai é so mostrar essa variavel na tabela
                String id = Integer.toString(solicitavel.getID());//do msm jeito é esse, so q esse é a matricula

                DefaultTableModel tabela = (DefaultTableModel) view.jObjetosCadastrados.getModel();
                //não sei como funciona

                tabela.addRow(new String[]{tipo, id});
                //tmb nao sei como funciona
            }
        }
        if (solicitavel instanceof Automovel) {
            if (!cadastro.getAutomoveis().isEmpty()) {
                int ultimaPosicaoDoArray = cadastro.getAutomoveis().size() - 1;

                solicitavel = (Automovel) cadastro.getAutomoveis().get(ultimaPosicaoDoArray);

                String tipo = solicitavel.getTipoDoProduto();//criei uma variavel nome, ai é so mostrar essa variavel na tabela
                String id = Integer.toString(solicitavel.getID());//do msm jeito é esse, so q esse é a matricula

                DefaultTableModel tabela = (DefaultTableModel) view.jObjetosCadastrados.getModel();
                //não sei como funciona

                tabela.addRow(new String[]{tipo, id});
                //tmb nao sei como funciona
            }
        }

    }

    void getEvent(ActionEvent evento) {
        if (evento.getActionCommand().equals("Excluir")) {

            DefaultTableModel tabela = (DefaultTableModel) view.jObjetosCadastrados.getModel();

            int id = Integer.parseInt((String) tabela.getValueAt(view.jObjetosCadastrados.getSelectedRow(), 1));
            Solicitavel solicitavel;
            
            boolean acabou = false;
            
            while(acabou == false){
                for(int i=0; i<cadastro.getAutomoveis().size();i++){
                    solicitavel = cadastro.getAutomoveis().get(i);
                    if(solicitavel.getID() == id){
                        cadastro.getAutomoveis().remove(i);
                        tabela.removeRow(view.jObjetosCadastrados.getSelectedRow());
                        acabou = true;
                        break;
                    }
                    
                }
                for(int i=0; i<cadastro.getEquipamentos().size();i++){
                    solicitavel = cadastro.getEquipamentos().get(i);
                    if(solicitavel.getID() == id){
                        cadastro.getEquipamentos().remove(i);
                        tabela.removeRow(view.jObjetosCadastrados.getSelectedRow());
                        acabou = true;
                        break;
                    }
                }
                for(int i=0; i<cadastro.getSalas().size();i++){
                    solicitavel = cadastro.getSalas().get(i);
                    if(solicitavel.getID() == id){
                        cadastro.getSalas().remove(i);
                        tabela.removeRow(view.jObjetosCadastrados.getSelectedRow());
                        acabou = true;
                        break;
                    }
                }
            }

        }
    }

}
