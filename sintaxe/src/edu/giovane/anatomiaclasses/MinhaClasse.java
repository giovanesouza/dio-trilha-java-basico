package edu.giovane.anatomiaclasses;

public class MinhaClasse {

	public static void main(String[] args) {
	//System.out.print("Hello World!");
	
	String primeiroNome = "Giovane";
	String segundoNome = "Souza";
	
	// Parte 1: Variável | Parte 2: Método
	String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
	
	System.out.println(nomeCompleto);
	}
	
	// Método
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
