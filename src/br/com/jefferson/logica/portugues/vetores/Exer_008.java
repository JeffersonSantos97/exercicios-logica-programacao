package br.com.jefferson.logica.portugues.vetores;

import java.util.Scanner;

public class Exer_008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        boolean loop = true;
        int numPosition =0;

        do{
            System.out.print("Enter the number of position: ");
            numPosition = sc.nextInt();

            System.out.println();
            // Esse println é pq toda vez que eu pego um inteiro e depois tenho que

            if(numPosition >0 && numPosition <=20){
                loop = false;
            }else {

                System.out.println("ERROR !!");
                System.out.println("Enter the correct number !! ");
                loop = true;
            }

        } while(loop);

        String[] vetor = new String[numPosition];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Enter the " + ( i + 1 ) + " position: ");
            vetor[i] = sc.next();
        }

        System.out.print("Vetor = ");

        for(String v : vetor) {

            System.out.print(v + " ");
        }





        sc.close();
    }
}
