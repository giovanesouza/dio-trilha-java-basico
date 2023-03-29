package edu.giovane;

/* FINALIZADO
Daenerys é a khaleesi dos Dothraki. Juntamente com Drogon, eles vão atrás do Tyrion,
 para tentar dominar Westeros. Ela possui, além do seu dragãozinho, um rastreador que
  mede o nível de energia de qualquer ser vivo. Todos os seres com o nível menor ou
   igual a 8000, ela considera como se fosse um inseto. Quando passa deste valor,
    que foi o caso do Drogon, ela se espanta e grita “Mais de 8000”. Baseado nisso,
     utilize a mesma tecnologia e analise o nível de energia dos seres vivos.
 */

import java.util.Scanner;
public class Dragao {
    public static void main(String[] args) {
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de casos: ");
        casos = ler.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println("Informe o nível de energia: ");
            poderDeLuta = ler.nextInt();


            if (poderDeLuta <= 8000) {
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }
    }
}
