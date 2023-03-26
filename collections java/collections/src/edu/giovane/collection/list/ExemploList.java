package edu.giovane.collection.list;
/*
EXERCÍCIO 1
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        // Questão 1
        System.out.println("Cria uma lista e adicione sete notas: ");

        List<Double> notas = new ArrayList<Double>(); // Cria a lista
        notas.add(7.0); // Adiciona elemento à lista
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        // Formas de imprimir as notas
        System.out.println(notas);
        System.out.println(notas.toString());


        // Questão 2
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); // saída: 3


        // Questão 3
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); // 1º Parâmetro = index; 2º Parâmetro = nota;
        System.out.println(notas); // Impressão lista atualizada


        // Questão 4
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        // método set => 1º parâmetro = index; 2º parâmetro = novo valor.
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas); // Impressão lista atualizada

        // Questão 5
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); // contains(): verifica se há a nota e retorna um boolean


        // Questão 6
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");

        // Impressão em forma de lista com ForEach
        // Como há APENAS uma sentença não precisa inserir {}
        for (Double nota : notas) System.out.println(nota);


        // Questão 7
        System.out.println("Exiba a terceira nota adiciona: " + notas.get(2)); // get = pega o elemento


        // Questão 8
        System.out.println("Exiba a menor nota: " + Collections.min(notas));


        // Questão 9
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        // Questão 10
        System.out.println("Exiba a soma dos valores nota: ");
        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;

        while(iterator.hasNext()) {
            // Enquanto houver um próximo número, realiza a adição
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);


        // Questão 11
        System.out.println("Exiba a média das notas: " + (soma/notas.size())); // size = retorna um int que se refere a quantidade de elementos da lista


        // Questão 12
        System.out.println("Remova a nota 0: ");
        notas.remove(0d); // Necessário inserir o "d" após o número.
        System.out.println(notas);


        // Questão 13
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0); // Sem o "d" remove o 1º elemento da lista
        System.out.println(notas);


        // Questão 14
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        // Verifica as notas menores que 7 e remove
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);


        // Questão 15
        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);


        // Questão 16
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); // Verifica se a lista está vazia e retorna um boolean

    }
}
