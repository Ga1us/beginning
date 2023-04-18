package class4;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		// Faça um programa que leia dois números inteiro e imprima-o
		int num1, num2;
		
		Scanner ex = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = ex.nextInt();
		
		System.out.println("Digite um numero: ");
		num2 = ex.nextInt();
		
		System.out.printf("Os numeros que você digitou foi: %d e %d",num1, num2);
	}

}
