package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double hora_i, min_i, hora_f, min_f, hora_d, min_d;
		
		System.out.println("Digite o horário inicial: ");
		System.out.print("Hora: ");
		hora_i = scanner.nextDouble();
		System.out.print("Minuto: ");
		min_i = scanner.nextDouble();
		System.out.println("Digite o horário final: ");
		System.out.print("Hora: ");
		hora_f = scanner.nextDouble();
		System.out.print("Minuto: ");
		min_f = scanner.nextDouble();
		
		if (min_i > min_f) {
			min_f += 60;
			hora_f -= 1;
		}
		
		if (hora_i > hora_f) {
			hora_f += 24;
		}
		
		min_d = min_f - min_i;
		hora_d = hora_f - hora_i;
		
		System.out.println("O jogo durou " + hora_d + " horas e " + min_d + " minutos");
		
		scanner.close();
	}

}
