package aula03;

import java.util.Random;

public class NotasTurma {
	public static void main(String[] args) {
		double [] nTeorica = new double[16];
		double [] nPratica = new double[16];
		double [] nFinal = new double[16];
		
		System.out.println("NotaT\t NotaP\t Pauta");
		for(int i = 0; i < 16; i++) {
			Random rand = new Random();
			nTeorica[i] = rand.nextDouble()*20;
			nPratica[i] = rand.nextDouble()*20;
			if (nTeorica[i] < 7.0 || nPratica[i] < 7.0) {
				nFinal[i] = 66;
			} else {
				nFinal[i] = 0.4 * nTeorica[i] + 0.6 * nPratica[i];
			}
			System.out.printf("%5.1f\t",nTeorica[i]);	
			System.out.printf("%6.1f\t",nPratica[i]);
			System.out.printf("%6.0f\t\n",nFinal[i]);
		}	
	}
}
