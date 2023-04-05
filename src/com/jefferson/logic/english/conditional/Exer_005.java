package com.jefferson.logic.english.conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer_005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letter;

        System.out.print("Enter the letter [ F for feminine ] or [ M for Masculine ]: ");
        letter = sc.next();
        if(letter.equalsIgnoreCase("f")) {

            System.out.println("FEMININE");
        } else if(letter.equalsIgnoreCase("M")) {

            System.out.println("MASCULINE");
        } else{

            System.out.println("INVALID SEX");
        }
        System.out.println();



        sc.close();
    }
}
