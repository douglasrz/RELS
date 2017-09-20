/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import model.Cadastrar;
import model.Solicitacoes;

/**
 *
 * @author Anderson
 */
public class JFramePrincipalController {

    private JFramePrincipal view;
    private Cadastrar cadastro = new Cadastrar();
    private Solicitacoes solicitacao = new Solicitacoes();

    //criando minhas views logo tudo quando o programa inicia
    JIFObjetosCadastrados viewObjetosCadastrados = new JIFObjetosCadastrados(cadastro);
    JIFCadastrarAutomovel viewAutomovel = new JIFCadastrarAutomovel( cadastro);
    JIFCadastrarSala viewCadastrarSala = new JIFCadastrarSala( cadastro);
    JIFCadastrarEquipamento viewEquipamento = new JIFCadastrarEquipamento( cadastro);
    
    JIFPessoasCadastradas viewPessoasCadastradas = new JIFPessoasCadastradas(cadastro);
    JIFCadastrarProfessor viewCadastrarProfessor = new JIFCadastrarProfessor(viewPessoasCadastradas.getController(), cadastro);

    JIFReservasFeitas viewReservasFeitas = new JIFReservasFeitas(solicitacao);
    JIFSolicitarReserva viewSolicitarReserva = new JIFSolicitarReserva(viewReservasFeitas.getController(), solicitacao, cadastro);
    JIFSolicitarDevolucao viewDevolucao = new JIFSolicitarDevolucao(viewReservasFeitas.getController(), cadastro, solicitacao);

    JIFCadastrarEstudante viewCadastrarEstudante = new JIFCadastrarEstudante(viewPessoasCadastradas.getController(), cadastro);

    public JFramePrincipalController(JFramePrincipal view) {
        this.view = view;
    }

    public void getEvent(ActionEvent evento) {
        if (evento.getSource().equals(view.getjMenuItemEstudante())) {
            //Clicou naquele menuzinho cadastar e escolheu o submenu estudante

            //adicionou ela a area de trabalho do programa
            view.getJdpPrincipal().add(viewCadastrarEstudante);

            //e deixou ela visivel
            viewCadastrarEstudante.setVisible(true);

            //A MSM COISA PROS EVENTOS ABAIXO
            //É A MSM LOGICA
        }

        if (evento.getSource().equals(view.getjMenuItemAutomovel())) {

            view.getJdpPrincipal().add(viewAutomovel);
            viewAutomovel.setVisible(true);
        }

        if (evento.getSource().equals(view.getjMenuItemDevolucao())) {

            view.getJdpPrincipal().add(viewDevolucao);
            viewDevolucao.setVisible(true);
        }

        if (evento.getSource().equals(view.getjMenuItemDisponibilidade())) {
            view.getJdpPrincipal().add(viewObjetosCadastrados);
            viewObjetosCadastrados.setVisible(true);
        }

        if (evento.getSource().equals(view.getjMenuItemEquipamento())) {

            view.getJdpPrincipal().add(viewEquipamento);
            viewEquipamento.setVisible(true);
        }

        if (evento.getSource().equals(view.getjMenuItemPessoasCadastradas())) {

            view.getJdpPrincipal().add(viewPessoasCadastradas);
            viewPessoasCadastradas.setVisible(true);
        }

        if (evento.getSource().equals(view.getjMenuItemProfessor())) {

            view.getJdpPrincipal().add(viewCadastrarProfessor);
            viewCadastrarProfessor.setVisible(true);
        }

        if (evento.getSource().equals(view.getjMenuItemReserva())) {

            view.getJdpPrincipal().add(viewSolicitarReserva);
            viewSolicitarReserva.setVisible(true);
        }

        if (evento.getSource().equals(view.getjMenuItemReservados())) {

            view.getJdpPrincipal().add(viewReservasFeitas);
            viewReservasFeitas.setVisible(true);
        }
        if (evento.getSource().equals(view.getjMenuItemSala())) {

            view.getJdpPrincipal().add(viewCadastrarSala);
            viewCadastrarSala.setVisible(true);
        }
    }
}
