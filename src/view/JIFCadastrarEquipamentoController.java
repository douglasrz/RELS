/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import model.Cadastrar;
import model.Equipamento;
import model.TipoDeEquipamentos;

/**
 *
 * @author Anderson
 */
public class JIFCadastrarEquipamentoController {

    private JIFCadastrarEquipamento view;
    private Equipamento model;
    private Cadastrar cadastro;

    public JIFCadastrarEquipamentoController(JIFCadastrarEquipamento view, Cadastrar cadastro) {
        this.view = view;
        this.cadastro = cadastro;
    }

    public void getEvent(ActionEvent evento) {
        if (evento.getActionCommand().equals("Cadastrar")) {
            
            model = new Equipamento();

            if (view.jRadioButtonDataShow.isSelected()) {
                model.setTipo(TipoDeEquipamentos.DATASHOW);
            }
            if (view.jRadioButtonNotebok.isSelected()) {
                model.setTipo(TipoDeEquipamentos.NOTEBOOK);
            }
            cadastro.cadastarEquipamento(model);
            JIFObjetosCadastradosController.update(model);
            JOptionPane.showMessageDialog(null, model.getTipoDoProduto() + " cadastrado com sussesso.");
        }
    }

}
