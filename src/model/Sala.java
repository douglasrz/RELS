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
public class Sala extends Solicitavel {

    public Sala() {
        super();
        Solicitavel.setTotal();
        setId(getTotal());

        System.out.println("total: " + Solicitavel.getTotal());

    }

    private TipoDeSala tipo;
    private int numeroDaSala;

    public TipoDeSala getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeSala tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    @Override
    public String getTipoDoProduto() {
        return getTipo().toString();
    }

}
