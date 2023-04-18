package br.com.amandazdmello.franbowpoo;

import br.com.amandazdmello.franbowpoo.dominio.*;

public class Main {
    public static void main(String[] args) {
        Tesoura tesoura = new Tesoura();
        tesoura.setNome("Tesoura de Prata");
        tesoura.setDescricao("Uma tesoura de prata grande.");

        Pocao pocaoDeVida = new Pocao();
        pocaoDeVida.setNome("Poção de Vida");
        pocaoDeVida.setDescricao("Poção de cor vermelha que recupera vida.");

        Objeto bauDeBronze = new Objeto();
        bauDeBronze.setNome("Baú de Bronze");

        Objeto bauDePrata = new Objeto();
        bauDePrata.setNome("Baú de Prata");
        bauDePrata.setItem(pocaoDeVida);

        Objeto bauDeOuro = new Objeto();
        bauDeOuro.setNome("Baú de Ouro");
        bauDeOuro.setItem(tesoura);

        Personagem protagonista = new Personagem();
        protagonista.setNome("Fran Bow");

        Personagem antagonista = new Personagem();
        antagonista.setNome("Remor");

        Jogo jogo = new Jogo();
        jogo.setNome("Fran Bow");
        jogo.getPersonagens().add(protagonista);
        jogo.getPersonagens().add(antagonista);
        jogo.getObjetos().add(bauDeBronze);
        jogo.getObjetos().add(bauDePrata);
        jogo.getObjetos().add(bauDeOuro);

        jogo.mostrarInformacoes();

        protagonista.mostrarInformacoes();

        protagonista.abrirObjeto(bauDeBronze);
        protagonista.abrirObjeto(bauDePrata);
        protagonista.abrirObjeto(bauDeOuro);

        protagonista.mostrarInformacoes();

        protagonista.usarItem();

        protagonista.mostrarInformacoes();

        protagonista.usarItem();

        protagonista.mostrarInformacoes();
    }
}