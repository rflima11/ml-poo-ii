package tech.ada.aula1;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto() {}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto o) {
        if (this.preco > o.preco) {
            return 1;
        } else if (this.preco < o.preco) {
            return -1;
        }
        return 0;
    }
}
