package br.com.amandazdmello.dominio;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private String nome;
    private List<Personagem> personagens = new ArrayList<>();
    private List<Objeto> objetos = new ArrayList<>();

    public void mostrarInformacoes() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Jogo: " + this.nome);

        System.out.print("Personagens: ");
        this.personagens.forEach(personagem -> System.out.print(personagem.getNome() + ", "));
        System.out.println();

        System.out.print("Objetos: ");
        this.objetos.forEach(objeto -> System.out.print(objeto.getNome() + ", "));
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objeto> objetos) {
        this.objetos = objetos;
    }
}
