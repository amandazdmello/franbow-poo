package br.com.amandazdmello.franbowpoo.dominio;

public class Pocao extends Item {
    @Override
    public void usar(Personagem personagem) {
        super.usar(personagem);

        System.out.println("-----------------------------------------------------------");
        System.out.println(personagem.getNome() + " usou o item " + this.getNome());
        System.out.println("-----------------------------------------------------------");
        System.out.println();
    }
}
