package tech.ada.aula3.ocp;

public class RelatorioMain {

    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio(new RelatorioCsv());

        relatorio.gerarRelatorio();
    }
}
