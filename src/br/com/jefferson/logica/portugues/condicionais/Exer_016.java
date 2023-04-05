package br.com.jefferson.logica.portugues.condicionais;
/*
teste

Hora Inicial | Hora Final |        Resultado
        16      |      2     |   O Jogo durou 10 horas.
        0       |      0     |   O Jogo durou 24 horas.
        2       |      16    |   O Jogo durou 14 horas.

        */
import java.util.Scanner;

public class Exer_016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int horaInicio, horaFim,duracao = 0;

        /*
         quando eu passo de um dia para o outro, eu tenho que somar 24 + a minha hora final e subtrair pela hora inicial

         */

        horaInicio = sc.nextInt();
        horaFim = sc.nextInt();

        if(horaFim < horaInicio) {

            duracao = (horaFim + 24 ) - horaInicio;
        } else if(horaFim > horaInicio) {

            duracao = horaFim - horaInicio;
        } else {
            duracao = 24;
        }

        System.out.println("Duracao do jogo: " + duracao + " horas");

        

        sc.close();
    }
}
