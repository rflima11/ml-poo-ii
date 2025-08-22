package tech.ada.aula4.ocp;

import java.io.IOException;
import java.util.List;

public interface LeitorArquivo {

    List<Cliente> processar(String caminhoArquivo) throws IOException;

}
