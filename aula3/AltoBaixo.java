package aula03;

import java.util.Scanner;
import java.util.Random;

public class AltoBaixo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Vamos jogar ao Alto e Baixo!!");
		System.out.println("==============================");
		System.out.println("Vou pensar num número entre 1 e 100. Consegues adivinhar?");
		Random rand = new Random();
		int aleatorio = rand.nextInt(101);
		//System.out.println("Random = " + aleatorio);
		System.out.print("Qual o teu palpite? ");
		int valor = in.nextInt();
		int tentativas = 0;
		while(aleatorio != valor) {
			if (valor > aleatorio) {
				System.out.println("Muito alto. Tenta novamente.");
				tentativas += 1;
				System.out.print("Qual o novo palpite? ");
				valor = in.nextInt();
			}else{
				System.out.println("Muito baixo. Tenta novamente.");
				tentativas += 1;
				System.out.print("Qual o novo palpite? ");
				valor = in.nextInt();
			}
		}
		System.out.println("PARABÉNS!! Acertaste...");
		System.out.println("Foram precisas " + tentativas + " tentativas para venceres o jogo.");
		System.out.print("Pretendes continuar? Prima (S)im ");
		String resposta = in.next();
		if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
			System.out.print("YUPI! Vamos lá começar.");
		} else {
			System.out.print("Adeus. Até à próxima.");
			in.close();
		}
	}
}
