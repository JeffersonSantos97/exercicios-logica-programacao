package com.jefferson.logic.english.array;

import java.util.Scanner;

public class Exer_003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);


        int[] vectorA = new int[5];
        int[] vectorB = new int[vectorA.length];

        for(int i = 0 ; i < vectorA.length; i++){

            System.out.print("Enter the " +  (i + 1) + " element: " );
            vectorA[i] = sc.nextInt();

            vectorB[i] = vectorA[i] * 2; // logic of vectorB
        }

        System.out.println(); // Jump one line

        System.out.print("Vector A = ");

        for(int a : vectorA) {

            System.out.print(a + " ");
        }

        System.out.println(); // Jump one line

        System.out.print("Vector B = ");
        for(int b : vectorB) {

            System.out.print(b + " ");
        }




        sc.close();
    }
}
