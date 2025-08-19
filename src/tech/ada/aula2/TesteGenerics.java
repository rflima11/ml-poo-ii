package tech.ada.aula2;

import tech.ada.aula1.Produto;

public class TesteGenerics {

    public static void main(String[] args) {
//        Caixa<String> caixa = new Caixa<String>("Uma string qualquer");
//
//        System.out.println(caixa.getItem().toUpperCase());
//
//        Caixa<Produto> caixaDeProduto = new Caixa<>(
//                new Produto("Celular", 3000)
//        );
//
//        System.out.println(caixaDeProduto.getItem().getNome());
//
//        System.out.println(caixa.getValue(1));


        Caixa<Produto> caixaDeInteiros = new Caixa<Produto>(
                new Produto("Celular", 3000));
    }

}
