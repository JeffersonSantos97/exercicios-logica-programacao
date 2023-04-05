package br.com.jefferson.logica.portugues.condicionais;

import java.util.Scanner;

public class Exer_017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int meio = 0;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3 ) {

            maior = n1;

            if(n2 > n3) {
                menor = n3;
                meio = n2;

            } else {

                menor = n2;
                meio = n3;
            }
        }

        if(n2 > n1 && n2 > n3 ) {

            maior = n2;
            if(n1 > n3) {

                menor = n3;
                meio = n1;
            } else {

                menor = n1;
                meio = n3;
            }
        }

        if(n3 > n1 && n3 > n2 ) {

            maior = n3;

            if(n1 > n2 ) {

                menor = n2;
                meio = n1;
            } else {

                menor = n1;
                meio = n2;
            }
        }

        System.out.println(maior +" " + meio + " " +  menor );



        sc.close();
    }
}
