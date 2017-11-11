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
public class Feiticeira extends Selvagem  {
    private ArmaMagicaEnum arma;
    private String pet;

    protected Feiticeira() {
        this.setGenero("feminino");
    }

    public ArmaMagicaEnum getArma() {
        return arma;
    }

    public void setArma(ArmaMagicaEnum arma) {
        this.arma = arma;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }
    
    
}
