package com.jefferson.logic.english.conditional;

import java.util.Scanner;

public class Exer_006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int apples;
        double total = 0.0;
        System.out.print("How many apples were bought? : ");
        apples = sc.nextInt();

        if(apples >= 12 ) {

            total = apples * 1.0;
        } else {

            total = apples * 1.30;
        }

        System.out.println("Apples bought: " + apples);
        System.out.printf("Total: %.2f",total);


        sc.close();
    }
}
