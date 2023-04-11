package com.jefferson.logic.english.array;

import java.util.Scanner;

public class Exer_004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);


        int[] vectorA = new int[5];
        int[] vectorB = new int[vectorA.length];
        int positionInvert = vectorA.length - 1;

        for(int i = 0; i < vectorA.length; i++){

            System.out.print("Enter the " + ( i + 1 ) + " number: ");
            vectorA[i] = sc.nextInt();
        }

        for(int i = 0; i < vectorB.length; i++ ) {

            vectorB[i] = vectorA[positionInvert];
            positionInvert--;
        }

        System.out.print("Vector A = ");

        for(int A : vectorA){

            System.out.print(A + " " );
        }

        System.out.println(); // Jump one line

        System.out.print("Vector B = ");
        for(int B : vectorB){

            System.out.print(B + " ");
        }

        sc.close();
    }


}
