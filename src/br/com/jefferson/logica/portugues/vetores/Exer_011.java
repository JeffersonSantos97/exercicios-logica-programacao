package br.com.jefferson.logica.portugues.vetores;

import java.util.Scanner;

public class Exer_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        // pegando os valores do vetorA
        for(int i = 0; i < vetorA.length; i++ ) {

            vetorA[i] = sc.nextInt();
        }

        // Pegando os valores do vetorB

        for(int i = 0 ; i < vetorB.length; i++ ) {

            vetorB[i] = sc.nextInt();

            // logica do VetorC
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("Vetor A = ");
        for(int vetoresA : vetorA) {

            System.out.print(vetoresA + " ");
        }

        System.out.println(); // pular linha

        System.out.print("Vetor B = ");

        for(int vetoresB : vetorB) {

            System.out.print(vetoresB + " ");
        }

        System.out.println(); // pular linha

        System.out.print("Vetor C = ");
        for(int vetoresC : vetorC ) {

            System.out.print(vetoresC + " ");
        }

        sc.close();
    }
}
