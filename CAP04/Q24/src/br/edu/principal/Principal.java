package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco, valorAdicional = 0, imposto = 0, precoCusto, desconto = 0, novoPreco;
        String tipo, refrig;

        System.out.print("Digite o preço do produto: ");
        preco = scanner.nextDouble();
        System.out.print("Digite o tipo do produto (A - Alimentação, L - Limpeza, V - Vestuário): ");
        tipo = scanner.next();
        System.out.print("Digite a refrigeração (S - Refrigeração, N - Não Refrigeração): ");
        refrig = scanner.next();

        if (refrig.equals("N")) {
            if (tipo.equals("A")) {
                if (preco < 15) {
                    valorAdicional = 2;
                } else {
                    valorAdicional = 5;
                }
            } else if (tipo.equals("L")) {
                if (preco < 10) {
                    valorAdicional = 1.5;
                } else {
                    valorAdicional = 2.5;
                }
            } else if (tipo.equals("V")) {
                if (preco < 30) {
                    valorAdicional = 3;
                } else {
                    valorAdicional = 2.5;
                }
            }
        } else if (refrig.equals("S")) {
            if (tipo.equals("A")) {
                valorAdicional = 8;
            } else if (tipo.equals("L") || tipo.equals("V")) {
                valorAdicional = 0;
            }
        }

        System.out.println("Valor adicional: R$ " + valorAdicional);

        if (preco < 25) {
            imposto = 0.05 * preco;  
        } else {
            imposto = 0.08 * preco;  
        }

        System.out.println("Imposto: R$ " + imposto);
        precoCusto = preco + imposto;
        System.out.println("Preço de custo: R$ " + precoCusto);

        if (!(tipo.equals("A") && refrig.equals("S"))) {
            desconto = 0.03 * precoCusto;  
        } else {
            desconto = 0;
        }

        System.out.println("Desconto: R$ " + desconto);
        novoPreco = precoCusto + valorAdicional - desconto;
        System.out.println("Novo preço: R$ " + novoPreco);

        if (novoPreco <= 50) {
            System.out.println("Classificação: Barato");
        } else if (novoPreco < 100) {
            System.out.println("Classificação: Normal");
        } else {
            System.out.println("Classificação: Caro");
        }

        scanner.close();
    }
}
