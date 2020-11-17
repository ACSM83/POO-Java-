package aula02;

import java.util.Scanner;

public class VelocidadeMedia { 
	public static void main(String[] args) {
		double v1, v2, vm;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza a primeira velocidade: ");
		v1 = sc.nextInt();
		System.out.print("Introduza a primeira distância: ");
		int d1 = sc.nextInt();
		System.out.print("Introduza a segunda velocidade: ");
		v2 = sc.nextInt();
		System.out.print("Introduza a segunda distância: ");
		int d2 = sc.nextInt();
		vm = (d1 + d2)/(d1/v1 + d2/v2);
		String res = String.format("A velocidade média é de %2.2f Km/h.", vm);
		System.out.println(res);
		sc.close();
	}
}