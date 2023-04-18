package EstudoMesmo;
import java.util.Scanner;
public class Ex05 {
		public static void main (String [] args) {
				int tempo;
				double preço;
				
				Scanner Charrete = new Scanner(System.in);
				System.out.println("insira o tempo de aluguel");
				tempo = Charrete.nextInt();
				
				if (tempo <= 3) {
					preço = 8.50;
				} else {
					preço = 8.50 + (tempo - 3) * 3.50;
				}
				System.out.printf("o preço é %2.2f",preço);
		}
}
