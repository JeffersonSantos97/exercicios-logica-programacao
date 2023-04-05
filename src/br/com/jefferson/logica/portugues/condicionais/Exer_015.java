package br.com.jefferson.logica.portugues.condicionais;

import java.util.Scanner;

public class Exer_015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        double prod1, prod2, prod3, menor = 0.0;

        prod1 = sc.nextDouble();
        prod2 = sc.nextDouble();
        prod3 = sc.nextDouble();

        if(prod1 < prod2 && prod1 < prod3) {

            menor = prod1;
        } else if (prod2 < prod3){

           menor = prod2;
        } else {

          menor = prod3;
        }

        System.out.println("Leve o produto com o preco " + menor);





        sc.close();
    }
}
