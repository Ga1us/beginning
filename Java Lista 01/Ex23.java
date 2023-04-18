package DefinitivoJava;

import java.util.Scanner;

public class Ex23 {
	public static void mains(String [] args) {
		int litrosGastos,distancia,tempo,velocidadeMedia;
		
		try (Scanner viagem = new Scanner(System.in)) {
			System.out.println("insira a distacia a ser percorrida");
			distancia = viagem.nextInt();
			System.out.println("insira a velocidade");
			tempo = viagem.nextInt();
		}
		velocidadeMedia = distancia * tempo;
		litrosGastos = distancia * 12;
		
		System.out.printf("velocidade media %d, tempo %d, distancia %d e llitros gastos %d",velocidadeMedia,tempo,distancia,litrosGastos);
	}
}
