package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, qtde, i;

        System.out.print("Digite um número: ");
        num = scanner.nextInt();
        qtde = 0;

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                qtde++;
            }
        }

        if (qtde > 2) {
            System.out.println("Número não primo");
        } else {
            System.out.println("Número primo");
        }
    }
}
