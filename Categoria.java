package model;

public class Categoria {

    private String nome;
    private Categoria categoriaPai;

    public Categoria(String nome, Categoria categoriaPai) {
        this.nome = nome;
        this.categoriaPai = categoriaPai;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoriaPai() {
        return categoriaPai;
    }

    public void setCategoriaPai(Categoria categoriaPai) {
        this.categoriaPai = categoriaPai;
    }

    public void exibirCategoria() {
        System.out.println("Categoria: " + nome);

        if (categoriaPai != null) {
            System.out.println("Categoria pai: " + categoriaPai.getNome());
        } else {
            System.out.println("Categoria principal");
        }
    }
}