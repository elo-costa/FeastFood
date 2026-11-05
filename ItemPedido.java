package model;

public class ItemPedido {

    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }

    public void exibirItem() {
        System.out.println(produto.getNome()
                + " | Quantidade: " + quantidade
                + " | Subtotal: R$ " + calcularSubtotal());
    }
}