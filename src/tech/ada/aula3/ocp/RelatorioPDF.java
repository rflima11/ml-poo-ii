package tech.ada.aula3.ocp;

public class RelatorioPDF implements RelatorioProvider {

    @Override
    public void gerar() {
        System.out.println("Gerando relatório PDF");
    }
}
