package EstudoMesmo;
import java.util.Scanner;
public class Ex10 {
		public static void main(String [] args) {
			double valorDiaria,lucro,diariaNormal,valorArrecadado,valorArrecadadoPromoção;
			String original;
			
			Scanner hotel = new Scanner(System.in);
			System.out.println("insira a diaria normal");
			diariaNormal = hotel.nextDouble();
			
			valorDiaria = diariaNormal - 0.22 * 100;
			valorArrecadado = 16.8* 3; //16.8 é 40% de 42
			valorArrecadadoPromoção = 0.7 * 42 * 3; 
			
			lucro = valorArrecadadoPromoção - valorArrecadado;
			
			
			System.out.printf("A diaria com promoção fica %2.2f,valor arrecadado sem a promoção e %2.2f, ja com a promoção %2.2f",valorDiaria,valorArrecadado,valorArrecadadoPromoção);
			System.out.println( );
			System.out.printf("assim obtendo um lucro de %2.2f reais",lucro);
		}
}
