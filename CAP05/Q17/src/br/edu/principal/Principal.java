package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salCarlos, salJoao;
        int meses;
        
        meses = 0;
        
        System.out.print("Digite o salário de Carlos: ");
        salCarlos = scanner.nextDouble();
        
        salJoao = salCarlos / 3;
        
        while (salJoao < salCarlos) {
            salCarlos += salCarlos * 2 / 100;
            salJoao += salJoao * 5 / 100;
            meses++;
        }
        
        System.out.println("Meses para o salário de João atingir o de Carlos: " + meses);
    }
}
