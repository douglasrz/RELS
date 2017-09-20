package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author Anderson
 */
public class TestandoEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**Scanner in = new Scanner(System.in);
        System.out.println("Entre com: SMALL, MEDIUN, LARGE.");
        
        String input = in.nextLine().toUpperCase();
        
        Size size = Enum.valueOf(Size.class, input);
        Size tamanho = Enum.valueOf(Size.class, input);
        
        System.out.println("Tamanho: " + size);
        System.out.println("Abreviação: " + size.getAbreviacao());**/
        
        /**for(Salas tipos : Salas.values()){
            System.out.printf("%s\t%s\n", tipos, tipos.getTipo());
        }**/
        
        /**Scanner in = new Scanner(System.in);
        System.out.println("Entre com o tipo da Sala: SDL, LDQ, LDF, LDI, AUD.");
        
        String input = in.nextLine().toUpperCase();
        
        TipoDeSala tipoDaSala = Enum.valueOf(TipoDeSala.class, input);
        
        System.out.println("Entre com o número da sala: ");
        
        tipoDaSala.setNumeroDaSala(in.nextInt());
            
        System.out.println("O tipo da sala é " + tipoDaSala.getTipo() + ".");
        
        
        //System.out.println("O tipo da sala é " + tipoDaSala.getTipo());
        System.err.println("O número da sala é " + tipoDaSala.getNumeroDaSala() + ".");
        //System.out.println("O tipo da sala é " + tipoDaSala.getTipo());
        **/
        
    }
    
}
