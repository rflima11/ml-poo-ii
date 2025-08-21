package tech.ada.aula3.srp.funcionario;

public class CalculadoraBonus {

    public double calcularBonus(Funcionario funcionario) {
        if (funcionario.getQuantidadeDeVendasNoMes() >= 50) {
            return funcionario.getSalario() * 0.5;
        }

        if (funcionario.getQuantidadeDeVendasNoMes() < 10) {
            return 0;
        }

        return funcionario.getSalario() * 0.1;
    }
}
