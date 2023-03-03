package condicionais;

import java.util.Scanner;

public class Exer_005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        String sexo = sc.next();

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
