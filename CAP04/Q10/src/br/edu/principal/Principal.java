package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double a1, a2, m1, m2, d1, d2;
		
		System.out.println("Digite a primeira data:");
		System.out.print("Digite o dia da primeira data: ");
		d1 = scanner.nextDouble();
		System.out.print("Digite o mês da primeira data: ");
		m1 = scanner.nextDouble();
		System.out.print("Digite o ano da primeira data: ");
		a1 = scanner.nextDouble();
		System.out.println("Digite a segunda data: ");
		System.out.print("Digite o dia da SEGUNDA data: ");
		d2 = scanner.nextDouble();
		System.out.print("Digite o mês da SEGUNDA data: ");
		m2 = scanner.nextDouble();
		System.out.print("Digite o ano da SEGUNDA data: ");
		a2 = scanner.nextDouble();
		
		if (a1 > a2) {
			System.out.println("A maior data é " + d1 + "/" + m1 + "/" + a1  );	
			}
		
		else if (a2 > a1) {
			System.out.println("A maior data é " + d2 + "/" + m2 + "/" + a2 );
		}
		
		else if (m1 > m2) {
			System.out.println("A maior data é " + d1 + "/" + m1 + "/" + a1  );
		}
		
		else if (m2 > m1) {
			System.out.println("A maior data é " + d2 + "/" + m2 + "/" + a2  );
		}
		
		else if (d1 > d2) {
			System.out.println("A maior data é " + d1 + "/" + m1 + "/" + a1  );
		}

		else if (d2 > d1) {
			System.out.println("A maior data é " + d2 + "/" + m2 + "/" + a2  );
		}
		
		else {
			System.out.println("As datas são iguais");
		}
		
		scanner.close();
		
		
		

	}

}
