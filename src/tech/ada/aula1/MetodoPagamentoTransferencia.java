package tech.ada.aula1;

public class MetodoPagamentoTransferencia implements MetodoPagamento {

    @Override
    public void pagar(double preco) {
        System.out.println("Realizando pagamento por transferência no valor de R$"  + preco);
    }

}
