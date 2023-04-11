package com.jefferson.logic.english.conditional;

import java.util.Scanner;

public class Exer_007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        String letter;

        System.out.print("Type a letter: ");
        letter = sc.nextLine();

        if(letter.length() > 1) {

            System.out.println("This is not a letter");
        }
         else if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
        letter.equalsIgnoreCase("u")){

        System.out.println( letter + " is a VOWEL");
        } else {

            System.out.println(letter + " is a CONSONANT ");
        }






        sc.close();
    }
}
