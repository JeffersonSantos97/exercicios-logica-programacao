package com.jefferson.logic.english.array;

import java.util.Scanner;

public class Exer_002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        String[] vectorA = new String[5];

        for(int i = 0; i < vectorA.length; i++) {

            System.out.print("Enter the " + (i + 1 ) + " element: ");
            vectorA[i] = sc.nextLine();
        }

        System.out.println(); // Jump one line
        System.out.println("Vector A = ");

        for(String a : vectorA) {

            System.out.println(a);
        }







        sc.close();
    }
}
