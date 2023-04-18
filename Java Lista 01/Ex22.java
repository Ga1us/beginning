package DefinitivoJava;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		double novoValor,valorPago,salarioMinimo,quilowatts,valorEnergia;
		
		Scanner energia = new Scanner(System.in);
		System.out.println("insira o valor do salario minimo");
		salarioMinimo = energia.nextDouble();
		System.out.println("insira a quantidade de quilowatts");
		quilowatts = energia.nextDouble();
		
		valorEnergia = quilowatts * (0.0014 * salarioMinimo);
		valorPago = valorEnergia + quilowatts;
		System.out.printf("o valor em reais de cada quilowatts é %2.2f , o valor em reais a ser pago ja e %2.2f e o valor com "
				+ "desconto e %2.2f"	,valorEnergia, valorPago, valorPago - (valorPago * 0.1) );
		
	}
}
