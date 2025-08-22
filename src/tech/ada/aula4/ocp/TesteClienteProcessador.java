package tech.ada.aula4.ocp;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteClienteProcessador {



    public static void main(String[] args) throws IOException {
        final String nomeArquivo = "clientes.kv";

        Map<String, LeitorArquivo> leitores = new HashMap<>();
        leitores.put("csv", new ProcessadorCsv());
        leitores.put("kv", new ProcessadorKv());

        ProcessadorDeArquivos processador = new ProcessadorDeArquivos(
                leitores
        );

        List<Cliente> clientes = processador.processar(
                "C:\\Users\\rodol\\Documents\\Projetos\\desenvolva+\\introducao-poo-ii\\" + nomeArquivo);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

    }
}
