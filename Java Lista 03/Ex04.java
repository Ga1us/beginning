package lista03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		double x, y;

		Scanner descarte = new Scanner(System.in);
		System.out.println("insira coordenada x");
		x = descarte.nextDouble();
		System.out.println("insira coordenada y");
		y = descarte.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("coordenadas no quadrante 1");
		} else if (x < 0 && y < 0) {
			System.out.println("coordenadas no quadrante 3");
		} else if (x > 0 && y < 0) {
			System.out.println("coordenadas no quadrante 4");
		} else {
			System.out.println("coordenadas no quadrante 2");
		}
	}
}
