package edu.giovane.metodos;

public class SmartTv {
	
	// atributos
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	// métodos
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo o volume para: " + volume);
	}
	
	// Usuário escolhe o canal que deseja
	public void mudarCanal(int novoCanal) {
		this.canal = novoCanal;
	}
	

	public void aumentarCanal() {
		canal++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	
	public void diminuirCanal() {
		canal--;
		System.out.println("Diminuindo o volume para: " + volume);
	}
	
}
