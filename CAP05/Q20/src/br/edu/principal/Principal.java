package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cod, num_h, cont_m, cont_f;
        double sal_b, sal_l, media_m, media_f;
        char sexo;
        
        media_m = 0;
        media_f = 0;
        cont_m = 0; 
        cont_f = 0;
        sal_l = 0;
        sal_b = 0;

        System.out.print("Digite o código do professor: ");
        cod = scanner.nextInt();

        while (cod != 99999) {
            System.out.print("Digite o sexo do professor (M/F): ");
            sexo = scanner.next().toUpperCase().charAt(0);  
            System.out.print("Digite o número de horas trabalhadas: ");
            num_h = scanner.nextInt();

            sal_b = num_h * 30;

            if (sexo == 'M') {
                sal_l = sal_b - (sal_b * 10 / 100);
                media_m += sal_l;
                cont_m++;
            } else if (sexo == 'F') {
                sal_l = sal_b - (sal_b * 5 / 100);
                media_f += sal_l;
                cont_f++;
            }

            System.out.println("Código: " + cod);
            System.out.println("Salário bruto: " + sal_b);
            System.out.println("Salário líquido: " + sal_l);

            System.out.print("Digite o código do próximo professor: ");
            cod = scanner.nextInt();
        }

        if (cont_m == 0) {
            System.out.println("Nenhum professor do sexo masculino");
        } else {
            media_m = media_m / cont_m;
            System.out.println("Média do salário líquido dos homens: " + media_m);
        }

        if (cont_f == 0) {
            System.out.println("Nenhum professor do sexo feminino");
        } else {
            media_f = media_f / cont_f;
            System.out.println("Média do salário líquido das mulheres: " + media_f);
        }
    }
}
