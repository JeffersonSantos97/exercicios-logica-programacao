package vetores;

import java.util.Scanner;

public class exer_004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorB = new int[15];
        int[] invert = new int[vetorB.length];
        for(int i = 0; i < vetorB.length; i++ ){

            vetorB[i] = sc.nextInt();
        }



        sc.close();
    }

}
