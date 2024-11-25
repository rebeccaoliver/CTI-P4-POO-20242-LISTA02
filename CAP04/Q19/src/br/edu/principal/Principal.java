package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double altura, peso;
        
        System.out.print("Digite a altura: ");
        altura = scanner.nextDouble();
        System.out.print("Digite o peso: ");
        peso = scanner.nextDouble();
        
        if (altura < 1.20) {
            if (peso <= 60) {
                System.out.println("Classificação: A");
            } else if (peso > 60 && peso <= 90) {
                System.out.println("Classificação: D");
            } else {
                System.out.println("Classificação: G");
            }
        } else if (altura >= 1.20 && altura <= 1.70) {
            if (peso <= 60) {
                System.out.println("Classificação: B");
            } else if (peso > 60 && peso <= 90) {
                System.out.println("Classificação: E");
            } else {
                System.out.println("Classificação: H");
            }
        } else {
            if (peso <= 60) {
                System.out.println("Classificação: C");
            } else if (peso > 60 && peso <= 90) {
                System.out.println("Classificação: F");
            } else {
                System.out.println("Classificação: I");
            }
        }

        scanner.close();
    }
}
