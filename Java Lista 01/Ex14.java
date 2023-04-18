package DefinitivoJava;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {	
	int numero,centena,dezena,unidade,numeroInvertido;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insira um numero com 3 digitos");
		numero = sc.nextInt();
		 
		centena = numero / 100;
		dezena = (numero % 100) / 10;
		unidade = numero % 10;
		
		numeroInvertido = (unidade * 100) + (dezena * 10) + centena;
		
		System.out.println(numeroInvertido);
	}
}