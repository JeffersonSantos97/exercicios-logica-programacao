package br.com.jefferson.logica.portugues.condicionais;

import java.util.Scanner;

public class Exer_019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);


        // perguntar o turno que vc estuda

        // M retorna Boa dia

        // V retorna Boa Tarde

        // N retorna noturno

        char turno;
        String nome;
        System.out.println("Entre com seu nome: ");
        nome = sc.nextLine();

        System.out.println("Entre com o turno");
        turno = sc.next().charAt(0);

        if(turno == 'M' || turno == 'm') {

            System.out.println("Bom dia " + nome );
        } else if(turno == 'V' || turno == 'v') {

            System.out.println("Boa Tarde " + nome);
        } else if(turno == 'N' | turno == 'n') {

            System.out.println("Boa noite " + nome);
        } else {

            System.out.println("Turno não existe !!! ");
        }






        sc.close();
    }
}
