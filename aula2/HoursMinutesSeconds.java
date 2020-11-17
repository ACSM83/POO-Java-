package aula02;
import java.util.Scanner;

public class HoursMinutesSeconds {
	public static void main(String[] args) {
		int sec;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um número de segundos: ");
		sec = sc.nextInt();
		String res = String.format("%02d horas, %02d minutos e %02d segundos\n", sec/3600, (sec%3600)/60, sec%60);
		System.out.println(res);
		sc.close();
	}
}
