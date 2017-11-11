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
public class Mistico extends Guardiao {
    private ArmaMagicaEnum arma;
    private boolean petElementar;
    private int skillCura;
    
    protected Mistico(){}

    public ArmaMagicaEnum getArma() {
        return arma;
    }

    public void setArma(ArmaMagicaEnum arma) {
        this.arma = arma;
    }

    public boolean isPetElementar() {
        return petElementar;
    }

    public void setPetElementar(boolean petElementar) {
        this.petElementar = petElementar;
    }

    public int getSkillCura() {
        return skillCura;
    }

    public void setSkillCura(int skillCura) {
        this.skillCura = skillCura;
    }
    
}

