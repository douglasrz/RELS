package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anderson
 */
public class Professor extends Solicitante{
    
    private String especializacao;
    private String grauDeEscolaridade;

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getGrauDeEscolaridade() {
        return grauDeEscolaridade;
    }

    public void setGrauDeEscolaridade(String grauDeEscolaridade) {
        this.grauDeEscolaridade = grauDeEscolaridade;
    }
    
    public void exibir(){
        System.out.println("Nome: " + getNome() + ".");
        System.out.println("E-mail: " + getEmail() + ".");
        System.out.println("Telefone: " + getTelefone() + ".");
        System.out.println("Especialização: " + getEspecializacao() + ".");
        System.out.println("Grau de Escolaridade: " + getGrauDeEscolaridade() + ".");
    }
    
}
