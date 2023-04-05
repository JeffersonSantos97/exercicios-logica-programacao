package br.com.jefferson.logica.portugues.condicionais;
/*
Test 1:
Insira o primeiro número: 5
Insira o segundo número: 10
Maior número: 10

Teste 2:
Insira o primeiro número: 15
Insira o segundo número: 3
Maior número: 15

Teste 3:
Insira o primeiro número: -8
Insira o segundo número: -2
Maior número: -2

*/
import java.util.Scanner;

public class Exer_001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        /* Resumo inicial */

        // pedir dois numeros
        // imprimir o MAIOR deles


        // variaveis
        int n1, n2;

        // criacao da variavel Maior é pra evitar a repeticao de prints em cada possibilidade
        // Integer retorna o menor inteiro possivel
        int maior = Integer.MIN_VALUE;


        System.out.println("Entre com o primeiro numero: ");
        n1 = sc.nextInt();

        System.out.println("Entre com o segundo numero: ");
        n2 = sc.nextInt();

        // Logica de Condicao
        if(n1 > n2 ) {

            // n1 é o maior

            maior = n1;


        } else if(n2 > n1){

            // n2 é maior

            maior = n2;


        }

        System.out.println(" Bigger number" + maior);



    }
}
