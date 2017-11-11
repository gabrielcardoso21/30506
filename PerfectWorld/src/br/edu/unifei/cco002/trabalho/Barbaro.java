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
public class Barbaro extends Selvagem {

    private ArmaPesadaEnum arma;
    
    protected Barbaro() {
        this.setGenero("masculino");
    }

    public ArmaPesadaEnum getArma() {
        return arma;
    }

    public void setArma(ArmaPesadaEnum arma) {
        this.arma = arma;
    }
    
}
