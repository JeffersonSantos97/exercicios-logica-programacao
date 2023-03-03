package vetores;

import java.util.Scanner;

public class Exer_007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];


        for(int i =0; i< vetorA.length; i++ ) {

            vetorA[i] = sc.nextInt();
        }
        for(int i = 0 ; i < vetorB.length; i++ ) {

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");

        for(int vetor : vetorA){

            System.out.print(vetor + " ");
        }

        System.out.println(); // pular uma linha

        System.out.println("Vetor B = ");
        // Loop pra impirmir os elementos do vetor B
        for(int i = 0 ; i < vetorA.length; i++ ) {

            // pra saber se o numero é primo ou não
            if ((vetorB[i] * vetorB[i]) == vetorA[i]){
                System.out.println( vetorA[i] + ": " + (int) vetorB[i] + " "); // usei um  casting aqui pra poder sair um numero inteiro no print
                //                                                               achei mais bonitinho ficar 4: 2 do que 4: 2.0
        } else {

                System.out.println(vetorA[i] + ": Não tem raiz");
            }
        }





        sc.close();

    }
}
