package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont, n1, n2, tr = 0, te = 0, ta = 0;
        double media, total_classe = 0, media_classe;

        for (cont = 1; cont <= 6; cont++) {
            System.out.print("Digite a primeira nota: ");
            n1 = scanner.nextInt();
            System.out.print("Digite a segunda nota: ");
            n2 = scanner.nextInt();

            media = (n1 + n2) / 2.0;
            System.out.println("Média: " + media);

            if (media <= 3) {
                tr++;
                System.out.println("Reprovado");
            } else if (media > 3 && media < 7) {
                te++;
                System.out.println("Exame");
            } else if (media >= 7) {
                ta++;
                System.out.println("Aprovado");
            }

            total_classe += media;
        }

        System.out.println("Total de reprovados: " + tr);
        System.out.println("Total de exames: " + te);
        System.out.println("Total de aprovados: " + ta);

        media_classe = total_classe / 6;
        System.out.println("Média da classe: " + media_classe);
    }
}
