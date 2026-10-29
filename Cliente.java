
package model;

public class Cliente extends Usuario {

    public Cliente(String nome, String email) {
        super(nome, email);
    }

    public void realizarPedido() {
        System.out.println("Cliente " + getNome()
                + " realizou um pedido.");
    }
}
