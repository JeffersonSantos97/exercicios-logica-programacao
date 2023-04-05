package com.jefferson.logic.english.conditional;

import java.util.Scanner;

public class Exer_002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter with the number: ");
        number = sc.nextInt();

        if(number > 10 ) {

            System.out.println("It is larger than 10");
        } else {

            System.out.println("It is not larger than 10");
        }




        sc.close();
    }
}
