package br.edu.iftm.rpg;

public class Luta {

   public void enfrentar(Jogador jogador, Inimigo inimigo){
    System.out.format("O jogador %s está enfrentado na luta o inimigo %s no momento.",jogador.getNome(),inimigo.getNome());
    jogador.atacar(inimigo);
    inimigo.atacar(jogador);
   }
}
