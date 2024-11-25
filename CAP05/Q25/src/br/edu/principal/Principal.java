package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco, imp, transp, seguro, finalPreco, totalImp = 0;
        int origem;
        String meio_t, carga;

        System.out.print("Digite o preço: ");
        preco = scanner.nextDouble();

        while (preco > 0) {
            System.out.print("Digite a origem (1, 2 ou 3): ");
            origem = scanner.nextInt();

            System.out.print("Digite o meio de transporte (A para Aéreo, outro para outros): ");
            meio_t = scanner.next();

            System.out.print("Digite a carga (S para Sim, N para Não): ");
            carga = scanner.next().toUpperCase();

            if (preco <= 100) {
                imp = preco * 5 / 100;
            } else {
                imp = preco * 10 / 100;
            }

            if (carga.charAt(0) == 'S') {
                if (origem == 1) {
                    transp = 50;
                } else if (origem == 2) {
                    transp = 21;
                } else {
                    transp = 24;
                }
            } else {
                if (origem == 1) {
                    transp = 12;
                } else if (origem == 2) {
                    transp = 21;
                } else {
                    transp = 60;
                }
            }

            if (origem == 2 || meio_t.charAt(0) == 'A') {
                seguro = preco / 2;
            } else {
                seguro = 0;
            }

            finalPreco = preco + imp + transp + seguro;
            totalImp += imp;

            System.out.println("Imposto: " + imp);
            System.out.println("Transporte: " + transp);
            System.out.println("Seguro: " + seguro);
            System.out.println("Preço final: " + finalPreco);

            System.out.print("Digite o preço: ");
            preco = scanner.nextDouble();
        }

        System.out.println("Total de impostos: " + totalImp);
    }
}
