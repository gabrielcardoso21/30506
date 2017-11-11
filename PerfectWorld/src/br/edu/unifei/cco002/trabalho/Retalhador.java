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
public class Retalhador extends Sombrio {
    private static final String arma = "Sabre";
    private String habilidadeCopiada;
    
    protected Retalhador(){}

    public static String getArma() {
        return arma;
    }

    public String getHabilidadeCopiada() {
        return habilidadeCopiada;
    }

    public void setHabilidadeCopiada(String habilidadeCopiada) {
        this.habilidadeCopiada = habilidadeCopiada;
    }   
    
}
