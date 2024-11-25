package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int num1, num2, res, cont;
        
        num1 = 0;
        num2 = 1;

        System.out.println("Primeiro número da sequência Fibonacci: " + num1);
        System.out.println("Segundo número da sequência Fibonacci: " + num2);

        for (cont = 3; cont <= 8; cont++) {
            res = num1 + num2;
            System.out.println("O " + cont + "º número da sequência Fibonacci é: " + res);
            num1 = num2;
            num2 = res;
        }
    }
}
