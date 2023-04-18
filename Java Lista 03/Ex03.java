package lista03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		double salario, salarioReajuste;
		Scanner empresa = new Scanner(System.in);
		System.out.println("insira seu salario");
		salario = empresa.nextDouble();

		if (salario < 350) {
			salarioReajuste = salario + salario * 0.5;
			System.out.printf("seu salario com o reajuste é %2.2f", salarioReajuste);
		} else {
			salarioReajuste = salario + salario * 0.3;
			System.out.printf("seu salario mais reajuste é %2.2f", salarioReajuste);
		}
	}
}
