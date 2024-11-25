package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, numCriancas, meses, totM, totF, tot24;
        double porcM, porcF, porc24;
        char sexo;

        totM = 0;
        totF = 0;
        tot24 = 0;

        System.out.print("Digite o número de crianças nascidas no período: ");
        numCriancas = scanner.nextInt();

        if (numCriancas == 0) {
            System.out.println("NENHUMA CRIANÇA DIGITADA");
        } else {
            for (i = 1; i <= numCriancas; i++) {
                System.out.print("Digite o sexo da " + i + "ª criança: ");
                sexo = scanner.next().toUpperCase().charAt(0);
                System.out.print("Digite o tempo de vida (em meses) da " + i + "ª criança: ");
                meses = scanner.nextInt();

                if (sexo == 'M') {
                    totM++;
                } else if (sexo == 'F') {
                    totF++;
                }

                if (meses <= 24) {
                    tot24++;
                }
            }

            porcM = (double) totM * 100 / numCriancas;
            porcF = (double) totF * 100 / numCriancas;
            porc24 = (double) tot24 * 100 / numCriancas;

            System.out.println("Percentual de crianças do sexo feminino mortas: " + porcF);
            System.out.println("Percentual de crianças do sexo masculino mortas: " + porcM);
            System.out.println("Percentual de crianças com 24 meses ou menos mortas no período: " + porc24);
        }
    }
}
