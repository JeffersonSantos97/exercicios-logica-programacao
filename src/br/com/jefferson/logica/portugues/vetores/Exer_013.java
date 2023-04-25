package br.com.jefferson.logica.portugues.vetores;

import java.util.Scanner;

public class Exer_013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for(int i = 0 ; i < vetorA.length; i++ ) {

            System.out.print("Entre com o Vetor A: ");
            vetorA[i] = sc.nextInt();
        }

        for(int i = 0; i < vetorB.length; i++ ) {

            System.out.print("Entre com o vetor B: ");
            vetorB[i] = sc.nextInt();

            // Lógica do vetor C

            vetorC[i] = vetorA[i] - vetorB[i];
        }
        // Impressão do Vetor A
        System.out.print("Vetor A = ");
        for(int A : vetorA){

            System.out.print(A + " ");
        }
        System.out.println(); // pular uma linha

        // Impressão do Vetor B
        System.out.print("Vetor B = ");

        for(int B : vetorB){

            System.out.print(B + " ");
        }
        System.out.println(); // pular linha

        // Impressão do Vetor C
        System.out.print("Vetor C = ");
        for(int C : vetorC){

            System.out.print(C + " ");
        }

        sc.close();
    }
}
