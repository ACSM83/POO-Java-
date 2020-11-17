package aula03;
import java.util.Scanner;

public class NotasPOO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a nota te�rica: ");
		double nTeorica = sc.nextDouble();
		
		while (nTeorica < 0 || nTeorica > 20) {
			System.out.println("Erro. A nota dever� ser maior que 0 e menor que 20.");
			System.out.print("Insira a nota te�rica: ");
			nTeorica = sc.nextDouble();
		}
		System.out.print("Insira a nota pr�tica: ");
		double nPratica = sc.nextDouble();
		sc.close();
		while (nPratica < 0 || nPratica > 20) {
			System.out.println("Erro. A nota dever� ser maior que 0 e menor que 20.");
			System.out.print("Insira a nota pr�tica: ");
			nPratica = sc.nextDouble();
		}
		
		if (nTeorica < 7 || nPratica < 7) {
			System.out.println("66. Reprovado por nota m�nima.");
		}else {
			double nFinal = (0.4 * nTeorica) + (0.6 * nPratica);
			System.out.printf("A nota final da disciplina � de %.0f valores.", nFinal);
		}
	}
}
