package br.com.jefferson.logica.portugues.vetores;

import java.util.Scanner;

public class Exer_010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamanho;
        System.out.println("Tamanho do vetor: ");
        tamanho = sc.nextInt();

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        System.out.println("Entre com o elementos do vetor A: ");
        for(int i = 0; i < vetorA.length; i++ ) {

            vetorA[i] = sc.nextInt();
        }
        System.out.println("Agora entre com os elementos do vetor B: ");
        for(int i = 0 ; i < vetorB.length; i++ ) {

            vetorB[i] = sc.nextInt();

            // logica do vetor C

            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("Vetor A = ");

        for(int vetor : vetorA) {

            System.out.print( vetor + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for(int vetor : vetorB) {

            System.out.print(vetor + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
         for(int vetor : vetorC) {

             System.out.print(vetor + " ");
         }
        sc.close();


    }
}
