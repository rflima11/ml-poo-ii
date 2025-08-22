package tech.ada.aula4.ocp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorKv implements LeitorArquivo {

    @Override
    public List<Cliente> processar(String caminhoArquivo) throws IOException {
        System.out.println("Lendo arquivo Chave Valor...");
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            String nome = null;
            int idade = 0;
            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith("---")) {
                    clientes.add(new Cliente(nome, idade));
                    nome = null; // Reseta para o próximo produto
                } else {
                    String[] partes = linha.split("=");
                    String chave = partes[0];
                    String valor = partes[1];
                    if (chave.equals("nome")) nome = valor;
                    if (chave.equals("idade")) idade = Integer.parseInt(valor);
                }
            }
            if (nome != null) {
                clientes.add(new Cliente(nome, idade));
            }
        }
        return clientes;
    }
}
