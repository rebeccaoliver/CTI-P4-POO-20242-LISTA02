package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double pre, venda, novo_pre;
		
		System.out.print("Pré: ");
		pre = scanner.nextDouble();
		System.out.print("Venda: ");
		venda = scanner.nextDouble();
		
		if (venda <500 || pre < 30) {
			novo_pre = pre + 10.0/100 * pre;
			System.out.println("Novo pŕe é de "+novo_pre+ "");
		}
		
		else if ((venda >=500 && venda<1200) || (pre >=30 && pre<80)){
			novo_pre = pre + 15.0/100 * pre;
			System.out.println("Novo pŕe é de "+novo_pre+ "");
		} else if (venda>=1200 || pre >=80) {
			novo_pre = pre - 20.0/100 * pre;
			System.out.println("Novo pŕe é de "+novo_pre+ "");
		}
		scanner.close();
		
	}
}