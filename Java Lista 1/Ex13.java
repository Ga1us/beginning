package DefinitivoJava;

import java.util.Scanner;

public class Ex13 {
		
	public static void main(String[] args) {
			double graus,fahr,kelvin;
			
			System.out.println("para conversão de celsius para fahrenheit e kelvin");
			
			Scanner conversao = new Scanner(System.in);
			
			System.out.println("insira em graus celsius a temperatura para conversão");
			graus = conversao.nextDouble();
			
			fahr = graus * 1.8 + 32;
			kelvin = graus + 273.15;
			
			System.out.printf("a temperatura %5.2f graus celsius convertida em fahrenheit é %5.2f e convertida em kelvin fica %5.2f", graus, fahr, kelvin);
				
			
		

		}
	
}
