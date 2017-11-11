/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco002.trabalho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carla
 */
public abstract class Ser {
    private String nome;
    private static final String origem = "Vale Celestial";
    private CapitalEnum capital;
    private int nivel;
    private String casal;
    private String titulo;
    private String cla;
    private String cultivo;
    private int fama;
    private int inteligencia;
    private int destreza;
    private int concentracao;
    private int forca;
    private boolean playerkill;
    private List <Montaria> montarias = new ArrayList <>();
    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Montaria> getMontarias() {
        return montarias;
    }

    public void setMontarias(List<Montaria> montarias) {
        this.montarias = montarias;
    }
    public static String getOrigem(){
        return origem;
    }
    
    public CapitalEnum getCapital() {
        return capital;
    }

    public void setCapital(CapitalEnum capital) {
        this.capital = capital;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCasal() {
        return casal;
    }

    public void setCasal(String casal) {
        this.casal = casal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public String getCultivo() {
        return cultivo;
    }

    public void setCultivo(String cultivo) {
        this.cultivo = cultivo;
    }

    public int getFama() {
        return fama;
    }

    public void setFama(int fama) {
        this.fama = fama;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(int concentracao) {
        this.concentracao = concentracao;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public boolean isPlayerkill() {
        return playerkill;
    }

    public void setPlayerkill(boolean playerkill) {
        this.playerkill = playerkill;
    }
    
    
    
}
