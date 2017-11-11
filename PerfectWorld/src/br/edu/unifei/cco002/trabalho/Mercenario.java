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
public class Mercenario extends Abissal {
    private static final String arma = "Adaga";
    private boolean veneno;

    protected Mercenario() {
    }
    public static String getArma() {
        return arma;
    }
    public boolean isVeneno() {
        return veneno;
    }

    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }
      
}
