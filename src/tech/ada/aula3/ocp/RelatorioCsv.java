package tech.ada.aula3.ocp;

public class RelatorioCsv implements RelatorioProvider {

    @Override
    public void gerar() {
        System.out.println("Gerando relatório no formato CSV");
    }
}
