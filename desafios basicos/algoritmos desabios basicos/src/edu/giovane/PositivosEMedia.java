package edu.giovane;
/* FINALIZADO
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
 Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados,
  com um dígito após o ponto decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class PositivosEMedia {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x = 0;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 1; i <= 6; i++) {

            System.out.println("Informe o " + i + "º número: ");
            float numero = leitor.nextFloat();

            if(numero >= 0) {
                cont++;
                x += numero;
            }

        }

        media = x / cont;
        System.out.println(cont +" valores positivos");
        System.out.println(String.format("%.1f",media));
    }

}

