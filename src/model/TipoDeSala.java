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
public enum TipoDeSala{
    SDL("Sala de aula"), LDF("Laboratorio de fisica"), LDQ("Laboratorio de quimica"), LDI("Laboratorio de informática"), AUD("Auditorio");
    
    private final String tipo;
            
    
    TipoDeSala(String tipo){
        this.tipo = tipo;
    }
    
}
