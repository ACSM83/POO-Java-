package aula03;

import java.util.Scanner;

public class ReadingDouble {
	public static void main(String[] args) {
		double primeiro, maior, menor, soma, contador,novoValor;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um valor real: ");
		primeiro = sc.nextDouble();
		maior = primeiro;
		menor = primeiro;
		soma = primeiro;
		contador = 1;
		
		do {
			System.out.print("Insira um valor real: ");
			novoValor = sc.nextDouble();
			
			if(novoValor > maior) {
				maior = novoValor;
			}
			if(novoValor < menor) {
				menor = novoValor;
			}
			
			soma += novoValor;
			contador ++;
		}while(novoValor != primeiro);
		sc.close();
        System.out.println("O valor m�ximo introduzido foi: " + maior);
        System.out.println("O valor m�nimo introduzido foi: " + menor);
        System.out.println("O n�mero de valores introduzidos foram: " + contador);
        System.out.printf("A m�dia de valores � igual a %.2f: ", soma/contador);
	}
}
