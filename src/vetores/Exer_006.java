package vetores;

import java.util.Scanner;

public class Exer_006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int posicao = 0;
        boolean continuar = true;
    do{
        System.out.println("Entre com a posição e depois os elementos: ");
        posicao = sc.nextInt();
        if(posicao <= 20 ){

            continuar = true;
        } else {

            System.out.println("O numero tem que ser menor ou igual a 20 !! ");
            continuar = false;
        }

    }while(continuar == false);

    // inicializei o vetorC

        int[] vetorC = new int[posicao];

        for(int i = 0; i < vetorC.length; i++ ) {

            vetorC[i] = sc.nextInt();
        }

        System.out.println("Quantidade de elementos: " + posicao);

        System.out.print("Vetor C = ");
        for(int i : vetorC){

            System.out.print(i + " ");

        }






        sc.close();
    }
}
