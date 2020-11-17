package aula03;
import java.util.Scanner;

public class NumDiasDoMesBissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduza o mês: ");
		int mes = in.nextInt();
		System.out.println("Introduza o ano: ");
		int ano = in.nextInt();
		int dias = 0;
		boolean bissexto = false;
		String meses = "";
		
		while (ano <1582) {
			System.out.println("Ano inválido. Pf Introduza ano superior a 1582: ");
			ano = in.nextInt();
		}
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			bissexto = true;
			System.out.printf("O ano %d é bissexto.", ano);
			System.out.println();
		}else {
			System.out.printf("O ano %d não é bissexto.", ano);
			System.out.println();
			bissexto = false;
		}
		while (mes < 1 && mes > 12) {
			System.out.println("Mês inválido. Pf indique um mês de 1 a 12: ");
			mes = in.nextInt();
		}
		in.close();
		switch (mes) {
			case 1:
				meses = "janeiro";
				dias = 31;
				break;
			case 2:
				meses = "fevereiro";
				if(bissexto == true) {
					dias = 29;
				} else {
					dias = 28;
				}
				break;
			case 3:
				meses = "março";
				dias = 31;
				break;
			case 4:
				meses = "abril";
				dias = 30;
				break;
			case 5:
				meses = "maio";
				dias = 31;
				break;
			case 6:
				meses = "junho";
				dias = 30;
				break;
			case 7:
				meses = "julho";
				dias = 31;
				break;
			case 8:
				meses = "agosto";
				dias = 31;
				break;
			case 9:
				meses = "setembro";
				dias = 30;
				break;
			case 10:
				meses = "outubro";
				dias = 31;
				break;
			case 11:
				meses = "novembro";
				dias = 30;
				break;
			case 12:
				meses = "dezembro";
				dias = 31;
				break;
		}
		System.out.printf("O mês de %s tem %d dias.", meses, dias);
	}
}

