package br.com.jefferson.logica.portugues.repeticao;

public class Exer_007 {
    public static void main(String[] args) {

        int popA = 80000;
        int popB = 200000;
        double taxA = 3;
        double taxB = 1.5;
        int temp = 0;
        while(popA < popB) {

            popA += (popA * taxA) / 100;
            popB += (popB * taxB) / 100;
            temp++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Tempo: " + temp);
    }
}
