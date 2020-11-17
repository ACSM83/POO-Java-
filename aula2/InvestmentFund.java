package aula02;
import java.util.Scanner;

public class InvestmentFund {
	public static void main (String[] args) {
		double investment;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique o montante investido: ");
		investment = sc.nextDouble();
		if (investment < 0) {
			System.out.println("ERRO!! Por favor introduza um valor v�lido.");
		}
		else {
			System.out.print("Indique a taxa de juro mensal: ");
			double rate = sc.nextDouble();
			double fund = investment;
			for (int i= 1; i<=3; i++) {
				fund = fund + (fund*rate)/100;
			}
			System.out.println("Para um investimento de " + investment + "�, a uma taxa de juro de " + rate + "%, o montante ao fim de tr�s meses � de " + fund + "�.");
			sc.close();
		}	
	}
}