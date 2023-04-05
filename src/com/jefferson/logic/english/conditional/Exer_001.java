package com.jefferson.logic.english.conditional;

import java.util.Scanner;

public class Exer_001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int number1, number2, bigger;

        System.out.print("Enter the first number: ");
         number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        number2 = sc.nextInt();

        System.out.println(); // jump one line
        if(number1 > number2) {

            System.out.println(number1 + " is the biggest");
        } else {

            System.out.println(number2 + " is the biggest");
        }



        sc.close();

    }
}
