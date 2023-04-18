package EstudoMesmo;
import java.util.Scanner;
public class Ex11 {
		public static void main (String [] args) {
			double venda,custoFabricação,qtfarinha,valorQuiloFarinha,qtagua,valorLitroAgua,qtwatts,valorWattshora,impostoPão;
			
			System.out.println("para fabricação do pão");
			Scanner padaria = new Scanner(System.in);
			System.out.println("insira a quantidade de farinha em quilos");
			qtfarinha = padaria.nextDouble();
			System.out.println("insira o preço do quilo da farinha");
			valorQuiloFarinha = padaria.nextDouble();
			System.out.println("insira a quantidade de agua em litros");
			qtagua = padaria.nextDouble();
			System.out.println("o preço do litro da agua");
			valorLitroAgua = padaria.nextDouble();
			System.out.println("quantidade de kilowatts gasto para produção");
			qtwatts = padaria.nextDouble();
			System.out.println("insira o valor do kilowatts hora");
			valorWattshora = padaria.nextDouble();
			System.out.println("insira o valor do imposto pelo pão");
			impostoPão = padaria.nextDouble();
			
			custoFabricação = qtfarinha * valorQuiloFarinha + qtagua * valorLitroAgua + qtwatts * valorWattshora + impostoPão;
			venda = custoFabricação + 0.3 * 100;
			
			System.out.printf("o custo fabricação do pão é %2.2f e o lucro obtido vai ser %2.2f",custoFabricação,venda);
			
		}
}
