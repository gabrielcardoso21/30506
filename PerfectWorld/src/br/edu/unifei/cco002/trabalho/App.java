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
public class App {
    public static void main(String[] args) {
  
        AtaqueFisico ab = new AtaqueFisico();
        Mercenario p2 = (Mercenario) ab.novoAbissal();
        System.out.println("Classe:" +p2.getClass());       
        p2.setNome("Maria");
        System.out.println("Nome:" + p2.getNome());
        System.out.println("Origem: " +p2.getOrigem());
        p2.setCapital(CapitalEnum.CIDADE_DAS_TORMENTAS);
        System.out.println("Capital: " +p2.getCapital());
        p2.setNivel(20);
        System.out.println("Nivel: " +p2.getNivel());
        p2.setCasal("Joao");
        System.out.println("Casal: " +p2.getCasal());
        p2.setTitulo("Mestre Desbravador");
        System.out.println("Titulo: " +p2.getTitulo());
        p2.setCla("Mestres123");
        System.out.println("Cla: " +p2.getCla());
        p2.setCultivo("Astuto");
        System.out.println("Cultivo: " +p2.getCultivo());
        p2.setFama(90);
        System.out.println("Fama: " +p2.getFama());
        p2.setInteligencia(8);
        System.out.println("Inteligencia: " +p2.getInteligencia());
        p2.setDestreza(20);
        System.out.println("Destreza: " +p2.getDestreza());
        p2.setConcentracao(15);
        System.out.println("Concentracao:" +p2.getConcentracao());
        p2.setForca(17);
        System.out.println("Forca: " +p2.getForca());
        p2.setPlayerkill(false);
        System.out.println("PlayerKill: " +p2.isPlayerkill());
        p2.setGenero("feminino");
        System.out.println("Genero: " +p2.getGenero());
        MontariaTerrestre r = new MontariaTerrestre();
        r.setTipo("Cavalo");
        r.setVelocidade(20);
        r.setResistencia(40);
        p2.getMontarias().add(r);
        MontariaAlada e = new MontariaAlada();
        e.setTipo("Espada Voadora");
        e.setVelocidade(72);
        p2.getMontarias().add(e);
        for (int h=0 ; h< p2.getMontarias().size();h++){   
            if (p2.getMontarias().get(h) instanceof MontariaTerrestre){
                System.out.println("Montaria Terrestre: " + ((MontariaTerrestre)p2.getMontarias().get(h)).getTipo() +
                                    "\n -Velocidade: " +((MontariaTerrestre)p2.getMontarias().get(h)).getVelocidade()+
                                    "\n -Resistencia: " + ((MontariaTerrestre)p2.getMontarias().get(h)).getResistencia());
            } else if (p2.getMontarias().get(h) instanceof MontariaAlada){
                System.out.println("Montaria Alada: " + ((MontariaAlada)p2.getMontarias().get(h)).getTipo() +
                                    "\n -Velocidade: "+  ((MontariaAlada)p2.getMontarias().get(h)).getVelocidade());
            }
        }
        System.out.println("Arma Equipada:" +p2.getArma());
        p2.setVeneno(true);
        if (p2.isVeneno() == true){
            System.out.println("Equipado com Veneno");
        } else{
            System.out.println("Nao Equipado com Veneno");
        }
        p2.setVelocidadeNado(10);
        System.out.println("Velocidade de Nado: " + p2.getVelocidadeNado());
        
        System.out.println("\n--------------------------------------------------------------------------------\n");
        
        HabilidadeArcana ac = new HabilidadeArcana();
        Feiticeira p3 = (Feiticeira) ac.novoSelvagem();
        System.out.println("Classe:" +p3.getClass());
        p3.setNome("Mara");
        System.out.println("Nome: "+p3.getNome());
        System.out.println("Origem:" +p3.getOrigem());
        p3.setCapital(CapitalEnum.CIDADE_DAS_FERAS);
        System.out.println("Capital: "+p3.getCapital());
        p3.setNivel(30);
        System.out.println("Nivel: "+p3.getNivel());
        p3.setCasal("Nenhum");
        System.out.println("Casal:" +p3.getCasal());
        p3.setTitulo("Vidente Onisciente");
        System.out.println("Titulo:" +p3.getTitulo());
        p3.setCla("Desbravadores");
        System.out.println("Cla: " +p3.getCla());
        p3.setCultivo("Lucido");
        System.out.println("Cultivo: " +p3.getCultivo());
        p3.setFama(100);
        System.out.println("Fama:" +p3.getFama());
        p3.setInteligencia(25);
        System.out.println("Inteligencia: " +p3.getInteligencia());
        p3.setDestreza(9);
        System.out.println("Destreza: " +p3.getDestreza());
        p3.setConcentracao(10);
        System.out.println("Concentracao: " +p3.getConcentracao());
        p3.setForca(5);
        System.out.println("Forca: "+p3.getForca());
        p3.setPlayerkill(false);
        System.out.println("PlayerKill: " +p3.isPlayerkill());
        System.out.println("Genero: " +p3.getGenero());
        MontariaTerrestre x = new MontariaTerrestre();
        r.setTipo("Tigre Branco");
        r.setVelocidade(65);
        r.setResistencia(50);
        p3.getMontarias().add(r);
        MontariaTerrestre y = new MontariaTerrestre();
        y.setTipo("Pantera Negra");
        y.setVelocidade(67);
        y.setResistencia(53);
        p3.getMontarias().add(y);
        MontariaAlada i = new MontariaAlada();
        i.setTipo("Manta");
        i.setVelocidade(80);
        p3.getMontarias().add(i);
        for (int j=0 ; j< p3.getMontarias().size();j++){   
            if (p3.getMontarias().get(j) instanceof MontariaTerrestre){
                System.out.println("Montaria Terrestre: " + ((MontariaTerrestre)p3.getMontarias().get(j)).getTipo() +
                                    "\n -Velocidade: " +((MontariaTerrestre)p3.getMontarias().get(j)).getVelocidade()+
                                    "\n -Resistencia: " + ((MontariaTerrestre)p3.getMontarias().get(j)).getResistencia());
            } else if (p3.getMontarias().get(j) instanceof MontariaAlada){
                System.out.println("Montaria Alada: " + ((MontariaAlada)p3.getMontarias().get(j)).getTipo() +
                                    "\n -Velocidade: "+  ((MontariaAlada)p3.getMontarias().get(j)).getVelocidade());
            }
        }
        p3.setArma(ArmaMagicaEnum.RODA);
        System.out.println("Arma Equipada: " + p3.getArma());
        p3.setPet("Guerreiro de Pedra");
        System.out.println("Pet: "+ p3.getPet());
        p3.setModo("animal");
        if ((p3.getEstado()) instanceof Animal){
            System.out.println("Modo: Animal" );
        } else if ((p3.getEstado()) instanceof Humanoide){
            System.out.println("Modo: Humanoide");
        }
        ((Animal)p3.getEstado()).setTipo("Raposa");
        ((Animal)p3.getEstado()).setVelocidadeCorrida(55);
        System.out.println(" -Especie:" +((Animal)p3.getEstado()).getTipo());
        System.out.println(" -Velocidade de Corrida:" +((Animal)p3.getEstado()).getVelocidadeCorrida());
        
        p3.setModo("humanoide");
        if ((p3.getEstado()) instanceof Animal){
            System.out.println("Modo: Animal" );
        } else if ((p3.getEstado()) instanceof Humanoide){
            System.out.println("Modo: Humanoide");
        }
        ((Humanoide)p3.getEstado()).setSkillPassiva("Protecao das Feras");
        System.out.println(" -Skill Passiva:" +((Humanoide)p3.getEstado()).getSkillPassiva());
        
        
        
        
        
        
        
        
    }
    
}
