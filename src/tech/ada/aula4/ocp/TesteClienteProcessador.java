package tech.ada.aula4.ocp;

import java.io.IOException;
import java.util.List;

public class TesteClienteProcessador {

    public static void main(String[] args) throws IOException {
        ProcessadorDeArquivos processador = new ProcessadorDeArquivos();

        List<Cliente> clientes = processador.processar(
                "C:\\Users\\rodol\\Documents\\Projetos\\desenvolva+\\introducao-poo-ii\\clientes.csv");

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }


    }
}
