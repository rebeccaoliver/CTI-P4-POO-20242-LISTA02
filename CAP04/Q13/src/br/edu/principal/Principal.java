package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double op, sal, imp, aum, novo_sal;
		
		System.out.println("MENU DE OPÇÕES");
		System.out.println("1 - IMPOSTO");
		System.out.println("2 - NOVO SALÁRIO");
		System.out.println("3 - CLASSIFICAÇÃO");
		System.out.print("DIGITE A OPÇÃO DESEJADA: ");
		op = scanner.nextDouble();
		
		if (op == 1) {
			System.out.print("Digite seu salário: ");
			sal = scanner.nextDouble();
			if (sal < 500) {
				imp = sal * 5/100;
				System.out.println("O imposto é de" + imp + "");
			}			
		
		
			if (sal >= 500 && sal <= 850) {
				imp = sal * 10/100;
				System.out.println("O imposto é de" + imp + "");
			}
			
			if (sal > 850) {
				imp = sal * 15/100;
				System.out.println("O imposto é de" + imp + "");
			}
		}
			
		if  (op == 2) {
			System.out.print("Digite seu salário: ");
			sal = scanner.nextDouble();
			if (sal > 1500) {
				aum = 25;
				novo_sal = aum + sal;
				System.out.println("Novo salário é de " + novo_sal + "reais");
			}
		
			if (sal >= 750 && sal <= 1500) {
				aum = 50;
				novo_sal = aum + sal;
				System.out.println("Novo salário é de " + novo_sal + "reais");
			}
			
			if (sal >= 450 && sal <750) {
				aum = 75;
				novo_sal = aum + sal;
				System.out.println("Novo salário é de " + novo_sal + "reais");
			
			}
			
			if (sal < 450) {
				aum = 100;
				novo_sal = aum + sal;
				System.out.println("Novo salário é de " + novo_sal + "reais");
			}
		}
		
		if (op == 3) {
			System.out.print("Digite seu salário: ");
			sal = scanner.nextDouble();
			if (sal <= 700) {
				System.out.println("Mal remunerado");
			}
			if (sal > 700) {
				System.out.println("Bem remunerado");
			}	
		}
		
		if (op < 1 || op > 3) {
			System.out.println("Opção Inválida");
		}
		
		scanner.close();
	}


}
