package br.com.jefferson.logica.portugues.condicionais;
/*

Teste 1:
Entrada:
Letra: F

Saída esperada:
F - Feminino

====================
Teste 2:
Entrada:
Letra: M

Saída esperada:
M - Masculino

============================
Teste 3:
Entrada:
Letra: A

Saída esperada:
Sexo Inválido.
*/

import java.util.Scanner;

public class Exer_005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        // variavel
        String sexo;
        System.out.println("Entre com a letra do Sexo");
        sexo = sc.next();

        // Condicional
        if(sexo.equalsIgnoreCase("M")) {

            System.out.println("Masculino");
        } else if(sexo.equalsIgnoreCase("F")){

            System.out.println("Feminino");
        } else {

            System.out.println("Sexo Inválido");
        }


        sc.close();
    }
}
