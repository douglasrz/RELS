/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import view.JIFSolicitarReserva;

/**
 *
 * @author Anderson
 */
public class Solicitacoes {

    private JIFSolicitarReserva view;
    private Solicitante solicitante;
    private Solicitavel solicitavel;
    private Data dataInicioDoEmprestipo;
    private Data dataFimDoEmprestimo;

    ArrayList<Solicitante> listasDeSolicitantes = new ArrayList();
    ArrayList<Solicitavel> listasDeSolicitaveis = new ArrayList();
    ArrayList<Data> listasDeDataInicio = new ArrayList();
    ArrayList<Data> listasDeDataFim = new ArrayList();

    //Essa classe serve para armazenar as solicitacoes feitas
    //se alguem solicitou por exemplo uma sala então eu armazeno quem solicitou a sala
    //qual a sala q ele pegou, a data de inicio do emprestio e a data final
    //e armazeno tudo isso em seu determinado array
    public void solicitar(Solicitavel solicitavel, Solicitante solicitante, Data dataInicioDoEmprestipo, Data dataFimDoEmprestimo) {
        listasDeSolicitantes.add(solicitante);
        listasDeSolicitaveis.add(solicitavel);
        listasDeDataInicio.add(dataInicioDoEmprestipo);
        listasDeDataFim.add(dataFimDoEmprestimo);
    }

    public void devolver(int posicao) {
        listasDeSolicitantes.remove(posicao);//retirei a coisa solicitadas
        listasDeSolicitaveis.remove(posicao);//retirei o cara q tava com ela
        listasDeDataInicio.remove(posicao);//retirei a data fim
        listasDeDataFim.remove(posicao);//retirei a data inicio
    }

    public ArrayList<Solicitante> getListasDeSolicitantes() {
        return listasDeSolicitantes;
    }

    public void setListasDeSolicitantes(ArrayList<Solicitante> listasDeSolicitantes) {
        this.listasDeSolicitantes = listasDeSolicitantes;
    }

    public ArrayList<Solicitavel> getListasDeSolicitaveis() {
        return listasDeSolicitaveis;
    }

    public void setListasDeSolicitaveis(ArrayList<Solicitavel> listasDeSolicitaveis) {
        this.listasDeSolicitaveis = listasDeSolicitaveis;
    }

    public ArrayList<Data> getListasDeDataInicio() {
        return listasDeDataInicio;
    }

    public void setListasDeDataInicio(ArrayList<Data> listasDeDataInicio) {
        this.listasDeDataInicio = listasDeDataInicio;
    }

    public ArrayList<Data> getListasDeDataFim() {
        return listasDeDataFim;
    }

    public void setListasDeDataFim(ArrayList<Data> listasDeDataFim) {
        this.listasDeDataFim = listasDeDataFim;
    }

}
