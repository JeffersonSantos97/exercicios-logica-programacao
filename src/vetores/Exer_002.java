package vetores;

import java.util.Scanner;

public class Exer_002 {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );


        String[] vetorA = new String[15];

        for(int i = 0; i < vetorA.length; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " elemento: ");
            vetorA[i] = sc.nextLine();
        }

        for(String i : vetorA) {

            System.out.println(i);
        }



        sc.close();
    }
}
