package br.com.jefferson.logica.portugues.repeticao;

import java.util.Scanner;

public class Exer_016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, mult;

        boolean repete = true;
        do{
            System.out.println("Entre com um numero entre [ 0 e 10 ]: ");
            num = sc.nextInt();

            if(num >= 0 && num <= 10){
                for(int i = 0; i < 10; i++){
                    mult = num * (i + 1);
                    System.out.println(num + " x " + (i + 1) + " = " + mult);

                }
                repete = false;
            } else {
                System.out.println("Entre com o numero correto !! ");
            }

        }while(repete);





        sc.close();

    }
}
