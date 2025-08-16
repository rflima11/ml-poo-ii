package tech.ada.aula1;

public class Loja {

    public static void vender(Produto produto,
                              MetodoPagamento metodoPagamento) {
        System.out.println("Inicializando pagamento: ");

        metodoPagamento.pagar(produto.getPreco());

        System.out.println("Pagamento realizado com sucesso no valor de R$ " + produto.getPreco());
    }
}
