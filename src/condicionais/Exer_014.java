package condicionais;

import java.util.Scanner;

public class Exer_014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );

        int n1, n2,n3,maior = 0,menor = 0;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3 ){
            maior = n1;
            if(n2 > n3 ){
                menor = n3;
            }else {

                menor = n2;
            }


        } else if(n2 > n1 && n2 > n3) {

            maior = n2;
            if (n1 > n3) {

                menor = n3;
            } else{
                menor = n1;
        }
        } else if(n3 > n1 && n3 > n2) {

            maior = n3;
            if(n2 > n1) {

                menor = n1;
            } else {
                menor = n2;
            }
            }


        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);





        sc.close();
    }
}
