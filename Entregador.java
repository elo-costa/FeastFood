package model;

public class Entregador extends Usuario {

    public Entregador(String nome, String email) {
        super(nome, email);
    }

    public void realizarEntrega() {
        System.out.println("Entregador " + getNome()
                + " está responsável pela entrega.");
    }
}