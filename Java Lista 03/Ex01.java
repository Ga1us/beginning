package lista03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int num;
		Scanner par = new Scanner(System.in);
		System.out.println("insira um numero");
		num = par.nextInt();

		if (num % 2 != 0) {
			System.out.println("seu numero é impar");
		} else {
			System.out.println("seu numero é par");
		}
	}
}
