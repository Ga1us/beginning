package lista03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		double imc, peso, altura, alturaReal;
		
		Scanner saude = new Scanner(System.in);
		System.out.println("insira seu peso");
		peso = saude.nextDouble();
		System.out.println("insira sua altura");
		altura = saude.nextDouble();
		alturaReal = altura / 100;
		imc = peso / Math.pow(alturaReal, 2);

		if (imc < 20) {
			System.out.println("abaixo do peso ideal");
		} else if (imc >= 20 && imc < 25) {
			System.out.println("peso ideal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("excesso de peso");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("obesidade");
		} else {
			System.out.println("obesidade morbida");
		}

	}
}
