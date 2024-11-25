package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contTime, contJog, qtde, tot80, idade;
        double mediaIdade, mediaAltura, porc, peso, alt;
        
        qtde = 0;
        tot80 = 0;
        mediaAltura = 0;

        for (contTime = 1; contTime <= 5; contTime++) {
            mediaIdade = 0;
            for (contJog = 1; contJog <= 11; contJog++) {
                System.out.print("Digite a idade do jogador " + contJog + " do time " + contTime + ": ");
                idade = scanner.nextInt();

                System.out.print("Digite o peso do jogador " + contJog + " do time " + contTime + ": ");
                peso = scanner.nextDouble();

                System.out.print("Digite a altura do jogador " + contJog + " do time " + contTime + ": ");
                alt = scanner.nextDouble();

                if (idade < 18) {
                    qtde++;
                }
                mediaIdade += idade;
                mediaAltura += alt;
                
                if (peso > 80) {
                    tot80++;
                }
            }

            mediaIdade = mediaIdade / 11;
            System.out.println("Média de idade do time " + contTime + ": " + mediaIdade);
        }

        System.out.println("Quantidade de jogadores com menos de 18 anos: " + qtde);
        mediaAltura = mediaAltura / 55;
        System.out.println("Média de altura dos jogadores: " + mediaAltura);

        porc = (tot80 * 100.0) / 55;
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porc + "%");
    }
}
