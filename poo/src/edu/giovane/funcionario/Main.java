package edu.giovane.funcionario;

public class Main {
    public static void main(String[] args) {
        // Objeto funcionário
        Funcionario funcionario = new Funcionario();

        // Upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast (deve ser evitado)
        Vendedor vendedor_ = (Vendedor) new Funcionario() ;

    }
}
