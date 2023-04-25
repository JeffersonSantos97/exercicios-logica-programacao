package br.com.jefferson.logica.portugues.vetores;

import java.util.Scanner;

public class Exer_014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;
        int tamanho = 0;
        do{
            System.out.print("Entre com a quantidade de elementos [ 0 a 20 ] : ");
             tamanho = sc.nextInt();

             if(tamanho > 0 && tamanho <= 20){

                 repetir = false;
             }else {

                 System.out.println("Entre com uma quantidade válida");
             }
        }while(repetir);

        int[] vetor = new int[tamanho];
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Entre com o " + (i + 1) + " elemento: ");
            vetor[i] = sc.nextInt();

            if(vetor[i] > maior ){

                maior = vetor[i];
            }

            if(vetor[i] < menor ){

                menor = vetor[i];
            }
        }

        // Imprimir os elementos
        System.out.print("Vetor = ");

        for(int v : vetor){

            System.out.print(v + " ");
        }
        System.out.println(); // pular uma linha
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);



        sc.close();
    }
}
