package condicionais;

import java.util.Scanner;

public class Exer_012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1 > n2 ) {

        System.out.println("Maior = " + n1);
        } else {

            System.out.println("Maior = " + n2);
        }







        sc.close();
    }
}
