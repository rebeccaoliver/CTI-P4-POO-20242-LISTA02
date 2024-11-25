package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double salario, aumento, novo_sal;
		int cargo;
		System.out.print("Digite o cargo do funcionário (1, 2, 3, 4 ou 5) ");
		cargo = scanner.nextInt();
		System.out.print("Digite o valor do salário: ");
		salario = scanner.nextDouble();
		
		if (cargo == 1) {
			System.out.println("O cargo é Escriturário");
			aumento = salario * 50 / 100;
			System.out.println("O valor do aumento é " + aumento + "reais");
			
			novo_sal = salario + aumento;
			System.out.println("O novo salário é " + novo_sal + "reais");
		}
		
		else if (cargo == 2) {
			System.out.println("O cargo é Secretário");
			aumento = salario * 35 / 100;
			System.out.println("O valor do aumento é " + aumento + "reais");
			
			novo_sal = salario + aumento;
			System.out.println("O novo salário é " + novo_sal + "reais");
		}
		
		else if (cargo == 3) {
			System.out.println("O cargo é Caixa");
			aumento = salario * 20 / 100;
			System.out.println("O valor do aumento é " + aumento + "reais");
			
			novo_sal = salario + aumento;
			System.out.println("O novo salário é " + novo_sal + "reais");
		}
		
		else if (cargo == 4) {
			System.out.println("O cargo é Gerente");
			aumento = salario * 10 / 100;
			System.out.println("O valor do aumento é " + aumento + "reais");
			
			novo_sal = salario + aumento;
			System.out.println("O novo salário é " + novo_sal + "reais");
		}
		
		else if (cargo == 5) {
			System.out.println("O cargo é Diretor");
			aumento = salario * 0 / 100;
			System.out.println("O valor do aumento é " + aumento + "reais");
			
			novo_sal = salario + aumento;
			System.out.println("O novo salário é " + novo_sal + "reais");
		}
		
		else {
			System.out.println("Cargo Inexistente");
			
		}
		
		scanner.close();
	}

}
