package br.com.jefferson.logica.portugues.condicionais;

import java.util.Scanner;

public class Exer_009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        double media = (n1 + n2 ) / 2;

        System.out.println(media);

        if(media == 10.0 ) {

            System.out.println("Aprovado com distinção");
        } else if(media >=7.0 && media < 10.0 ) {

            System.out.println("Aprovado");
        } else if(media < 7.0 && media > 0.0) {

            System.out.println("Reprovado");
        } else {

            System.out.println("TEM ALGUMA COISA ERRADA AI ");
        }




        sc.close();
    }
}
