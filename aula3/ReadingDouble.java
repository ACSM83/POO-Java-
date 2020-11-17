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
        System.out.println("O valor máximo introduzido foi: " + maior);
        System.out.println("O valor mínimo introduzido foi: " + menor);
        System.out.println("O número de valores introduzidos foram: " + contador);
        System.out.printf("A média de valores é igual a %.2f: ", soma/contador);
	}
}
