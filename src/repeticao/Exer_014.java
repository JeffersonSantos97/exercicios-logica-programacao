package repeticao;

import java.util.Scanner;

public class Exer_014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 5;
        int mult;
        for(int i = 1 ; i <= 10; i++ ){

            mult = numero * i;

            System.out.println(numero + " X " + i + " = " + mult);
        }





        sc.close();
    }
}
