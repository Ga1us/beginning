package EstudoMesmo;
import java.util.Scanner;
public class Ex04 {
		public static void main(String [] args) {
			double volume,base,altura;
			Scanner museuBritanico = new Scanner(System.in);
			System.out.println("insira a altura");
			altura = museuBritanico.nextDouble();
			System.out.println("insira a base");
			base = museuBritanico.nextDouble();
			
			volume = 0.33 * base * altura;
			System.out.printf("o volume da piramide com altura %2.2f"
					+ " e base %2.2f tem seu volume igual a %2.2f", altura,base,volume);
					
		}
}
