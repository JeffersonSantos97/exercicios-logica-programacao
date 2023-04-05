package br.com.jefferson.logica.portugues.vetores;

import java.util.Scanner;

public class Exer_009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++ ) {

            vetorA[i] = sc.nextInt();

            vetorB[i] = vetorA[i] * i;
        }
        System.out.print("Vetor A = ");
        for(int vetor : vetorA) {

            System.out.print(vetor + " ");
        }

        System.out.println(); // pular linha
        System.out.print("Vetor B = ");
        for(int vetor : vetorB) {

            System.out.print(vetor + " ");
        }




        sc.close();
    }
}
