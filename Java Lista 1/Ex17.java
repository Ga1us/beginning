package EstudoMesmo;

import java.util.Scanner;

public class Ex17 {

	public static void main(String [] args)  {
		double saldo,reajuste;
		
		Scanner empresa = new Scanner(System.in);
		System.out.println("imprima o saldo para calculo de reajuste");
		saldo = empresa.nextDouble();
		
		reajuste = saldo * 0.01;
		
		System.out.printf("se novo saldo com reajuste fica %2.2f", saldo + reajuste);
	}
}
