/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import model.Professor;
import model.Cadastrar;

/**
 *
 * @author Anderson
 */
public class JIFCadastrarProfessorController {

    private JIFPessoasCadastradasController controllerDaTabela;
    private JIFCadastrarProfessor view;
    private Professor model;
    private Cadastrar solicitacoes;

    public JIFCadastrarProfessorController(JIFPessoasCadastradasController controllerDaTabela, JIFCadastrarProfessor view, Cadastrar solicitacoes) {
        this.view = view;
        this.solicitacoes = solicitacoes;
        this.controllerDaTabela = controllerDaTabela;
    }

    public void getEvent(ActionEvent evento) {
        if (evento.getActionCommand().equals("Cadastrar")) {

            this.model = new Professor();

            boolean aconteceuOErro = false;

            model.setNome(view.getTxtNome());
            model.setEmail(view.getTxtEmail());
            model.setEspecializacao(view.getTxtEspecializacao());
            model.setTelefone(view.getTxtTelefone());
            model.setGrauDeEscolaridade(view.getTxtEscolaridade());

            try {
                model.setMatricula(Integer.parseInt(view.getTxtMatricula()));
            } catch (NumberFormatException erro) {
                aconteceuOErro = true;
                String errou = view.getTxtMatricula();
                JOptionPane.showMessageDialog(null, "Error ao setar matricula. Erro: " + errou + ".");
            }

            if (aconteceuOErro == false) {
                solicitacoes.cadastrarProfessor(model);
                controllerDaTabela.update();
                JOptionPane.showMessageDialog(null, "Professor cadastrado com sussesso.");

                view.txtNome.setText("");
                view.txtEmail.setText("");
                view.txtMatricula.setText("");
                view.txtTelefone.setText("");
                view.txtEscolaridade.setText("");
                view.txtEspecializacao.setText("");
            }

        }
    }
}
