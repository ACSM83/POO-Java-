package aula01;
import java.util.Scanner;

public class KmToMiles {
	public static void main(String[] args) {
		double km, miles;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira distância em km: ");
		km = sc.nextDouble();
		miles = km / 1.609;
		System.out.printf("A distância em milhas é %.2f milhas.", miles);
		sc.close();
	}
}
