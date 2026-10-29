package model;

import Interfaces.AtualizavelStatus;

public class Pedido implements AtualizavelStatus {

    private Cliente cliente;
    private Produto produto;
    private String status;

    public Pedido(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
        this.status = "Pedido realizado";
    }

    public double calcularTotal() {
        return produto.getPreco();
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void exibirPedido() {
        System.out.println("\n--- RESUMO DO PEDIDO ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
        System.out.println("Status: " + status);
    }
}
