package aula06;

import java.util.Arrays;

public class Conjunto {
	public int[] Conjunto;
	
	public Conjunto() {
		 
	}
	public void insert(int n) {
		if (this.Conjunto == null) {
			this.Conjunto = new int[1];
			this.Conjunto[0] = n;
		}else {
			if (verificaSeExiste(this.Conjunto,n)) {
				return;
			}
			this.Conjunto = Arrays.copyOf(this.Conjunto, this.Conjunto.length + 1);
			this.Conjunto[this.Conjunto.length-1] = n;
		}
	}
	public boolean contains(int n) {
		for(int i = 0; i < this.Conjunto.length; i++) {
			if (Conjunto[i] == n) 
				return true;
		}
		return false;
	}
	public void remove(int n) {
		int [] ConjuntoNovo = new int[ this.Conjunto.length - 1];
		int contador = 0;
		for (int i = 0; i < this.Conjunto.length; i++) {
			if(Conjunto[i] != n) {
				ConjuntoNovo[contador] = Conjunto[i];
				contador +=1;
			}			
		}
		this.Conjunto = ConjuntoNovo; 
	}
	public void empty() {
		this.Conjunto = new int[0];
	}

	@Override
	public String toString() {
		return Arrays.toString(Conjunto).replace("[", "").replace("]", "").replace(",", "");
	}
	
	public int size() {
		return Conjunto.length;
	}
	
	public Conjunto unir(Conjunto add) {
		Conjunto resultado = new Conjunto();
		resultado.Conjunto = new int[this.Conjunto.length];
		
		resultado.Conjunto = Arrays.copyOf(this.Conjunto, this.Conjunto.length);
		
		for (int i = 0; i < add.Conjunto.length; i++) {
			if (verificaSeExiste(resultado.Conjunto, add.Conjunto[i]) == false) {
				resultado.Conjunto = Arrays.copyOf(resultado.Conjunto, resultado.Conjunto.length + 1);
				resultado.Conjunto[resultado.Conjunto.length -1] = add.Conjunto[i];
			}
		}		
		return resultado ; 
	}
	
	public Conjunto interset(Conjunto intersect) {
		Conjunto resultado = new Conjunto();
		resultado.Conjunto = new int[0];
		for (int i = 0; i < this.Conjunto.length; i++) {
			if (verificaSeExiste(intersect.Conjunto,this.Conjunto[i])) {
				resultado.Conjunto = Arrays.copyOf(resultado.Conjunto, resultado.Conjunto.length + 1);
				resultado.Conjunto[resultado.Conjunto.length -1] = this.Conjunto[i];
			}
		}		
		return resultado; 
	}
	
	public Conjunto subtrair(Conjunto subtract) {
		Conjunto resultado = new Conjunto();
		resultado.Conjunto = new int[0];
		
		for (int i = 0; i < this.Conjunto.length; i++) {
			if (verificaSeExiste(subtract.Conjunto, this.Conjunto[i]) == false) {
				resultado.Conjunto = Arrays.copyOf(resultado.Conjunto, resultado.Conjunto.length + 1);
				resultado.Conjunto[resultado.Conjunto.length -1] = this.Conjunto[i];
			}
		}		
		return resultado ; 
	}
	
	
	private static boolean verificaSeExiste(int[] arr, int valorEntrada) {
		boolean existe = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valorEntrada) {
				return true;
			}
		}
		return existe;
	}
}