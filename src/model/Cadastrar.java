package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import view.JIFCadastrarSolicitante;

/**
 *
 * @author Anderson
 */
public class Cadastrar {

    //essa classe serve para salvar as coisas que eu quero cadastrar em um arraylist
    private ArrayList<Sala> salas = new ArrayList();
    private ArrayList<Equipamento> equipamentos = new ArrayList();
    private ArrayList<Automovel> automoveis = new ArrayList();
    private ArrayList<Solicitante> solicitantes = new ArrayList();

    public Cadastrar() {
        super();
    }

    public void cadastrarAluno(Estudante solicitante) {
        // o metodo add() adiciona um solicitante no arrayliste de solicitantes
        solicitantes.add(solicitante);
        //JOptionPane.showMessageDialog(null, "Professor cadastrado com sussesso.");
        System.out.println("Pessoas cadastradas: " + getArrayDeSolicitantes().size());
    }

    public void cadastrarProfessor(Professor solicitante) {
        //a msm coisa de cima, so q aqui é um professor, so q como o array esta esperando um solicitante
        //então os alunos e professores ficam no msm array
        //estudante e professor estão extendendo de solicitante
        solicitantes.add(solicitante);
        //JOptionPane.showMessageDialog(null, "Estudante cadastrado com sussesso.");
        System.out.println("Pessoas cadastradas: " + getArrayDeSolicitantes().size());
    }

    public void cadastarEquipamento(Equipamento equip) {
        //adicionando um equipamento no array de equipamentos
        //eu to passando no metodo add('equip') pq é o nome da variavel do parametro esperado por esse metodo
        // q é do tipo equipamento, ou seja, quando alguem chamar o cadastrarEquipamento ele tem q receber
        //como parametro uma variavel do tipo equipamento
        //esse msm esplecação serve prus metodos de baixo
        //so q eles esperam receber variaveis de outros tipo: Sala ou Automovel

        equipamentos.add(equip);
        //JOptionPane.showMessageDialog(null, equip.getTipoDoProduto() + " cadastrado com sussesso.");
        System.out.println("Equipamentso cadastrados: " + equipamentos.size() + ". Tipo da equipamento cadastrada: " + equip.getTipo() + ". Seu id: " + equip.getID() + ".");
    }

    public void cadastrarSalas(Sala sala) {
        salas.add(sala);
        //JOptionPane.showMessageDialog(null, sala.getTipoDoProduto() + " cadastrado com sussesso.");

        System.out.println("Salas cadastrardas: " + salas.size() + ". Tipo da sala cadastrada: " + sala.getTipo() + ". Seu id: " + sala.getID() + ".");
    }

    public void cadastrarAutomovel(Automovel auto) {
        automoveis.add(auto);
        //JOptionPane.showMessageDialog(null, auto.getTipoDoProduto() + " cadastrado com sussesso.");
        System.out.println("Automoveis cadastrados: " + automoveis.size() + ". Tipo da automovel cadastrada: " + auto.getTipo() + ". Seu id: " + auto.getID() + ".");
    }

    //_________________________________________________________________________
    //Esse metodo aqui retorna o array pra quem quem quiser
    //é so chamar por exemplo o getArrayDeSolicitantes(), ai quem chamou esse metodo pode percorrer por ele
    //em busca de alguem em especifico q ele queira
    // o msm serve para os outro metodos q retornam um arraylist
    public ArrayList getArrayDeSolicitantes() {
        return solicitantes;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public ArrayList<Solicitante> getSolicitantes() {
        return solicitantes;
    }

}
