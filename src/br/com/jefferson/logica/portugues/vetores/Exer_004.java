package br.com.jefferson.logica.portugues.vetores;

import java.util.Scanner;

public class Exer_004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetores = new int[5];

        for(int i = 0 ; i < vetores.length; i++ ){

            vetores[i] = sc.nextInt();
        }
        System.out.print("Vetor = ");
        for(int vetor : vetores) {

            System.out.print(vetor + " ");
        }

        for(int j = vetores.length - 1 ; j >=0; j--){

            System.out.println(vetores[j]);
        }

        sc.close();
    }

}
