/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import model.Estudante;
import model.Cadastrar;

/**
 *
 * @author Anderson
 */
public class JIFCadastrarEstudanteController {

    private JIFPessoasCadastradasController controllerDaTabela;
    private JIFCadastrarEstudante view;
    private Estudante model;
    private Cadastrar cadastro;

    public JIFCadastrarEstudanteController(JIFPessoasCadastradasController controllerDaTabela, JIFCadastrarEstudante view, Cadastrar cadastro) {
        this.view = view;
        this.cadastro = cadastro;
        this.controllerDaTabela = controllerDaTabela;
    }

    public void getEvent(ActionEvent evento) {
        if (evento.getActionCommand().equals("Cadastar")) {

            this.model = new Estudante();

            boolean aconteceuOErro = false;

            model.setNome(view.getTxtNome());
            model.setCurso(view.getTxtCurso());
            model.setEmail(view.getTxtEmail());
            model.setTelefone(view.getTxtTelefone());

            try {
                model.setMatricula(Integer.parseInt(view.getTxtMatricula()));

            } catch (NumberFormatException erro) {
                String errou = view.getTxtMatricula();
                aconteceuOErro = true;
                JOptionPane.showMessageDialog(null, "Error ao setar matricula. Erro: " + errou + ".");
                erro.getMessage();
            }

            try {
                model.setSemestre(Integer.parseInt(view.getTxtSemestre()));

            } catch (NumberFormatException erro) {
                String errou = view.getTxtSemestre();
                aconteceuOErro = true;
                JOptionPane.showMessageDialog(null, "Erro ao setar semestre: " + errou + ".");
                erro.getMessage();
            }

            if (aconteceuOErro == false) {
                cadastro.cadastrarAluno(model);
                controllerDaTabela.update();
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sussesso.");

                view.txtNome.setText("");
                view.txtCurso.setText("");
                view.txtEmail.setText("");
                view.txtMatricula.setText("");
                view.txtTelefone.setText("");
                view.txtSemestre.setText("");
            }

        }
    }
}
