package aula03;
import java.util.Scanner;

public class CountDownNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um valor para a contagem decrescente: ");
		int num = sc.nextInt();
		sc.close();
		while(num <= 0) {
			System.out.println("ERRO. O número deverá ser maior que 0.");
			System.out.print("Introduza um valor para contagem decrescente: ");
			num = sc.nextInt();
		}
		for (int i = num; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
