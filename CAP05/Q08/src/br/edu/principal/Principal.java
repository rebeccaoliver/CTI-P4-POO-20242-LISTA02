package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numTermos, i, num1, num2, num3;

        System.out.print("Digite o número de termos: ");
        numTermos = scanner.nextInt();

        num1 = 2;
        num2 = 7;
        num3 = 3;

        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);
        System.out.println("Terceiro número: " + num3);

        i = 4;

        while (i != numTermos) {
            num1 = num1 * 2;
            System.out.println("Número " + i + ": " + num1);
            i++;
            if (i != numTermos) {
                num2 = num2 * 3;
                System.out.println("Número " + i + ": " + num2);
                i++;
                if (i != numTermos) {
                    num3 = num3 * 4;
                    System.out.println("Número " + i + ": " + num3);
                    i++;
                }
            }
        }
    }
}
