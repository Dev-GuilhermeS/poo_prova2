package br.edu.iftm.rpg;

public class Inimigo {
// Atributos

private String nome;
private int vida;
private int dano;

// construtor

public Inimigo (String nome, int vida, int dano){
    this.nome = nome;
    this.vida = vida;
    this.dano = dano;
}  

// Métodos

public void atacar (Jogador jogador){
System.out.format ("\n%s atacou o %s com dano %d.\n", nome, jogador.getNome(),dano);
jogador.perderVida (dano);
 }

public void perderVida (int pontos){
System.out.format ("\nInimigo %s perdeu %d pontos de vida.\n", nome, pontos);
vida = vida - pontos;
if(vida <= 0){
System.out.println ("O Monstro Morreu.\n");
 }   
}
    
  
// getters e setters 

public String getNome() {
    return nome;
 }
public int getDano() {
     return dano;
 }

}
