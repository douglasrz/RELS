/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import model.Cadastrar;
import model.Sala;
import model.TipoDeSala;

/**
 *
 * @author Anderson
 */
public class JIFCadastrarSalaController {

    private JIFCadastrarSala view;
    private Cadastrar cadastro;
    private Sala model;

    public JIFCadastrarSalaController(JIFCadastrarSala view, Cadastrar cadastro) {
        this.view = view;
        this.cadastro = cadastro;
    }

    public void getEvent(ActionEvent evento) {

        if (evento.getActionCommand().equals("Cadastrar")) {
            model = new Sala();

            boolean aconteceuErro = false;

            try {
                model.setNumeroDaSala(Integer.parseInt(view.getTxtNumSala()));
            } catch (NumberFormatException erro) {
                aconteceuErro = true;
                String errou = view.getTxtNumSala();
                JOptionPane.showMessageDialog(null, "Error ao setar o numero da sala. Erro: " + errou + ".");
            }

            if (aconteceuErro == false) {
                if (view.jRadioButtonLDF.isSelected()) {
                    model.setTipo(TipoDeSala.LDF);
                }

                if (view.jRadioButtonLDQ.isSelected()) {
                    model.setTipo(TipoDeSala.LDQ);
                }

                if (view.jRadioButtonSDL.isSelected()) {
                    model.setTipo(TipoDeSala.SDL);
                }

                if (view.jRadioButtonLDI.isSelected()) {
                    model.setTipo(TipoDeSala.LDI);
                }

                if (view.jRadioButtonAUD.isSelected()) {
                    model.setTipo(TipoDeSala.AUD);
                }

                cadastro.cadastrarSalas(model);
                JIFObjetosCadastradosController.update(model);

                JOptionPane.showMessageDialog(null, model.getTipoDoProduto() + " cadastrado com sussesso.");
            }

        }
    }
}
