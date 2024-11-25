package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, soma, qtd, maior, menor, qtd_par, soma_par, qtd_impar;
        double media, media_par, perc;

        qtd = 0;
        qtd_par = 0;
        soma_par = 0;
        qtd_impar = 0;
        soma = 0;
        
        maior = 0;
        menor = 0;
        
        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        if (qtd == 0) {
            maior = num;
            menor = num;
        }

        while (num != 30000) {
            if (qtd == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }

            soma += num;
            qtd++;

            if (num % 2 == 0) {
                soma_par += num;
                qtd_par++;
            } else {
                qtd_impar++;
            }

            System.out.print("Digite outro número (ou 30000 para finalizar): ");
            num = scanner.nextInt();
        }

        if (qtd == 0) {
            System.out.println("Nenhum número digitado");
        } else {
            System.out.println("Soma: " + soma);
            System.out.println("Quantidade de números: " + qtd);
            media = (double) soma / qtd;
            System.out.println("Média: " + media);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);

            if (qtd_par == 0) {
                System.out.println("Nenhum número par");
            } else {
                media_par = (double) soma_par / qtd_par;
                System.out.println("Média dos números pares: " + media_par);
            }

            perc = (double) qtd_impar * 100 / qtd;
            System.out.println("Percentual de números ímpares: " + perc + "%");
        }
    }
}
