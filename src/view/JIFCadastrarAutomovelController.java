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

/**
 *
 * @author Anderson
 */
public class JIFCadastrarAutomovelController {

    private JIFCadastrarAutomovel view;//pro controller saber quem é a view q ela ta controlando
    private Cadastrar cadastrar;//para saber onde salvar o cadastro
    private Automovel model;//o q eu vou colocar no array de automovei la em cadastro

    //eu usei esse construtor la na view, da uma olhada la, to so inicializando as variaveis daqui
    //
    public JIFCadastrarAutomovelController(JIFCadastrarAutomovel view, Cadastrar cadastrar) {
        this.view = view;//a view daqui recebe a view q eu to manipulando
        this.cadastrar = cadastrar;//recebendo o cadastro q veio desde a tela inicial, ele chegou ate aqui
    }

    //esse metodo é quem vai tratar o evento q ocorreu na view
    public void getEvent(ActionEvent evento) {

        //o cara apertou em cadastara
        if (evento.getActionCommand().equals("Cadastrar")) {

            //crio um automovel
            model = new Automovel();
            boolean aconteceuErro = false;

            try {
                //seto a placa dele
                model.setPlaca(view.getTxtPlaca());
            } catch (NumberFormatException erro) {
                String errou = view.getTxtPlaca();
                aconteceuErro = true;
                JOptionPane.showMessageDialog(null, "Erro ao setar semestre: " + errou + ".");
            }

            if (aconteceuErro == false) {
                //seto o tipo dele
                if (view.jRadioButtonCarro.isSelected()) {
                    model.setTipo(TipoDeAutomovel.CARRO);
                }
                if (view.jRadioButtonOnibus.isSelected()) {
                    model.setTipo(TipoDeAutomovel.ONIBUS);
                }

                //e por fim cadastro ele
                //colocando no array de automoveis
                //olha la como funciona o cadastrar um automovel na classe CADASTRAR
                cadastrar.cadastrarAutomovel(model);
                JIFObjetosCadastradosController.update(model);

                JOptionPane.showMessageDialog(null, model.getTipoDoProduto() + " cadastrado com sussesso.");
            }

        }
    }
}
