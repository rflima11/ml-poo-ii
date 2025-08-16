package tech.ada.aula1;

public class MetodoPagamentoPix implements MetodoPagamento {

    @Override
    public void pagar(double preco) {
       System.out.println("Pagamento realizado utilizando pix no valor de R$" + preco);
    }

    @Override
    public void validar() {
        System.out.println("Validando pix");
    }

}
