package repeticao;

import java.util.Scanner;

public class Exer_012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            numero = sc.nextInt();

        }while(numero < 0 );

        for(int i = 1; i <= numero ; i++ ) {

            System.out.print(i + " ");
        }






        sc.close();
    }
}
