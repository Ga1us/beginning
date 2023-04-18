package EstudoMesmo;
import java.util.Scanner;
public class Ex14 {
		public static void main(String [] args) {
			double salarioTotal,salarioFixo,comissão1,comissão2,comissão3;
			Scanner loja = new Scanner(System.in);
			System.out.println("insira o salario fixo do empregado");
			salarioFixo = loja.nextDouble();
			System.out.println("quantas tv's LCD foram vendidas no mês");
			comissão1 = loja.nextDouble();
			System.out.println("quantas tv's LED foram vendidas no mês");
			comissão2 = loja.nextDouble();
			System.out.println("quantas tv's de  plasma foram vendidas no mês");
			comissão3 = loja.nextDouble();
		
			salarioTotal =salarioFixo + comissão1 * 50 + comissão2 * 60 + comissão3 * 55;
			System.out.printf("o salario do empregado nesse mes junto as comissoes é %2.2f",salarioTotal);
		}
}
