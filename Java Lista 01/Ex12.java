package DefinitivoJava;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int base,altura,perimetro,area;
		
		Scanner matematica = new Scanner(System.in);
		System.out.println("insira a altura");
		altura = matematica.nextInt();
		System.out.println("insira a base");
		base = matematica.nextInt();
		perimetro = (base * 2) + (altura * 2);
		area = base * altura;
		
		System.out.printf("a base é %d e a altura é %d o perimetro é %d e a area é %d ",base, altura, perimetro, area);

	}

}
	