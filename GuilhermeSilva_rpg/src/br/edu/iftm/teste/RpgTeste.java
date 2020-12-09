package br.edu.iftm.teste;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;
import br.edu.iftm.rpg.Inimigo;

public class RpgTeste {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Guilherme", 100, 20);
        Inimigo inimigo = new Inimigo("vampiro", 50, 10);
        Inimigo inimigo2 = new Inimigo("Monstro Azul", 50, 20);
        Luta luta = new Luta();
        luta.enfrentar(jogador, inimigo);
        luta.enfrentar(jogador, inimigo2);   
    }
}
