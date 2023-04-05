package br.com.jefferson.logica.portugues.condicionais;

import java.util.Scanner;

public class Exer_020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        double salarioFixo;
        double valorDasVendas;
        double comissao;
        double salarioTotal;

        // salario fixo

        // valor das vendas

        // comissão 3% sobre o total de vendas até 1500

        // se passar de 1500 mais 5% sobre o valor que passar

        // escrever o salario Total

        System.out.print("Entre com o salario fixo: ");
        salarioFixo = sc.nextDouble();


        System.out.print("Entre com o valor das vendas: ");
        valorDasVendas = sc.nextDouble();



        comissao = (salarioFixo * 3) / 100;

        salarioTotal = salarioFixo + comissao;

        boolean ehMaior = false;
        double comissaoMais = 0.0;
        double valorMais = 0.0;
        if(valorDasVendas > 1500) {

            ehMaior = true;
            valorMais = salarioFixo - 1500;
            comissaoMais = ( valorMais * 5 ) / 100;

            salarioTotal =+ comissaoMais;

        }

        System.out.println("Salario Fixo = " + salarioFixo);
        System.out.println("Valor das vendas = " + valorDasVendas);
        System.out.println("Salario total = " + salarioTotal);

        System.out.print("Comissão = " );
        if(ehMaior) {

            System.out.println(comissao + comissaoMais);
        }
        sc.close();

        }

    }
