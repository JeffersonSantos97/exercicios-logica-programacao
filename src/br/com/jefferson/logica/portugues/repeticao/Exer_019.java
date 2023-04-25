package br.com.jefferson.logica.portugues.repeticao;

import java.util.Scanner;

public class Exer_019 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Entre com o primeiro numero:");
        num1 = sc.nextInt();

        System.out.print("Entre com o segundo numero: ");
        num2 = sc.nextInt();

        for(int i = num1; i < num2 - 1; i++){

            System.out.println( i + 1 );
        }

        sc.close();

    }
}
