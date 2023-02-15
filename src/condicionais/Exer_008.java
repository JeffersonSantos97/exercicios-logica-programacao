package condicionais;

import java.util.Scanner;

public class Exer_008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Media: " + media);
        if(media >= 6.0 ) {

            System.out.println("Aprovado");
        } else {

            System.out.println("Reprovado");
        }


        sc.close();

    }
}
