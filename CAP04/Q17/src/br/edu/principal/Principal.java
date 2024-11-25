package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a, b, c, delta, x1, x2;
        
        System.out.println("Digite os valores de a, b e c da equação de segundo grau.");
        System.out.print("Digite o valor de a: ");
        a = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("Estes valores não formam uma equação de segundo grau.");
        } else {
            delta = (b * b) - (4 * a * c);
            
            if (delta < 0) {
                System.out.println("Não existe raiz real.");
            } else if (delta == 0) {
                System.out.println("Existe uma raiz real.");
                x1 = -b / (2 * a);
                System.out.println("x1 = " + x1);
            } else {
                System.out.println("Existem duas raízes reais.");
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
        
        scanner.close();
    }
}
