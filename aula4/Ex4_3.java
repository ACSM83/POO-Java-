package aula04;
import java.util.Scanner;

public class Ex4_3 {
	public static void PhraseAcronym(String s) {
		String [] acronym = s.split(" ");
		System.out.print("Acrónimo: ");
		for (String resultado : acronym) {
			if (resultado.length() > 2) {
				System.out.print(resultado.charAt(0));
			}			
		}		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduza uma frase: ");
		String frase = in.nextLine().toUpperCase();
		in.close();
		
		PhraseAcronym(frase);
	}
}
