package br.com.jefferson.logica.portugues.repeticao;

import java.util.Scanner;

public class Exer_017 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 50; i++ ){

            if(i % 2 != 0 ){

                System.out.println(i);
            }
        }






        sc.close();

    }

}
