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
public enum TipoDeAutomovel{
    ONIBUS(30),CARRO(4);
    
    public int numerosDePassageiro;
    
    TipoDeAutomovel(int qtd){
        numerosDePassageiro = qtd;
    }
    
}