import Domain.Assistente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Assistente novoAssitente = new Assistente("João", 3000, 500);

    IO.println("Novo assistente contratado!\n" +
                "Nome: " + novoAssitente.getNome() + "\n" +
                "Salário anual: R$ " + novoAssitente.salarioAnual());
}
