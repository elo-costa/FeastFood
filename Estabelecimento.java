package model;

public class Estabelecimento extends Usuario {

    public Estabelecimento(String nome, String email) {
        super(nome, email);
    }

    public void exibirEstabelecimento() {
        System.out.println("Estabelecimento: " + getNome());
    }
}