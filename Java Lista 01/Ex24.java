package DefinitivoJava;

import java.util.Scanner;

public class Ex24 {
		public static void main(String [] args) {
			int numeroConta,centena,dezena,unidade,numeroContaInvertido,unid1,dez1,cent1,unid2,soma,multiplicação;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("insira um numero com 3 digitos");
			numeroConta = sc.nextInt();
			 
			centena = numeroConta / 100;
			dezena = (numeroConta % 100) / 10;
			unidade = numeroConta % 10;
			
			numeroContaInvertido = (unidade * 100) + (dezena * 10) + centena;
			System.out.printf("seu numero é %d", numeroConta);
			System.out.printf(" seu numero invertido é %d",numeroContaInvertido);
		    
			soma = numeroConta + numeroContaInvertido;
			unid1 = soma % 10;
			dez1 = (soma % 100) / 10;
			cent1 = soma / 100;
			multiplicação = (cent1 * 1) + (dez1 * 2) + (unid1 * 3);
			unid2 = multiplicação % 10;
			System.out.printf(" o verificador é %d",unid2);
		}
}
