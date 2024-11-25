package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes, ano, hora, minuto;

        System.out.print("Digite o dia: ");
        dia = scanner.nextInt();
        System.out.print("Digite o mês: ");
        mes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        ano = scanner.nextInt();

        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

        switch (mes) {
            case 1:
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
                break;
            case 3:
                System.out.println("março");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("maio");
                break;
            case 6:
                System.out.println("junho");
                break;
            case 7:
                System.out.println("julho");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("setembro");
                break;
            case 10:
                System.out.println("outubro");
                break;
            case 11:
                System.out.println("novembro");
                break;
            case 12:
                System.out.println("dezembro");
                break;
            default:
                System.out.println("Mês inválido");
        }

        System.out.print("Digite a hora: ");
        hora = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        minuto = scanner.nextInt();

        System.out.print("Hora Atual: " + hora + ":");
        
        System.out.println(minuto < 10 ? "0" + minuto : minuto);

        scanner.close();
    }
}
	

