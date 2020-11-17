package aula02;
import java.util.Scanner;

public class EnergyToHeatWater {
	public static void main(String[] args) {
		double m, initialTemperature, finalTemperature, q;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza a quantidade de água em quilogramas: ");
		m = sc.nextDouble();
		System.out.print("Indique a temperatura inicial da água, em ºC: ");
		initialTemperature = sc.nextDouble();
		System.out.print("Indique a temperatura final da água, em ºC: ");
		finalTemperature = sc.nextDouble();
		q = m * (finalTemperature - initialTemperature) * 4184;
		System.out.println("Para aquecer " + m + "kg de água, a uma temperatura inicial de " + 
		initialTemperature + "ºC são necessários " + q + " joules de energia.");
		sc.close();
	}
}
