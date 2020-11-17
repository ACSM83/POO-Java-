package aula02;
import java.util.Scanner;

public class EnergyToHeatWater {
	public static void main(String[] args) {
		double m, initialTemperature, finalTemperature, q;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza a quantidade de �gua em quilogramas: ");
		m = sc.nextDouble();
		System.out.print("Indique a temperatura inicial da �gua, em �C: ");
		initialTemperature = sc.nextDouble();
		System.out.print("Indique a temperatura final da �gua, em �C: ");
		finalTemperature = sc.nextDouble();
		q = m * (finalTemperature - initialTemperature) * 4184;
		System.out.println("Para aquecer " + m + "kg de �gua, a uma temperatura inicial de " + 
		initialTemperature + "�C s�o necess�rios " + q + " joules de energia.");
		sc.close();
	}
}
