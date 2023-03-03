package condicionais;

import java.util.Scanner;

public class Exer_011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        int n1, n2,n3;
        int maior = Integer.MIN_VALUE;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3 ) {

            maior = n1;
        } else if(n2 > n1 && n2 > n3 ) {

            maior = n2;
        } else {

            maior = n3;
        }

        System.out.println("Maior = " + maior );

        sc.close();
    }
}
