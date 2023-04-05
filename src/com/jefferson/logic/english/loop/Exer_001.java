package com.jefferson.logic.english.loop;

import java.util.Scanner;

public class Exer_001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        boolean loop = true;

        do{
            System.out.print("Enter the number betweem 0 and 10: ");
            number = sc.nextInt();

            if(number < 0 || number > 10) {

                System.out.println("WRONG NUMBER !! ");
            } else{

                loop = false;

                System.out.println("Finished program");
            }

        }while(loop);










        sc.close();
    }
}
