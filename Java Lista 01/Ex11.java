package DefinitivoJava;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
			int dividendo,divisor,quociente,resto;
			
		Scanner mat = new Scanner(System.in);
		System.out.println("insira o dividendo");
		dividendo  = mat.nextInt();
		System.out.println("inisra o divisor");
		divisor = mat.nextInt();
		
		quociente = dividendo / divisor;
		resto = dividendo % divisor;
		
		System.out.printf("%d,%d,%d,%d",dividendo,divisor,quociente,resto);
		
	}

}
