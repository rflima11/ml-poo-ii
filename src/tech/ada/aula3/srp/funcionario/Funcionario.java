package tech.ada.aula3.srp.funcionario;

public class Funcionario {

    private String nome;
    private double salario;
    private int quantidadeDeVendasNoMes;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQuantidadeDeVendasNoMes() {
        return quantidadeDeVendasNoMes;
    }

    public void setQuantidadeDeVendasNoMes(int quantidadeDeVendasNoMes) {
        this.quantidadeDeVendasNoMes = quantidadeDeVendasNoMes;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }
}
