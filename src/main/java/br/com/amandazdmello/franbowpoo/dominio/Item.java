package br.com.amandazdmello.franbowpoo.dominio;

public class Item {

    private String nome;
    private String descricao;

    public void usar(Personagem personagem) {
        personagem.getItens().remove(this);
    }

    public void coletar(Personagem personagem) {
        personagem.getItens().add(this);

        System.out.println("-----------------------------------------------------------");
        System.out.println(personagem.getNome() + " coletou o item " + this.nome);
        System.out.println("-----------------------------------------------------------");
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
