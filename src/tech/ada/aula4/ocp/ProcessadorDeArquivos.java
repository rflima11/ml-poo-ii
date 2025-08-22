package tech.ada.aula4.ocp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeArquivos {

    public List<Cliente> processar(String caminhoArquivo) throws IOException {
        List<Cliente> produtos = new ArrayList<>();
        String tipoArquivo = caminhoArquivo.substring(caminhoArquivo.lastIndexOf(".") + 1);

        if (tipoArquivo.equalsIgnoreCase("csv")) {
            System.out.println("Lendo arquivo CSV...");
            try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] campos = linha.split(",");
                    String nome = campos[0];
                    int idade = Integer.parseInt(campos[1]);
                    produtos.add(new Cliente(nome, idade));
                }
            }
        }
        else {
            throw new IllegalArgumentException("Tipo de arquivo não suportado: " + tipoArquivo);
        }

        return produtos;

    }
}
