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
public class Automovel extends Solicitavel {

    public Automovel() {
        super();
        Solicitavel.setTotal();
        setId(getTotal());
        
        System.out.println("total: "+ Solicitavel.getTotal());
    }
    
    private TipoDeAutomovel tipo;
    private String placa;


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoDeAutomovel getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeAutomovel tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipoDoProduto() {
        return getTipo().toString();
    }

    

}
