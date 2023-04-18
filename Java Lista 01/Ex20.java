package DefinitivoJava;

import java.util.Scanner;

public class Ex20 {
	public static void main(String [] args) {
		double valorDeposito,juros,valorRendimento,valorTotal;
		
		Scanner banco = new Scanner(System.in);
		System.out.println("insira o valor do deposito");
		valorDeposito = banco.nextDouble();
		System.out.println("insira o valor do juros a ser calculado");
		juros = banco.nextDouble();
		valorRendimento = juros;
		valorTotal = valorDeposito + juros;
		System.out.printf("o valor do rendimento e %5.2f e o valor total e %5.2f",valorRendimento, valorTotal);
	}
}
