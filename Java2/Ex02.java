package EstudoMesmo;
import java.util.Scanner;
public class Ex02 {
		public static void main(String [] args) {
			double custoConsumidor,custoFabrica,distribuidor,imposto;
			
			Scanner concessionaria = new Scanner(System.in);
			System.out.println("insira custo pela fabricação");
			custoFabrica = concessionaria.nextDouble();
			
			custoConsumidor = custoFabrica + 12% custoFabrica + 30% custoFabrica;
			System.out.println(custoConsumidor);
		}
}
