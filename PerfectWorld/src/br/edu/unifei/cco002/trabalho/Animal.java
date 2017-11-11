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
public class Animal implements Estado {
    private String tipo;
    private int velocidadeCorrida;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidadeCorrida() {
        return velocidadeCorrida;
    }

    public void setVelocidadeCorrida(int velocidadeCorrida) {
        this.velocidadeCorrida = velocidadeCorrida;
    }
    
    
}
