package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double preco, custo_est, imp, preco_final, adicional, maior_p, menor_p;
        int qtd_b, qtd_n, qtd_c;
        String refri, categ;
        Scanner scanner = new Scanner(System.in);
        
        adicional = 0;
        maior_p = 0;
        menor_p = 0;
        qtd_b = 0;
        qtd_n = 0;
        qtd_c = 0;
        custo_est = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Digite o preço: ");
            preco = scanner.nextDouble();

            System.out.print("Digite o refrigerante (S/N): ");
            refri = scanner.next();

            System.out.print("Digite a categoria (A/L/V): ");
            categ = scanner.next();

            if (preco <= 20) {
                if (categ.charAt(0) == 'A') {
                    custo_est = 2;
                } else if (categ.charAt(0) == 'L') {
                    custo_est = 3;
                } else { 
                    custo_est = 4;
                }
            } else if (preco > 20 && preco <= 50) {
                if (refri.charAt(0) == 'S') {
                    custo_est = 6;
                } else {
                    custo_est = 0;
                }
            } else { 
                if (refri.charAt(0) == 'S') {
                    if (categ.charAt(0) == 'A') {
                        custo_est = 5;
                    } else if (categ.charAt(0) == 'L') {
                        custo_est = 2;
                    } else { 
                        custo_est = 4;
                    }
                } else { 
                    if (categ.charAt(0) == 'A' || categ.charAt(0) == 'V') {
                        custo_est = 0;
                    } else if (categ.charAt(0) == 'L') {
                        custo_est = 1;
                    }
                }
            }

            if (refri.charAt(0) != 'A' && refri.charAt(0) != 'S') {
                imp = preco * 2 / 100;
            } else {
                imp = preco * 4 / 100;
            }

            preco_final = preco + custo_est + imp;

            System.out.println("Custo Estimado: " + custo_est);
            System.out.println("Imposto: " + imp);
            System.out.println("Preço Final: " + preco_final);

            if (preco_final <= 20) {
                qtd_b++;
                System.out.println("Classificação Barato");
            } else if (preco_final > 20 && preco_final <= 100) {
                qtd_n++;
                System.out.println("Classificação Normal");
            } else { 
                qtd_c++;
                System.out.println("Classificação Caro");
            }

            adicional += custo_est + imp;

            if (i == 1) {
                maior_p = preco_final;
                menor_p = preco_final;
            } else {
                if (preco_final > maior_p) {
                    maior_p = preco_final;
                }
                if (preco_final < menor_p) {
                    menor_p = preco_final;
                }
            }
        }

        adicional /= 12;
        System.out.println("Adicional médio: " + adicional);
        System.out.println("Maior preço final: " + maior_p);
        System.out.println("Menor preço final: " + menor_p);
        System.out.println("Quantidade Classificação Barato: " + qtd_b);
        System.out.println("Quantidade Classificação Normal: " + qtd_n);
        System.out.println("Quantidade Classificação Caro: " + qtd_c);
    }
}
