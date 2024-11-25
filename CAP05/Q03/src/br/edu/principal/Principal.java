package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n, num, fat, i, j;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números para calcular o fatorial: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + " para calcular o fatorial: ");
            num = scanner.nextInt();
            fat = 1;

            for (j = 1; j <= num; j++) {
                fat *= j;
            }

            System.out.println("O fatorial de " + num + " é: " + fat);
        }
    }
}
