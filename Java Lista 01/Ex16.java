package DefinitivoJava;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		double salarioMinimo,salarioUsuario;
		
		Scanner salario = new Scanner(System.in);
		System.out.println("salario minimo para base de calculo insira por favor");
		salarioMinimo = salario.nextDouble();
		System.out.println("insira o salario para calculo");
		salarioUsuario = salario.nextDouble();
		
		System.out.printf("o seu salario equivale a %3.2f salario minimos de acordo com seua base", salarioUsuario / salarioMinimo);
}
}