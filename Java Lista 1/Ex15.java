package EstudoMesmo;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
	int valor1,valor2;
	
	Scanner usuario = new Scanner(System.in);
	System.out.println("escolha o valor da variavel 1");
	valor1 = usuario.nextInt();
	System.out.println("escolha o valor da variavel 2");
	valor2 = usuario.nextInt();
	

	
	System.out.printf("o valor da variavel um e %d e o valor da variavel dois e %d", valor2, valor1);
	
	
	}
}
