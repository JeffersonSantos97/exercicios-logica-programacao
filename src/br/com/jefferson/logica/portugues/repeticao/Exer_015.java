package br.com.jefferson.logica.portugues.repeticao;

import java.util.Scanner;

public class Exer_015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdNumeros = 5;
        int numero;
        int total = 0;
        for(int i = 0 ; i < qtdNumeros; i++){
            numero = sc.nextInt();

            total += numero;
        }

    double media = total / qtdNumeros;

        System.out.println("Soma = " + total);
        System.out.println("Media = " + media);





        sc.close();
    }

}
