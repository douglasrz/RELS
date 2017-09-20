/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Anderson
 */
public class NumeroInvalidoException extends Exception{
    private String erro;

    public NumeroInvalidoException(String erro, String mensagem) {
        super(mensagem);
        this.erro = erro;
    }

    
    public String getErro() {
        return erro;
    }
    
    
}
