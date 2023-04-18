package br.com.amandazdmello.dominio;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

    private String nome;
    private List<Item> itens = new ArrayList<>();

    public void mostrarInformacoes() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Personagem: " + this.nome);

        System.out.print("Lista de Itens: ");
        if (this.itens.isEmpty()) {
            System.out.print("Nenhum item!");
        } else {
            this.itens.forEach(item -> System.out.print(item.getNome() + ", "));
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println();
    }

    public void abrirObjeto(Objeto objeto) {
        System.out.println("-----------------------------------------------------------");
        System.out.println(this.nome + " abriu um " + objeto.getNome() + "!");
        if (objeto.getItem() == null) {
            System.out.println("O " + objeto.getNome() + " está vazio!");
            System.out.println("-----------------------------------------------------------");
            System.out.println();
        } else {
            System.out.println("O " + objeto.getNome() + " contém um item!");
            System.out.println("Nome: " + objeto.getItem().getNome());
            System.out.println("Descrição: " + objeto.getItem().getDescricao());
            System.out.println("-----------------------------------------------------------");
            System.out.println();
            objeto.getItem().coletar(this);
        }
    }

    public void usarItem() {
        this.itens.iterator().next().usar(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
