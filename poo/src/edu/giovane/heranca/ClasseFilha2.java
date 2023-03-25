package edu.giovane.heranca;

public class ClasseFilha2 extends ClasseMae {

    // @Override => Sobrescrita
    @Override
    void metodo1() {
        System.out.println("Método 1 da classe Filha 2.");
    }

    @Override
    void metodo2() {
        System.out.println("Método 2 da classe Filha 2.");
    }
}
