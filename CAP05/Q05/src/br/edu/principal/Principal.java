package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fim, i, j, x, expoente, numTermos, den, denominador, fat;
        double s;

        s = 0.0;
        denominador = 1;

        System.out.print("Digite o número de termos: ");
        numTermos = scanner.nextInt();

        System.out.print("Digite o valor de x: ");
        x = scanner.nextInt();

        for (i = 1; i <= numTermos; i++) {
            fim = denominador;
            fat = 1;

            for (j = 1; j <= fim; j++) {
                fat *= j;
            }

            expoente = i + 1;

            if (expoente % 2 == 0) {
                s -= Math.pow(x, expoente) / fat;
            } else {
                s += Math.pow(x, expoente) / fat;
            }

            if (denominador == 4) {
                den = -1;
            } else if (denominador == 1) {
                den = 1;
            } else {
                den = denominador;
            }

            if (den == 1) {
                denominador++;
            } else {
                denominador--;
            }
        }

        System.out.println("O valor de s é: " + s);
    }
}
