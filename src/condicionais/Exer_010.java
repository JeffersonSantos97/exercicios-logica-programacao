package condicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer_010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoAtual = sc.nextInt();
        int anoNascimento = sc.nextInt();
        int idade = anoAtual - anoNascimento;

        System.out.println("Idade: " + idade);

        if(idade >= 18 && idade < 70 ) {

            System.out.println("PODE VOTAR");
        } else if( idade < 16 ) {

            System.out.println("NÃO PODE VOTAR");
        } else {

            System.out.println("VC VOTA SE QUISER ");
        }




        sc.close();
    }
}
