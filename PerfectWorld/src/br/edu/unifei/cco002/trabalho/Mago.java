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
public class Mago extends Humano {
    private ArmaMagicaEnum arma;

    protected Mago() {   
    }

    public ArmaMagicaEnum getArma() {
        return arma;
    }

    public void setArma(ArmaMagicaEnum arma) {
        this.arma = arma;
    }
    
    
}
