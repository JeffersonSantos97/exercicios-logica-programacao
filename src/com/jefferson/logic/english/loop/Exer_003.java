package com.jefferson.logic.english.loop;

import java.util.Scanner;

public class Exer_003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        String name;
        String password;
        boolean loop = true;


        do{
            System.out.print("Enter the name: ");
            name = sc.nextLine();

            System.out.print("Enter the password: ");
            password = sc.nextLine();

            if(name.equalsIgnoreCase(password)) {

                System.out.println("Same name and password");
                System.out.println(); // jump one line

            } else {

                System.out.println("Finished program ");
                loop = false;

            }

        } while(loop);



        sc.close();
    }
}
