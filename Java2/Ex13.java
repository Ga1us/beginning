package EstudoMesmo;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
			double numr,raiz,quadrado;
			
			Scanner math = new Scanner(System.in);
			System.out.println("insira um numero positivo");
			numr = math.nextInt();
			
			raiz = Math.sqrt(numr);
			quadrado = Math.pow(numr, 2);
			
			System.out.printf("seu numero foi %2.2f elevado a 2 e %2.2f e com sua raiz %2.2f",numr,quadrado,raiz);
			

	}

}
