package br.com.jefferson.logica.portugues.vetores;

import java.util.Scanner;

public class Exer_003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0 ; i < vetorA.length; i++ ) {

            vetorA[i] = sc.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("Vetor A = ");

        for(int i : vetorA ) {

            System.out.print(i + " ");
        }

        System.out.println(); // pular uma linha

        System.out.print("Vetor B = ");

        for(int i : vetorB) {

            System.out.print( i + " ");
        }






        sc.close();
    }
}
