package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salBase, imposto = 0, gratificacao = 0, salLiquido;
        int tempo;

        System.out.print("Digite o salário base do funcionário: ");
        salBase = scanner.nextDouble();
        System.out.print("Digite o tempo de serviço do funcionário (em anos): ");
        tempo = scanner.nextInt();

        if (salBase < 200) {
            imposto = 0; 
        } else if (salBase <= 450) {
            imposto = 0.03 * salBase; 
        } else if (salBase < 700) {
            imposto = 0.08 * salBase; 
        } else {
            imposto = 0.12 * salBase; 
        }

        System.out.println("Imposto: R$ " + imposto);

        if (salBase > 500) {
            if (tempo <= 3) {
                gratificacao = 20; 
            } else {
                gratificacao = 30; 
            }
        } else {
            if (tempo <= 3) {
                gratificacao = 23; 
            } else if (tempo <= 6) {
                gratificacao = 35; 
            } else {
                gratificacao = 33; 
            }
        }

        System.out.println("Gratificação: R$ " + gratificacao);

        salLiquido = salBase - imposto + gratificacao;


        System.out.println("Salário Líquido: R$ " + salLiquido);

        if (salLiquido <= 350) {
            System.out.println("Classificação A");
        } else if (salLiquido < 600) {
            System.out.println("Classificação B");
        } else {
            System.out.println("Classificação C");
        }

        scanner.close();
    }
}
