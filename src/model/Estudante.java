package model;

import java.util.InputMismatchException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anderson
 */
public class Estudante extends Solicitante {

    public Estudante() {
        super();
    }

    private String curso;
    private int semestre;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public void exibir() {
        System.out.println("Nome: " + getNome() + ".");
        System.out.println("Matricula: " + getMatricula() + ".");
        System.out.println("E-mail: " + getEmail() + ".");
        System.out.println("Telefone: " + getTelefone() + ".");
        System.out.println("Curso: " + getCurso() + ".");
        System.out.println("Semestre: " + getSemestre() + ".");

    }

}
