package edu.giovane.collection.list;
/*
EXERCÍCIO 2

Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene-a exibindo:
(nome - idade - cor):

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Sinba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("---\tOrdem de Inserção\t---");
        System.out.println(meusGatos);


        System.out.println("---\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);


        System.out.println("---\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);


        System.out.println("---\tOrdem Idade\t---");
        Collections.sort(meusGatos, new ComparatorIdade()); // forma 1
        meusGatos.sort(new ComparatorIdade()); // forma 2
        System.out.println(meusGatos);



        System.out.println("---\tOrdem Cor\t---");
        Collections.sort(meusGatos, new ComparatorCor()); // forma 1
        meusGatos.sort(new ComparatorCor()); // forma 2
        System.out.println(meusGatos);



        System.out.println("---\tOrdem Nome/Cor/Idade\t---");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade()); // forma 1
        meusGatos.sort(new ComparatorNomeCorIdade()); // forma 2
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato> {

    // Atributos
    private String nome;
    private Integer idade;
    private String cor;

    // Construtor
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    // Get
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }


    // toString


    @Override
    public String toString() { // Utilizado para exibir os dados dos objetos
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}


class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}


class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // Se nome diferentes => Ordena por nome
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        // Nomes iguais e cores diferentes => Ordena pela cor
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        // Nomes iguais e cores iguais => Ordena pela idade.
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
