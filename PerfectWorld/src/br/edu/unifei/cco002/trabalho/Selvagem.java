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
public abstract class Selvagem extends Ser{
    public static boolean voo = false;
    private String modo = "humanoide";
    private Estado estado = new Humanoide();

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
        if (modo == "humanoide" && estado instanceof Animal){
            estado = new Humanoide();
        }else if (modo == "animal" && estado instanceof Humanoide){
            estado = new Animal();
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
