package class4;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// Crie um programa que leia um número real e imprima a terça parte deste número.
		double num1;
		
		Scanner ex = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = ex.nextDouble();
		
		System.out.printf("A terça parte deste número é: %f", num1 / 3);
		
		

	}

}
