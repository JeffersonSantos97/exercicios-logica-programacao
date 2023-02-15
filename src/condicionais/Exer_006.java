package condicionais;

import java.util.Scanner;

public class Exer_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double qtdMaca = sc.nextDouble();
        // o motivo pra criar uma variável com cada preço, é que nos dá uma liberdade pra
        // se caso eu quiser mudar o preço

        double precoMacaMaior12 = 1.0;
        double precoMenor12 = 1.30;
        double total = 0.0;

        if(qtdMaca < 12 ) {

            total = qtdMaca * precoMenor12;
        } else {

            total = qtdMaca * precoMacaMaior12;

        }

        System.out.println("Total: " + total);




        sc.close();
    }
}
