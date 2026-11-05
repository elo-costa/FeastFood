package model;

public class Entrega implements Interfaces.AtualizavelStatus {

    private int codigo;
    private String status;
    private Entregador entregador;

    public Entrega(int codigo, Entregador entregador) {
        this.codigo = codigo;
        this.entregador = entregador;
        this.status = "Aguardando";
    }

    public int getCodigo() {
        return codigo;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void exibirEntrega() {
        System.out.println("Código da entrega: " + codigo);
        System.out.println("Status: " + status);

        if (entregador != null) {
            System.out.println("Entregador: " + entregador.getNome());
        }
    }
}