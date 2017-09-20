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
public abstract class Solicitavel {

    //Data cosa = new Data();
    
    
    private static int total = 0;
    private int id;

    public static int getTotal() {
        return total;
    }

    public static void setTotal() {
        Solicitavel.total = total + 1;
    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract String getTipoDoProduto();
}
