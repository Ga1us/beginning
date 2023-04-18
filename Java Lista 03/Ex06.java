package lista03;

import java.util.Scanner;

public class Ex06 {
			public static void main(String[]args) {
				int conta;
				double saldoBancarioTotal,saldoMensal;
				
				Scanner imposto = new Scanner(System.in);
				System.out.println("insira o numero da conta");
				conta = imposto.nextInt();
				System.out.println("insira o saldo bancario do total do semestre");
				saldoBancarioTotal= imposto.nextDouble();
				saldoMensal = saldoBancarioTotal / 6;
				
				if (saldoMensal <= 1000.00) {
					System.out.println("sua tarifa sera de 25.00 reais ");
				
				} else if (saldoMensal >= 1000.01 && saldoMensal <= 2000.00 ) { 
					System.out.printf("usuario da conta de numero %d sua tarifa vai ser 20.00 reais", conta);
				} else if (saldoMensal >= 2000.01 && saldoMensal <= 3500.00 ) { 
					System.out.printf("usuario da conta de numero %d sua tarifa vai ser 13.00 reais", conta);	
				} else if (saldoMensal >= 3500.00) { 
					System.out.printf("usuario da conta de numero %d voce tem tarifa isenta", conta);
			}   
		}
	}
