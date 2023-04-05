package br.com.jefferson.logica.portugues.condicionais;
/*
Teste 1:
Entrada:
Número de maçãs compradas: 10

Saída esperada:
O custo total da compra é R$ 13,00.

Teste 2:
Entrada:
Número de maçãs compradas: 15

Saída esperada:
O custo total da compra é R$ 15,00.

Teste 3:
Entrada:
Número de maçãs compradas: 0

Saída esperada:
Número inválido de maçãs. O número deve ser maior que zero.
*/
import java.util.Scanner;

public class Exer_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double qtdMaca, total = 0.0, precoMacaMaior12 = 1.0,precoMenor12 = 1.30;

        // o motivo pra criar uma variável com cada preço, é que nós damos uma liberdade pra
        // se caso eu quiser mudar o preço

        System.out.print("Entre com a quantidade de Maças: ");
        qtdMaca = sc.nextDouble();

         if(qtdMaca < 12 && qtdMaca > 0) {

            total = qtdMaca * precoMenor12;
            System.out.println("O custo total da compra é R$ " + total);
        } else if(qtdMaca > 12){

            total = qtdMaca * precoMacaMaior12;
            System.out.println("O custo total da compra é R$ " + total);

        }else {

             System.out.println("Número inválido de maçãs. O número deve ser maior que zero.");
         }






        sc.close();
    }
}
