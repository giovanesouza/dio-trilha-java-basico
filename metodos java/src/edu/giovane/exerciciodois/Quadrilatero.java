package edu.giovane.exerciciodois;
/*
Cria uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
Obs: Use sobrecarga.
 */
public class Quadrilatero {
    // Quadrado
    public static void area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
    }

    // Retângulo
    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    // Trapézio
    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor)*altura) / 2);
    }

    // Losango
    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango: " + (diagonal1 * diagonal2)/2);
    }
}
