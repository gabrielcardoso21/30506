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
public class AtaqueFisico implements CriadorClasse {
    @Override
    public Humano novoHumano(){
        return new Guerreiro();
    }
    @Override
    public Selvagem novoSelvagem(){
        return new Barbaro();
    }
    @Override
    public Alado novoAlado(){
        return new Sacerdote();
    }
    @Override
    public Abissal novoAbissal(){
        return new Mercenario();
    }
    @Override
    public Guardiao novoGuardiao(){
        return new Arcano();
    }
    @Override
    public Sombrio novoSombrio(){
        return new Retalhador();
    }
    
}
