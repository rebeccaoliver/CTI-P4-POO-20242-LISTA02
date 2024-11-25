package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sal, valor_kw, gasto, acresc, total, tot_geral = 0;
        int qtd, tipo, qtd_cons = 0;
        
        System.out.print("Digite o valor do salário: ");
        sal = scanner.nextDouble();
        System.out.print("Digite a quantidade de kw consumidos: ");
        qtd = scanner.nextInt();

        valor_kw = sal / 8;

        while (qtd != 0) {
            gasto = qtd * valor_kw;

            System.out.print("Digite o tipo de cliente (1, 2, ou 3): ");
            tipo = scanner.nextInt();

            if (tipo == 1) {
                acresc = gasto * 5 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10 / 100;
            } else if (tipo == 3) {
                acresc = gasto * 15 / 100;
            } else {
                acresc = 0;
            }

            total = gasto + acresc;
            tot_geral += total;

            if (total >= 500 && total <= 1000) {
                qtd_cons++;
            }

            System.out.println("Gasto: " + gasto);
            System.out.println("Acréscimo: " + acresc);
            System.out.println("Total: " + total);

            System.out.print("Digite a quantidade de kw consumidos (ou 0 para encerrar): ");
            qtd = scanner.nextInt();
        }

        System.out.println("Total geral: " + tot_geral);
        System.out.println("Quantidade de consumidores com gasto entre 500 e 1000: " + qtd_cons);
    }
}
