package lista03;

import java.util.Scanner;

public class Ex07 {
		public static void main(String[]args) {
			double preçoDoLitro,consumoAnual,mediaMes;
			//String nomeDoPosto = ""
			
			
			Scanner myObj = new Scanner(System.in);
			System.out.println("coloque o nome do posto");
			
			String userName = myObj.nextLine();
			//System.out.println("nome do posto é " + userName);
			
			System.out.printf("insira o consumo anual de combustivel do posto " + userName );
			System.out.println("");
			consumoAnual = myObj.nextDouble();
			
			mediaMes = consumoAnual / 12;
			
			if (mediaMes <= 50000) {
				preçoDoLitro = 2.13 + 2.13 * 0.2;
				System.out.printf("o preço do litro vai ser %2.2f",preçoDoLitro);
			} else  {
				preçoDoLitro = 2.13 + 2.13 * 0.12;
				System.out.printf("o preço do litro vai ser %2.2f",preçoDoLitro);
			}
	}
}
