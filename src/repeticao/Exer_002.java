package repeticao;

import java.util.Scanner;

public class Exer_002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        for(int i = 0 ; i < 10; i++) {

             System.out.println( 1 + i ); // um abaixo do outro

            // System.out.print((1 + i) + " "); um do lado do outro
            // pra fazer um ficar do lado do outro, eu fiz um print sem o ln
        }


        sc.close();
    }
}
