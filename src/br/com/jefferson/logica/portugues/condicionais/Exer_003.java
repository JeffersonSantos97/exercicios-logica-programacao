package br.com.jefferson.logica.portugues.condicionais;
/*
Teste 1:
Entrada:
Valor: 10

Saída esperada:
O valor é positivo.

Teste 2:
Entrada:
Valor: -5

Saída esperada:
O valor é negativo.

Teste 3:
Entrada:
Valor: 0

Saída esperada:
O valor é positivo (por convenção, consideramos que zero é um valor positivo).
*/
import java.util.Scanner;

public class Exer_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        // variavel
        int valor;
        System.out.print("Entre com o valor: ");
         valor = sc.nextInt();

         // condicional
        if(valor >=0 ) {

            System.out.println("O valor é Positivo");
        } else {

            System.out.println("O valor é Negativo");
        }


        sc.close();

    }
}
