package Domain;

public class Assistente extends Funcionario {

    public Assistente(String nome, double salario, double aumento) {
        super(nome, salario, aumento);
    }

    @Override
    public double salarioAnual() {
        double salarioMensalComAumento = getSalario() + getAumento() + 1000;
        return salarioMensalComAumento * 12 ;
    }
}
