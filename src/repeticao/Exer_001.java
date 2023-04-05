package repeticao;

import java.util.Scanner;

public class Exer_001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        // variável
        int nota;

        System.out.print("Entre com a nota [ 0 a 10 ]: ");
        nota = sc.nextInt();

        while(nota < 0 || nota > 10){

            System.out.println("Nota errada !! ");
            System.out.print("Entre com a nota novamente: ");
            nota = sc.nextInt();
        }

        System.out.println(); // pular uma linha

        System.out.println("Programa finalizado");

        sc.close();
    }
}
