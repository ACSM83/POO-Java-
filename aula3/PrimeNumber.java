package aula03;

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um valor para determinar se é primo: ");
		int num = sc.nextInt();
		
		while (num <=0) {
			System.out.println("ERRO!! O número deverá ser maior que 0.");
			System.out.print("Insira um valor: ");
			num = sc.nextInt();
		}
		int total = 0;
		for(int c = 1; c < num+1; c++) {
			if(num % c == 0) {
				total += 1;
			}
		}
		if (total == 2) {
			System.out.print("O número " + num + " foi divisivel 2 vezes, logo é primo.");
		}else {
			System.out.print("O número " + num + " foi divisivel " + total + " vezes, logo não é primo.");
		}
		sc.close();
	}
}
