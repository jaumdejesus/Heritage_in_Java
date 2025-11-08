package Domain;

public class Funcionario {
    private String Nome;
    private double Salario;
    private double Aumento;

    public Funcionario(String nome, double salario, double aumento) {
        Nome = nome;
        Salario = salario;
        Aumento = aumento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getAumento() {
        return Aumento;
    }

    public void setAumento(double aumento) {
        Aumento = aumento;
    }

    public double salarioAnual(){
        return Salario * 12;
    }
}
