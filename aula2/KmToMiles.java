package aula02;
import java.util.Scanner;

public class KmToMiles {
	public static void main(String[] args) {
		double km, miles;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza uma dist�ncia, em km, para convers�o: ");
		km = sc.nextDouble();
		if (km < 0) {
			System.out.println("ERRO: o valor introduzido n�o � v�lido!!!");
		}
		else {
			miles = km/1.609;
			System.out.println(km + "Km correspondem a " + miles + " milhas.");
		}
		sc.close();		
	}
}
