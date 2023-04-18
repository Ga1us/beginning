package DefinitivoJava;

import java.util.Scanner;

public class Ex24 {
		public static void main(String [] args) {
			int numeroconta,centena,dezena,unidade,numerocontainvertido,unid1,dez1,cent1,unid2,soma,multiplicação;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("insira um numero com 3 digitos");
			numeroconta = sc.nextInt();
			 
			centena = numeroconta / 100;
			dezena = (numeroconta % 100) / 10;
			unidade = numeroconta % 10;
			
			numerocontainvertido = (unidade * 100) + (dezena * 10) + centena;
			System.out.printf("seu numero é %d", numeroconta);
			System.out.printf(" seu numero invertido é %d",numerocontainvertido);
		    
			soma = numeroconta + numerocontainvertido;
			unid1 = soma % 10;
			dez1 = (soma % 100) / 10;
			cent1 = soma / 100;
			multiplicação = (cent1 * 1) + (dez1 * 2) + (unid1 * 3);
			unid2 = multiplicação % 10;
			System.out.printf(" o verificador é %d",unid2);
		}
}
