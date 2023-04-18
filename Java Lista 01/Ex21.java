package DefinitivoJava;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		int horas,minutos,minutosDia,minutosConvertidos;
		
		Scanner relogio = new Scanner(System.in);
		System.out.println("insira as horas e os minutos");
		horas = relogio.nextInt();
		minutos = relogio.nextInt();
		minutosConvertidos = horas * 60; 
		minutosDia = 0 + (minutosConvertidos + minutos);
		System.out.printf("ja se passaram %d minutos",minutosDia);
	}
}
