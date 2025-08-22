package tech.ada.aula4.ocp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorCsv implements LeitorArquivo {

    @Override
    public List<Cliente> processar(String caminhoArquivo) throws IOException {
        System.out.println("Lendo arquivo CSV...");
        List<Cliente> produtos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);
                produtos.add(new Cliente(nome, idade));
            }
        }
        return produtos;
    }
}
