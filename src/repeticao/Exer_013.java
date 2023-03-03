package repeticao;

import java.util.Scanner;

public class Exer_013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int numero;
        for(int i = 0 ; i < 5; i++ ) {
            numero = sc.nextInt();
            if(numero > maior) {

                maior = numero;
            }
        }
        System.out.println("Maior " + maior);



        sc.close();
    }
}
