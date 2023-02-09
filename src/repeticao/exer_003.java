package repeticao;

import java.util.Scanner;

public class exer_003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        boolean repete = true;

        do{
            System.out.print("Entre com o nome: ");
            String nome = sc.nextLine();

            System.out.print("Entre com a senha: ");
            String senha = sc.nextLine();

            if(nome.equalsIgnoreCase(senha)){
                System.out.println("Usuario e senhas iguais");

                repete = true;
            } else {

                repete = false;
            }
        }while(repete == true);


        sc.close();
    }
}
