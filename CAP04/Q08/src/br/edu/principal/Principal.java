package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		      
		        double num1, num2, soma, raiz;
		        int op;
		        
		        System.out.println("MENU");
		        System.out.println("1- Somar dois números");
		        System.out.println("2- Raiz quadrada de um número");
		        System.out.print("O que você deseja fazer?: ");
		        
		        op = scanner.nextInt();
		        
		       
		        if (op == 1) { 
		            System.out.print("Digite um valor para o primeiro número: ");
		            num1 = scanner.nextDouble();
		            System.out.print("Digite um valor para o segundo número: ");
		            num2 = scanner.nextDouble();
		            
		            soma = num1 + num2;
		            System.out.println("A soma dos dois números é: " + soma);
		        } 
		        
		        else if (op == 2) {
		            System.out.print("Digite um número para calcular a raiz quadrada: ");
		            num1 = scanner.nextDouble();
		            
		            if (num1 >= 0) {
		                raiz = Math.sqrt(num1);
		                System.out.println("A raiz quadrada de " + num1 + " é: " + raiz);
		            } else {
		                System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
		            }
		        } 
		        
		        else {
		            System.out.println("Opção inválida! Tente novamente.");
		        }

		        
		        scanner.close();
		    }
		


	}

