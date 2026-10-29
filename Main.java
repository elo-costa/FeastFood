
package app;

import model.Cliente;
import model.Estabelecimento;
import model.Entregador;
import model.Produto;
import model.Pedido;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("    BEM-VINDO AO FEASTFOOD");
        System.out.println("================================");

        Cliente cliente = new Cliente(
                "Ana", "ana@email.com");

        Estabelecimento estabelecimento = new Estabelecimento(
                "Lanchonete Sabor", "sabor@email.com");

        Entregador entregador = new Entregador(
                "Carlos", "carlos@email.com");

        Produto produto = new Produto("Hamburguer", 18.50);

        estabelecimento.exibirEstabelecimento();
        produto.exibirProduto();

        cliente.realizarPedido();

        Pedido pedido = new Pedido(cliente, produto);
        pedido.exibirPedido();

        pedido.atualizarStatus("Em preparação");
        System.out.println("\nNovo status: " + pedido.getStatus());

        entregador.realizarEntrega();

        pedido.atualizarStatus("Saiu para entrega");
        System.out.println("Status atualizado: " + pedido.getStatus());

        System.out.println("\nSistema finalizado!");
    }
}
