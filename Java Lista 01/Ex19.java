package DefinitivoJava;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		double valorProduto, desconto;
		
		Scanner venda = new Scanner(System.in);
		System.out.println("insira o valor do produto para calculo com desconto de 9%");
		valorProduto = venda.nextDouble();
		
		desconto = valorProduto * 0.09;
		
		System.out.printf("o novo valor com desconto ficara %3.2f",valorProduto - desconto);
	}
}
