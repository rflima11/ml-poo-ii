package tech.ada.aula1;

public interface MetodoPagamento {

    void pagar(double preco);

    default void validar() {
        System.out.println("Validando forma de pagamento");
    }

}
