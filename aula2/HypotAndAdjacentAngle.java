package aula02;

import java.util.Scanner;
import java.lang.Math;

public class HypotAndAdjacentAngle {
	public static void main(String[] args) {
		double catA, catB;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza o valor do cateto A: ");
		catA = sc.nextInt();
		System.out.print("Introduza o valor do cateto B: ");
		catB = sc.nextInt();
		double hipotC = Math.hypot(catA, catB);
		System.out.printf("A hipotenusa é igual a %2.2f" , hipotC);
		double alpha = Math.atan(catA / catB);
		double alphaInDegrees = Math.toDegrees(alpha);
		System.out.println();
		System.out.printf("O ângulo alpha tem %2.0fº", alphaInDegrees);
		sc.close();
	}
}
