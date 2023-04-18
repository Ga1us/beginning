package class4;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// Crie um programa que leia dois números inteiros e imprimir a soma
		int num1, num2;
		
		Scanner ex = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = ex.nextInt();
		
		System.out.println("Digite um numero: ");
		num2 = ex.nextInt();
		
		System.out.printf("a Soma entre esses numeros são: %d", num1 + num2);

	}

}
