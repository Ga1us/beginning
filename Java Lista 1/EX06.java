package class4;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// Crie um programa que leia o nome, endereço e telefone e imprima-os
		String nome, ende;
		int fone;
		
		Scanner ex = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = ex.next();
		
		System.out.println("Digite seu endereço: ");
		ende = ex.next();
		
		System.out.println("Digite seu telefone: ");
		fone = ex.nextInt();
		
		System.out.printf("Seu nome, endereço e telefone são: %s, %s e %d", nome, ende, fone);
	}

}
