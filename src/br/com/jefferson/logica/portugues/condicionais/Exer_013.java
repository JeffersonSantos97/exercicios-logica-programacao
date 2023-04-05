package br.com.jefferson.logica.portugues.condicionais;

import java.util.Scanner;

public class Exer_013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);


        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        if(n1 > n2 ){

            maior = n1;
            menor = n2;
        } else {

            maior = n2;
            menor = n1;
        }

        System.out.println(menor + " " + maior );






        sc.close();
    }
}
