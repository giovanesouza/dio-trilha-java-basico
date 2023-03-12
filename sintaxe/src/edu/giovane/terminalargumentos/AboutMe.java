package edu.giovane.terminalargumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //Criando o objeto scanner
    	//.useLocale()Locale.US => Convenção americana para números decimais
    	
    	Scanner entrada = new Scanner(System.in).useLocale(Locale.US); 
    	
        	
    	System.out.println("Digite seu nome: ");
    	String nome = entrada.next();
    	
    	System.out.println("Digite seu sobrenome: ");
    	String sobrenome = entrada.next();
    	
    	System.out.println("Digite sua idade: ");
    	int idade = entrada.nextInt();
    	
    	System.out.println("Digite sua altura (m): ");
    	double altura = entrada.nextDouble();
    	
    	// Imprimindo os dados obtidos pelo usuário
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }
}
