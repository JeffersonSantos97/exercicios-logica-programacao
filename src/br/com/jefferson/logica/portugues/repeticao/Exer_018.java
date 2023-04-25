package br.com.jefferson.logica.portugues.repeticao;

import java.util.Scanner;

public class Exer_018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int num, qtdNegativos = 0;

        for(int i = 0; i < 10; i++){

            System.out.println("Entre com um numero: ");
            num = sc.nextInt();

            if(num < 0){

                qtdNegativos++;
            }
        }

        System.out.println("Quantidade de Negativos: " + qtdNegativos);



    sc.close();
    }
}
