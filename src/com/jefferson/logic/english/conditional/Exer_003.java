package com.jefferson.logic.english.conditional;

import java.util.Scanner;

public class Exer_003 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number;

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        System.out.println(); // jump one line

        if(number >= 0) {

            System.out.println("Number is POSITIVE");

        } else {

            System.out.println("Number is NEGATIVE");
        }


        sc.close();
    }
}
