package tech.ada.aula4.ocp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProcessadorDeArquivos {

    private final Map<String, LeitorArquivo> leitores;

    public ProcessadorDeArquivos(Map<String, LeitorArquivo> leitores) {
        this.leitores = leitores;
    }

    public List<Cliente> processar(String caminhoArquivo) throws IOException {
        String tipoArquivo = caminhoArquivo.substring(caminhoArquivo.lastIndexOf(".") + 1);
        LeitorArquivo leitorArquivo = leitores.get(tipoArquivo);
        if (leitorArquivo != null) {
            return leitorArquivo.processar(caminhoArquivo);
        }
        else {
            throw new IllegalArgumentException("Tipo de arquivo não suportado: " + tipoArquivo);
        }
    }
}
