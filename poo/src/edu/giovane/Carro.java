package edu.giovane;

/*
Exercício:
1º Criar a classe Carro;
2º Criar 3 atributos: cor, modelo e capacidade do tanque;
3º Definir 1 método para calcular o valor total para encher o tanque:
 - receber como parâmetro o preço da gasolina. Além disso, fazer duas sobrecargas do construtor.
 - Criar métodos específicos get/set
 4º Criar objetos da classe Carro:
 - Usar os métodos get/set;
 - Passar mensagem para o cálculo total para encher o tanque.
 */
public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtor com sobrecargas
    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Get e Set
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }


    // Método para encher o tanque
    public double totalValorTanque(double precoCombustivel) {
        return capacidadeTanque * precoCombustivel;
    }

}
