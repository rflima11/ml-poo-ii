package tech.ada.aula3.srp.funcionario;

public class EmissorRelatorio {

    public void emitir(Funcionario funcionario) {
        System.out.println(" -- Emitindo relatório -- ");
        System.out.println(" Nome: " + funcionario.getNome() );
        System.out.println(" Salario: " + funcionario.getSalario());
    }
}
