package tech.ada.aula3.ocp;

public class Relatorio {

    RelatorioProvider relatorioProvider;

    public Relatorio(RelatorioProvider relatorioProvider) {
        this.relatorioProvider = relatorioProvider;
    }

    public void gerarRelatorio() {
        relatorioProvider.gerar();
    }

    public void setRelatorioProvider(RelatorioProvider relatorioProvider) {
        this.relatorioProvider = relatorioProvider;
    }
}
