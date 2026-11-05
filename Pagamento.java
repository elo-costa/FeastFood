package model;

public class Pagamento {

    private String forma;
    private String status;

    public Pagamento(String forma) {
        this.forma = forma;
        this.status = "Pendente";
    }

    public String getForma() {
        return forma;
    }

    public String getStatus() {
        return status;
    }

    public void registrarPagamento() {
        status = "Registrado";
    }

    public void exibirPagamento() {
        System.out.println("Forma de pagamento: " + forma);
        System.out.println("Status do pagamento: " + status);
    }
}