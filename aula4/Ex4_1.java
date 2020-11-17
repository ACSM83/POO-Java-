package aula04;
import java.lang.String;
import java.util.Scanner;

public class Ex4_1 {
	public static void LowCase(String texto){
		String minusculas = texto.toLowerCase();
		System.out.println("Minúsculas: " + minusculas);
	}
	public static void CountChar(String texto) {
		int contarCarater = texto.replace(" ", "").length();
		System.out.println("O texto tem " + contarCarater + " carateres.");
	}
	public static void LastChar(String texto) {
		char ultimoCarater = texto.charAt(texto.length()-1);
		System.out.println("O último carater do texto é: " + ultimoCarater);
	}
	public static void FirstThreeChars(String texto) {
		CharSequence PrimeirosTresCarateres = texto.replaceAll(" ", "").subSequence(0, 3);
		System.out.println("Os três primeiros carateres são " + PrimeirosTresCarateres);
	}
	public static void DivideString(String texto) {
		String [] txt = texto.split(" ");
		for (String divisao : txt)
			System.out.println(divisao);
	}
	public static void FirstOccurrence(String texto) {
		int primeiraOcurrencia = texto.replaceAll(" ", "").toLowerCase().indexOf("a");
		System.out.println("A primeira ocorrência da letra a é na posição " + primeiraOcurrencia + ".");		
	}
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduza uma palavra, frase ou parágrafo: ");
		String texto = in.nextLine();
		LowCase(texto);
		CountChar(texto);
		LastChar(texto);
		FirstThreeChars(texto);
		DivideString(texto);
		FirstOccurrence(texto);
		in.close();
	}
	
}
