package br.com.jefferson.logica.portugues.condicionais;

import java.util.Scanner;

public class Exer_018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);


        // jornada de trabalho SEMANAL 40 horas

        // se trabalhar mais que 40 horas semanais receberá extra

        // o extra é o valor da hora regular acrescido de 50%

        // ler numero de horas trabalhadas por mes

        // ler o salario por hora

        // retornar o salario total do funcionario

        int horasTrabalhadas = sc.nextInt();
        double salHora = sc.nextInt();
        double salTotal;
        int horaExtra = 0;
        double valorHoraExtra = 0;

        // 15 reais minha hora de trabalho
        // se eu trabalhei 160 horas, então eu vou ganhar ( 160 * 15 reais )
        // se eu trabalhei 170 horas ( 10 horas extras ), então eu vou receber (160 * 15 reais ) + ( 10 * 15% de 15 reais)
        // 170 - 160 == 10 horas extras == >

        if(horasTrabalhadas <= 160) {

            // se não tiver hora extra
            salTotal = horasTrabalhadas * salHora;


        } else{

            horaExtra = horasTrabalhadas - 160;
            valorHoraExtra = (horaExtra * ((50 * salHora) / 100));

            salTotal = ( 160  * salHora) + valorHoraExtra;

        }


        System.out.println("Salario Total = " + salTotal);
        System.out.println("Salario por hora = " + salHora);
        System.out.println("Horas extras = " + horaExtra);
        System.out.println("Valor da hora extra = " + valorHoraExtra);











        sc.close();

    }
}
