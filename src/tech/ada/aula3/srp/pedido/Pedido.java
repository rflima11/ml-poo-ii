package tech.ada.aula3.srp.pedido;

public class Pedido {

    private Produto produto;
    private int quantidade;
    private double preco;

    public Pedido(Produto produto,
                  int quantidade,
                  double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //calcula total
    public double getTotal() {
        return preco * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
