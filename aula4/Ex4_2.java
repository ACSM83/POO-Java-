package aula04;
import java.util.Scanner;
import java.lang.String;

public class Ex4_2 {
	public static int countDigits(String s) {
		int contarDigitos = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				contarDigitos ++;
			}
		}
		System.out.println("A frase tem " + contarDigitos + " dígitos numéricos.");
		return contarDigitos;
	}
	public static int countBlankSpaces(String s) {
		int contarEspacos = 0;
		for (int i = 0; i< s.length(); i++) {
			if (s.charAt(i) == ' ') {
				contarEspacos++;
			}
		}
		System.out.println("E " + contarEspacos + " espaços em branco.");
		return contarEspacos;
	}
	public static boolean isAllLowerCase(String f) {
		for(int i=0; i <f.length(); i++) {
			if (Character.isLetter(f.charAt(i)) && !Character.isLowerCase(f.charAt(i) )){
				return false;
			}
		}
		return true;
	}
	
	public static String RemoveExtraSpaces(String f) {
		return f.trim().replaceAll(" +", " ");
	}
	
	public static boolean isAPalindrome(String s) {
		String frase = s.toLowerCase().trim().replaceAll(" +", "");
		int i = 0;
		int cumprimentoFrase = frase.length() -1;
		while (i < cumprimentoFrase) {
			if(frase.charAt(i) != frase.charAt(cumprimentoFrase))
				return false;
				i++;
				cumprimentoFrase--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduza uma frase: ");
		String frase = in.nextLine();
		in.close();
		countDigits(frase);
		countBlankSpaces(frase);
		System.out.println("A frase está em minúsculas? " + isAllLowerCase(frase));
		System.out.println("A frase sem espaços extra fica: " + RemoveExtraSpaces(frase));
		if (isAPalindrome(frase)) {
			System.out.println("A frase: " + frase + " é um palíndromo.");
		}else {
			System.out.println("A frase: " + frase + " NÃO é um palíndromo.");
		}
	}
}
