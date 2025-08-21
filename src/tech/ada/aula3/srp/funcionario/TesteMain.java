package tech.ada.aula3.srp.funcionario;

public class TesteMain {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "Helena",
                3000
        );



        double bonusFuncionario = new CalculadoraBonus().calcularBonus(funcionario);

        EmissorRelatorio emissorRelatorio = new EmissorRelatorio();
        emissorRelatorio.emitir(funcionario);

        System.out.println("Bonus calculado: " + bonusFuncionario);
    }
}
