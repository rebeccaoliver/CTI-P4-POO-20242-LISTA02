package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double x, y, z;
        
        System.out.println("Digite os valores do triangulo para descobrir se ele existe e seu tipo");
        
        System.out.print("Valor de x: ");
        x = scanner.nextDouble();
        System.out.print("Valor de y: ");
        y = scanner.nextDouble();
        System.out.print("Valor de z: ");
        z = scanner.nextDouble();
        
        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                System.out.println("Triângulo Equilátero");
            } else if (x == y || x == z || y == z) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Essas medidas não formam um triângulo");
        }

        scanner.close();
    }
}
