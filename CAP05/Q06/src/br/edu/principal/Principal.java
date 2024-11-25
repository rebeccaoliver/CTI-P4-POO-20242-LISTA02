package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont, codigo, nht;
        double salMin = 450, valor, salInicial, aux, salFinal;
        char turno, categoria;

        for (cont = 1; cont <= 10; cont++) {
            System.out.print("Digite o código: ");
            codigo = scanner.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            nht = scanner.nextInt();

            System.out.print("Digite o turno (M, V ou N): ");
            turno = scanner.next().toUpperCase().charAt(0);

            while (turno != 'M' && turno != 'V' && turno != 'N') {
                System.out.print("Turno inválido. Digite novamente (M, V ou N): ");
                turno = scanner.next().toUpperCase().charAt(0);
            }

            System.out.print("Digite a categoria (G ou O): ");
            categoria = scanner.next().toUpperCase().charAt(0);

            while (categoria != 'G' && categoria != 'O') {
                System.out.print("Categoria inválida. Digite novamente (G ou O): ");
                categoria = scanner.next().toUpperCase().charAt(0);
            }

            if (categoria == 'G') {
                if (turno == 'N') {
                    valor = salMin * 18 / 100.0;
                } else {
                    valor = salMin * 15 / 100.0;
                }
            } else {
                if (turno == 'N') {
                    valor = salMin * 13 / 100.0;
                } else {
                    valor = salMin * 10 / 100.0;
                }
            }

            salInicial = nht * valor;

            if (salInicial <= 300) {
                aux = salInicial * 20 / 100.0;
            } else if (salInicial < 600) {
                aux = salInicial * 15 / 100.0;
            } else {
                aux = salInicial * 5 / 100.0;
            }

            salFinal = salInicial + aux;

            System.out.println("Código: " + codigo);
            System.out.println("NHT: " + nht);
            System.out.println("Valor por hora: " + valor);
            System.out.println("Salário inicial: " + salInicial);
            System.out.println("Auxílio: " + aux);
            System.out.println("Salário final: " + salFinal);
        }
    }
}
