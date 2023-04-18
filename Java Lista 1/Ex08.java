package class4;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner ex = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = ex.nextInt();
		
		System.out.println("Digite um numero: ");
		num2 = ex.nextInt();
		
		System.out.printf("O produto entre esses numeros são: %d", num1 * num2);

}
}