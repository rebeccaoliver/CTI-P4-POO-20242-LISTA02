package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double e, fat;
        int n, i, j;

        e = 1.0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            fat = 1;
            for (j = 1; j <= i; j++) {
                fat *= j;
            }
            e += 1 / fat;
        }
        System.out.println("O valor final de e após " + n + " iterações é: " + e);
    }
}
