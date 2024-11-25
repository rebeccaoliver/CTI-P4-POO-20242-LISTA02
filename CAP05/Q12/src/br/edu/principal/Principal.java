package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totFolha, totPecas, mediaM, mediaF, salarioOp, salarioMaior;
        int cont, contM, contF, numOp, pecasOp, numMaior;
        String sexoOp;

        totFolha = 0;
        totPecas = 0;
        mediaM = 0;
        mediaF = 0;
        salarioMaior = 0;
        contM = 0;
        contF = 0;
        numOp = 0;
        pecasOp = 0;
        numMaior = 0;

        for (cont = 1; cont <= 15; cont++) {
            System.out.println("Digite o número do " + cont + "º operário:");
            numOp = scanner.nextInt();
            System.out.println("Digite o sexo do operário (M ou F):");
            sexoOp = scanner.next();
            System.out.println("Digite o total de peças fabricadas pelo " + cont + "º operário:");
            pecasOp = scanner.nextInt();

            if (pecasOp <= 30) {
                salarioOp = 450;
            } else if (pecasOp > 30 && pecasOp <= 50) {
                salarioOp = 450 + ((pecasOp - 30) * 3 / 100 * 450);
            } else {
                salarioOp = 450 + ((pecasOp - 30) * 5 / 100 * 450);
            }

            System.out.println("O operário de número " + numOp + " recebe salário = " + salarioOp);
            totFolha += salarioOp;
            totPecas += pecasOp;

            if (sexoOp == "M") { 
                mediaM += pecasOp;
                contM++;
            } else {
                mediaF += pecasOp;
                contF++;
            }

            if (cont == 1 || salarioOp > salarioMaior) {
                salarioMaior = salarioOp;
                numMaior = numOp;
            }
        }

        System.out.println("Total da folha de pagamento = " + totFolha);
        System.out.println("Total de peças fabricadas no mês = " + totPecas);

        if (contM == 0) {
            System.out.println("NENHUM HOMEM");
        } else {
            mediaM /= contM;
            System.out.println("Média de peças fabricadas por homens = " + mediaM);
        }

        if (contF == 0) {
            System.out.println("NENHUMA MULHER");
        } else {
            mediaF /= contF;
            System.out.println("Média de peças fabricadas por mulheres = " + mediaF);
        }

        System.out.println("O número do operário com maior salário é " + numMaior);
    }
}
