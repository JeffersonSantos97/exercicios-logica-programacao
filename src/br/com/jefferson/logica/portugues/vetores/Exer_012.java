package br.com.jefferson.logica.portugues.vetores;

// Exercicios que ensia a não colocar os lugares vazios dentro de um array

import java.util.Scanner;

public class Exer_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorIguais = new int[vetorA.length];


        for(int i = 0; i < vetorA.length; i++ ) {

            vetorA[i] = sc.nextInt();
        }

        for(int i = 0 ; i < vetorA.length; i++ ) {

            vetorB[i] = sc.nextInt();
        }
        int posIguais = 0;
        for(int i = 0 ; i < vetorA.length; i++) {

            if(vetorA[i] == vetorB[i]) {

                vetorIguais[posIguais] = i + 1 ;
                posIguais++;
            }
        }
        System.out.print("Vetor A = ");

        for(int vetoresA : vetorA) {

            System.out.print(vetoresA + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");

        for(int vetoresB : vetorB) {

            System.out.print(vetoresB + " ");
        }
        System.out.println();

        System.out.print("Posicao  = ");
        for(int i = 0 ; i < posIguais; i++ ) {

            System.out.print(vetorIguais[i] + " ");
        }

        sc.close();
    }
}
