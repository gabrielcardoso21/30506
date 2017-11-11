/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco002.trabalho;

/**
 *
 * @author ASUS
 */
public class Tormentador extends Sombrio {
    private static final String arma = "Foice";
    private boolean clone;
    
    protected Tormentador(){}

    public static String getArma() {
        return arma;
    }
    
    public boolean isClone() {
        return clone;
    }

    public void setClone(boolean clone) {
        this.clone = clone;
    }
    

}
