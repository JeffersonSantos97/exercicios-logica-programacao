package com.jefferson.logic.english.loop;

import java.util.Scanner;

public class Exer_005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);

        // variáveis
        boolean loop = true;
        String name;
        int ago;
        double salary;
        char sex;



        do{

            System.out.print("Enter the name [ greater than three characters ]: ");
            name = sc.nextLine();

            if( name.length() < 3) {
                System.out.println("Name less than three characters !!! ");

                loop = true;

            } else {

                loop = false;

            }


        }while(loop);

        do{

            System.out.print("Enter with ago [ between 0 and 150 ]:  ");
            ago = sc.nextInt();

            if(!(ago >=0 && ago <= 150)) {

                System.out.println("the ago is not between 0 and 100 !!!");

                loop = true;
            } else {

                loop = false;
            }
        }while(loop);


        do{

            System.out.print("Enter the salary [ greater than 0 ]: ");
            salary = sc.nextDouble();

            if(salary <= 0) {

                System.out.println("Salary is not greater than 0");
                loop = true;
            } else {

                loop = false;
            }
        }while(loop);


        do{

            System.out.print("Enter with sex [ F for female or M for male]: ");
            sex = sc.next().charAt(0);

            if(!(sex == 'F' || sex == 'f' || sex == 'm' || sex == 'M')){

                System.out.println("Sex invalid !! ");
                loop = true;
            } else {

                loop = false;
            }

        } while(loop);

    }

    /* marital status is your challenge */


}
