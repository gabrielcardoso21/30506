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
public class Espiritualista extends Abissal {
    private static final String arma = "Orbe";
    private boolean paralizaOponente ;
    
    protected Espiritualista(){
    }
    
    public static String getArma() {
        return arma;
    }

    public boolean isParalizaOponente() {
        return paralizaOponente;
    }

    public void setParalizaOponente(boolean paralizaOponente) {
        this.paralizaOponente = paralizaOponente;
    }
    
}
