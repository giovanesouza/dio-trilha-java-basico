package edu.giovane;
/*
Neste desafio, faça um programa que calcule o valor de H com N termos.
Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
 */

import java.util.Scanner;
public class SomaHNTermos {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h += 1d/i;
        }

        System.out.println(Math.round(h));
    }
}
