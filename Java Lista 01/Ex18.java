package DefinitivoJava;

import java.util.Scanner;

public class Ex18 {
	public static void main(String [] args) {
		double valorGasto,gorjeta;
		
		Scanner restaurante = new Scanner(System.in);
		System.out.println("insira o valor da conta");
		valorGasto = restaurante.nextDouble();
		
		gorjeta = valorGasto * 0.1;
		
		System.out.printf("o valor da conta fica %3.2f junto a gorjeta",valorGasto + gorjeta);
}
}