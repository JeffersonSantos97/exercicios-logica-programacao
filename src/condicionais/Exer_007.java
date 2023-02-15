package condicionais;

import java.util.Scanner;

public class Exer_007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String letra = sc.next();

        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
        || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {

            System.out.println("Vogal");
        } else {

            System.out.println("CONSOANTE");
        }




        sc.close();


    }

}
