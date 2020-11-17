package aula02;
import java.util.Scanner;
import java.lang.Math;

public class DistanceBetweenPoints {
	public static void main(String[] args) {
		double x1, y1, x2, y2, distance;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a coordenada x do ponto 1: ");
		x1 = sc.nextDouble();
		System.out.print("Insira a coordenada y do ponto 1: ");
		y1 = sc.nextDouble();
		System.out.print("Insira a coordenada x do ponto 2: ");
		x2 = sc.nextDouble();
		System.out.print("Insira a coordenada y do ponto 2: ");
		y2 = sc.nextDouble();
		distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("A distância entre o p1 e p2 é igual a " + distance);
		sc.close();
	}
}
