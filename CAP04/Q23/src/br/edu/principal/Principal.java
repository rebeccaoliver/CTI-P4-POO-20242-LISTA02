package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salMin, coeficiente = 0, salBruto, imposto = 0, grat, auxilio, salLiquido;
        int nht;  
        String turno, categoria;

        System.out.print("Digite o salário mínimo: ");
        salMin = scanner.nextDouble();     
        System.out.print("Digite o turno (M - Matutino, V - Vespertino, N - Noturno): ");
        turno = scanner.next();    
        System.out.print("Digite a categoria (O - Operário, G - Gerente): ");
        categoria = scanner.next();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        nht = scanner.nextInt();

        if (turno.equals("M")) {
            coeficiente = 0.10 * salMin;  
        } else if (turno.equals("V")) {
            coeficiente = 0.15 * salMin;  
        } else if (turno.equals("N")) {
            coeficiente = 0.12 * salMin;  
        }

        System.out.println("Coeficiente: R$ " + coeficiente);
        salBruto = nht * coeficiente;
        System.out.println("Salário Bruto: R$ " + salBruto);

        if (categoria.equals("O")) {
            if (salBruto >= 300) {
                imposto = 0.05 * salBruto;  
            } else {
                imposto = 0.03 * salBruto;  
            }
        } else if (categoria.equals("G")) {
            if (salBruto >= 400) {
                imposto = 0.06 * salBruto;  
            } else {
                imposto = 0.04 * salBruto;  
            }
        }

        System.out.println("Imposto: R$ " + imposto);

        if (turno.equals("N") && nht > 80) {
            grat = 50;  
        } else {
            grat = 30;  
        }

        System.out.println("Gratificação: R$ " + grat);

        if (categoria.equals("O") || coeficiente <= 25) {
            auxilio = (1.0 / 3) * salBruto;  
        } else {
            auxilio = (1.0 / 2) * salBruto;  
        }

        System.out.println("Auxílio Alimentação: R$ " + auxilio);
        salLiquido = salBruto - imposto + grat + auxilio;
        System.out.println("Salário Líquido: R$ " + salLiquido);

        if (salLiquido < 350) {
            System.out.println("Mal Remunerado");
        } else if (salLiquido >= 350 && salLiquido <= 600) {
            System.out.println("Normal");
        } else {
            System.out.println("Bem Remunerado");
        }

        scanner.close();
    }
}
