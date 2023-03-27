package edu.giovane.collection.set;

import java.util.*;

import static java.util.Arrays.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas.toString());

        // Questão 2
        System.out.println("Exiba a posição da nota 5: "); // Não é possível fazer, tendo em vista que não há o método indexOf

        // Questão 3
        System.out.println("Adicione na lista a nota 8.0 na posição 4: "); // Não é possível fazer, tendo em vista que não há o método indexOf

        // Questão 4
        System.out.println("Substitua a nota 5.0 pela nota 6.0"); // Não é possível fazer,pois não há o set.

        // Questão 5
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        // Questão 6
        System.out.println("Exiba a terceira nota adicionada: "); // Nâo é possível fazer, pois não tem o método get para passar o index.

        // Questão 7
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // Questão 8
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        // Questão 9
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);


        // Questão 10
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        // Questão 11
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        // Questão 12
        System.out.println("Remova a nota da posição 0: "); // Nâo é possível, pois não tem como trabalhar com índices.

        // Questão 13
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        // Questão 14
        System.out.println("Exiba todas as notas na ordem em que foram informadas: "); // Necessário utilizar o LinkedSet em vez do HashSet
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        // Questão 15
        System.out.println("Exiba todas as notas na ordem crescente: "); // Necessário utilizar a implementação treeSet
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        // Questão 16
        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        // Questão 17
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());



    }
}
