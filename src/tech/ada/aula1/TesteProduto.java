package tech.ada.aula1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteProduto {

    public static void main(String[] args) {
        Produto produto = new Produto(
                "Celular", 3000
        );
        Produto produto2 = new Produto(
                "TV", 2500
        );
        Produto produto3 = new Produto(
                "Geladeira", 4000
        );


        MetodoPagamento meioDePagamento = new MetodoPagamentoTransferencia();
        Loja.vender(produto, meioDePagamento);


        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(produto3);
        produtos.add(produto2);


        Collections.sort(produtos);

        for (Produto produtoLista : produtos) {
            System.out.println(produtoLista.getPreco());
        }


        List list = new ArrayList();
        list.add(produto);
        list.add(1);
        list.add("String Qualquer");

        Produto produtoLista = (Produto) list.get(0);

        Caixa<Integer> caixa = new Caixa<>();
        caixa.item = 1;


    }


}
