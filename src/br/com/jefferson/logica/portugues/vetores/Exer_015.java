package br.com.jefferson.logica.portugues.vetores;

import java.util.Scanner;

public class Exer_015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);


        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for(int i = 0 ; i < vetorA.length; i++ ){
            System.out.print("Entre com o" + ( i + 1 ) + " elemento do vetor A: ");
            vetorA[i] = sc.nextInt();
        }
        System.out.println(); // pular linha

        for(int i = 0 ; i < vetorB.length; i++){

            System.out.print("Entre com o " + (i + 1 ) + " elemento do vetor B: ");
            vetorB[i] = sc.nextInt();

            // logica do vetor C

            vetorC[i] = vetorA[i] * vetorB[i];

        }

        System.out.println(); // pular uma linha

        System.out.print("Vetor A = ");

        for(int a : vetorA){

            System.out.print(a + " ");
        }

        System.out.println(); // pular
        System.out.print("Vetor B = ");
        for(int b : vetorB){

            System.out.print(b + " ");
        }

        System.out.println(); // pular

        System.out.print("Vetor C = ");

        for(int c : vetorC){

            System.out.print(c + " ");
        }





        sc.close();
    }
}
