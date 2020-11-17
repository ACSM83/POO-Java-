package aula03;

import java.util.Scanner;

public class MonthlyInvestmentRate {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduza o valor investido: ");
		double investment = in.nextDouble();
		
		while(investment < 1000 || investment % 1000 == 1) {
			System.out.println("ERRO. Valor inválido.");
			System.out.print("Introduza um valor múltiplo de 1000: ");
			investment = in.nextDouble();
		}
		System.out.print("Indique a taxa de juros mensal: ");
		double rate = in.nextDouble();
		
		while (rate < 0 || rate > 5) {
			System.out.println("A taxa de juros deve estar entre 0 e 5%.");
			rate = in.nextDouble();
		}
		in.close();
		System.out.println("Meses        Valor");
		double fund = investment;
		for(int i = 1; i <= 12; i++) {
			int formato = 19;
			if(i >= 10) formato = 18;
			fund = fund + (fund*rate)/100;
			System.out.printf(i + "%" + formato + ".2f\n", fund);
		}
	}
}
