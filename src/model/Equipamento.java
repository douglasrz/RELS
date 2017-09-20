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
public class Equipamento extends Solicitavel {

    public Equipamento() {
        super();
        Solicitavel.setTotal();
        setId(getTotal());

        System.out.println("total: " + Solicitavel.getTotal());

    }

    private TipoDeEquipamentos tipo;
    private boolean sendoUsado;

    public TipoDeEquipamentos getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeEquipamentos tipo) {
        this.tipo = tipo;
    }

    public boolean isSendoUsado() {
        return sendoUsado;
    }

    public void setSendoUsado(boolean sendoUsado) {
        this.sendoUsado = sendoUsado;
    }

    @Override
    public String getTipoDoProduto() {
        return getTipo().toString();
    }
}
