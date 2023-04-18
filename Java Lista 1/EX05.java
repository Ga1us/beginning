package class4;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		// Faça um programa que leia um número inteiro e imprima o seu sucessor e o seu antecessor.
		int num1;
		
		Scanner ex = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = ex.nextInt();
		
		System.out.printf("O numero que você escolheu foi %d, logo o sucessor é %d e o antecessor é %d", num1, num1 + 1, num1 - 1);
	}

}
