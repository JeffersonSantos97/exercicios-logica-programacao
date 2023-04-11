package br.com.jefferson.logica.portugues.condicionais;
/*
Teste 1: Entrada: 'a' Saída esperada: 'a é uma vogal'

Teste 2: Entrada: 't' Saída esperada: 't é uma consoante'

Teste 3: Entrada: 'E' Saída esperada: 'E é uma vogal'
 */
import java.util.Scanner;

public class Exer_007 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // variavel
        String letra;

        // pegando o valor do teclado
        System.out.print("Entre com a letra: ");
        letra = sc.next();

        // condicao
        if(letra.length() > 1){

            System.out.println("Isso não é uma letra");
        }
        else if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
        || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {

            System.out.println(letra + " é uma Vogal");
        } else {

            System.out.println(letra + " é uma consoante");
        }

        sc.close();


    }

}
