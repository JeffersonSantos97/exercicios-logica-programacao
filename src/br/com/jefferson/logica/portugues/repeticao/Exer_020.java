package br.com.jefferson.logica.portugues.repeticao;

import java.util.Scanner;

public class Exer_020 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primeiroNumero, ultimoNumero, soma = 0;
        System.out.println("Entre com o primeiro numero: ");
        primeiroNumero = sc.nextInt();

        System.out.println("Entre com o ultimo numero: ");
        ultimoNumero = sc.nextInt();

        for(int i = primeiroNumero; i < ultimoNumero - 1; i++){
            soma += (i + 1);
            System.out.println(i + 1);
        }

        System.out.println("Soma = " + soma);



        sc.close();
    }
}
