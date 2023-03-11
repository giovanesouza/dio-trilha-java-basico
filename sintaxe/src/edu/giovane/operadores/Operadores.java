package edu.giovane.operadores;

public class Operadores {

	public static void main(String[] args) {

		System.out.println("=== OPERADOR UNÁRIO ===");
		// Operador Unário
		int numero = 5; // número positivo
		numero = -numero; // transforma o número em negativo

		System.out.println(numero); // exibe o valor do número (negativo)

		numero = numero * -1; // converte o número novamente em positivo

		System.out.println(numero); // mostra o número (positivo)

		// Incremento
		/*
		 * Quando o ++ vem APÓS o nome da variável = primeiro ocorre a impressão e
		 * depois o incremento Quando o ++ vem ANTES do nome da variável = primeiro
		 * ocorre o incremento e depois a impressão
		 * 
		 * O mesmo vale para decremento.
		 */

		numero++;
		System.out.println("Número incrementado: " + numero);

		System.out.println("Número decrementado: " + --numero); // decrementou >> exibiu

		
		// Negando expressões booleanas

		boolean variavel = true;
		System.out.println(!variavel); // inverte o valor da variável true >> false (valor em memória)

		
		// Operador Ternário
		System.out.println("=== OPERADOR TERNÁRIO ===");
		int a, b;

		a = 6;
		b = 6;

		// Se a == b, print "Verdadeiro", senão "Falso";
		String resultado = (a == b) ? "Verdadeiro" : "Falso";

		System.out.println(resultado);
		
		

		// Operadores relacionais
		System.out.println("=== OPERADORES RELACIONAIS ===");
		
		String nomeUm = "GIOVANE";
		String nomeDois = new String("GIOVANE");
		
		
		/* Quando estiver trabalhando com objetos ou textos, utilizar o método
		 *  .equals que vai comparar conteúdos
		 */
		System.out.println(nomeUm.equals(nomeDois)); // true
		

		
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
		if(numero1 < numero2) {
			System.out.println("a nossa condição é verdadeira.");
		}
		
		System.out.println("numero1 é IGUAL a numero2? " + simNao); // false
		
		
		simNao = numero1 != numero2;
		System.out.println("numero1 é DIFERENTE a numero2? " + simNao); // true
		
		
		simNao = numero1 > numero2;
		System.out.println("numero1 é MAIOR a numero2? " + simNao); // false
		
		
		
		// Operadores lógicos
		System.out.println("=== OPERADORES LÓGICOS ===");
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if(condicao1 && condicao2) { // Verifica se ambas são verdadeiras
			System.out.println("as duas são verdadeiras");
		}
		
		if(condicao1 || condicao2) { // Verifica se pelo menos uma é verdadeiras
			System.out.println("uma das condições é verdadeira");
		}
		
		
		System.out.println("fim");


	}

}
