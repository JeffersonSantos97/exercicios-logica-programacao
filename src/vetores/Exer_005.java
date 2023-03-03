package vetores;

import java.util.Scanner;

public class Exer_005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i <vetorA.length; i++ ) {

            vetorA[i] = sc.nextInt();
        }

        for(int i = 0; i < vetorA.length; i++) {

            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.print("Vetor A = " );

        for(int vetor : vetorA){

            System.out.print(vetor + " ");
        }

        System.out.println(); // pular uma linha

        System.out.print("Vetor B = ");

        for(int i : vetorB){

            System.out.print(i + " ");
        }




        sc.close();
    }
}
