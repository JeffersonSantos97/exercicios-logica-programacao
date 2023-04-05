package br.com.jefferson.logica.portugues.condicionais;
/*
  Teste 1:
Entrada:
Valor: 15
Saída esperada:
É MAIOR QUE 10!

======================
Teste 2:
Entrada:
Valor: 10

Saída esperada:
NÃO É MAIOR QUE 10!

====================
Teste 3:
Entrada:
Valor: 5

Saída esperada:
NÃO É MAIOR QUE 10!
 */
import java.util.Scanner;

public class Exer_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        // Ler um valor
        // MAIOR QUE 10
        // MENOR QUE 10


        // variavel
        int n1;
        System.out.print("Entre com o valor: ");
        n1 = sc.nextInt();
        if(n1 > 10) {

            System.out.println("É MAIOR QUE 10");
        } else {

            System.out.println("NÃO É MAIOR QUE 10");
        }


        sc.close();
    }
}
