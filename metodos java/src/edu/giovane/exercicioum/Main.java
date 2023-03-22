package edu.giovane.exercicioum;

public class Main {
    public static void main(String[] args) {
    // CALCULADORA
        System.out.println("=== Calculadora ===");
        Calculadora.somar(5, 5);
        Calculadora.subtrair(60,25);
        Calculadora.multiplicar(3,7);
        Calculadora.dividir(15,3);

        //MENSAGEM
        System.out.println("=== Mensagens ===");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(23);


        // EMPRÉSTIMO
        System.out.println("=== Empréstimo ===");
        Emprestimo.calcular(1350, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1350, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1350,2);
        Emprestimo.calcular(1350,6);
    }
}
