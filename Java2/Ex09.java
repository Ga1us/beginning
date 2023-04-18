package EstudoMesmo;
import java.util.Scanner;
public class Ex09 {
		public static void main(String [] args) {
		
		int numeroFuncionario,horasTrabalhadas,filhos14;
		double valorHora,salarioFamilia,salarioTotal;
		
		Scanner Revolução = new Scanner (System.in);
		System.out.println("insira o numero de cadastro");
		numeroFuncionario = Revolução.nextInt();
		System.out.println("insira as horas trabalhadas");
		horasTrabalhadas = Revolução.nextInt();
		System.out.println("valor  por hora trabalhada");
		valorHora = Revolução.nextDouble();
		System.out.println("insira a quantidade filhos abaixo de 14 anos");
		filhos14 = Revolução.nextInt();
		System.out.println("valor do salario familia por filho");
		salarioFamilia = Revolução.nextDouble();

		salarioTotal = horasTrabalhadas * valorHora + salarioFamilia  * filhos14;
		
		System.out.printf("o salario do %d e %2.2f",numeroFuncionario,salarioTotal);
	}
}