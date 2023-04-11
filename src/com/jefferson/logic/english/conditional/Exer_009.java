package com.jefferson.logic.english.conditional;

import java.util.Scanner;

public class Exer_009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double note1, note2, average = 0.0;

        System.out.print("Input the first score: ");
        note1 = sc.nextDouble();

        System.out.print("Input the second score: ");
        note2 = sc.nextDouble();


        average = (note1 + note2) / 2;

        System.out.printf("Average: %.2f %n", average);

        if(average >=10) {

            System.out.println("passed with distinction");
        } else if(average >=7 ) {

            System.out.println("Approved ");
        } else {

            System.out.println("Not aprovedd");
        }

        sc.close();

    }
}
