package tech.ada.aula1;

public class MetodoPagamentoCartao implements MetodoPagamento {

    @Override
    public void pagar(double preco) {
        System.out.println("Pagamento realizado utilizando cartão no valor de R$" + preco);
    }
}
