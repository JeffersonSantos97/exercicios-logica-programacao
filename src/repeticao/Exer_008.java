package repeticao;

import java.util.Scanner;

public class Exer_008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        double popA = 0.0;
        double taxA = 0.0;
        double popB = 0.0;
        double taxB = 0.0;
        double temp = 0.0;
        boolean rep = true;
        do{
            System.out.println("Entre com a populacao A e a taxa de crescimento: " );
            popA = sc.nextDouble();
            taxA = sc.nextDouble();

            System.out.println("Entre com a pupulação B e a taxa de cresimento");
            popB = sc.nextInt();
            if(popA > popB) {

                rep = true;
                System.out.println("A população B não pode ser menor que a População A");

            } else {

                taxB = sc.nextInt();
            }
        }while(rep == true);

        while(popA < popB) {

            taxA += (popA * taxA) / 100;
            taxB += (popB * taxB) / 100;
            temp++;
        }



        sc.close();
    }
}
