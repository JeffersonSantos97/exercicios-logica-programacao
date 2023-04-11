package com.jefferson.logic.english.conditional;

import java.util.Scanner;

public class Exer_008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        double note1, note2, average = 0.0;

        System.out.println("Input the first score: ");
        note1 = sc.nextDouble();

        System.out.println("Enter the second score: ");
        note2 = sc.nextDouble();

        average = (note1 + note2) / 2;

        System.out.printf("Average: %.2f %n", average);

        if(average >= 6.0 ) {

            System.out.println("the student is approved ");
        } else {

            System.out.println("the student is NOT approved");
        }
    }
}
