package vetores;

import java.util.Scanner;

public class exer_001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0 ; i < vetorA.length; i++ ) {

            vetorA[i] = sc.nextInt();

            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A = ");

        for(int i : vetorA){

            System.out.print(i + " ");
        }

        System.out.println(); // pular uma linha

        System.out.print("Vetor B = ");
        for(int i : vetorB ) {

            System.out.print(i + " ");
        }




        sc.close();
    }
}
