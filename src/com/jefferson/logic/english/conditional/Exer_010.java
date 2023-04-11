package com.jefferson.logic.english.conditional;

import java.util.Scanner;

public class Exer_010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);


        int currentYear, bornYear, age;

        System.out.print("Enter the current year: ");
        currentYear = sc.nextInt();

        System.out.print("Enter the year of birth: ");
        bornYear = sc.nextInt();

        age = currentYear - bornYear;

        System.out.println("Age: " + age);

        if(age > 18 && age < 70) {

            System.out.println("You can vote");
        } else if(age == 16 || age > 70){

            System.out.println("It is opcional");
        } else {

            System.out.println("You cannot vote");
        }

        sc.close();
    }
}
