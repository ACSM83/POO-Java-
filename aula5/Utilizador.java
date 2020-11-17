package aula05;

import java.util.ArrayList;

public class Utilizador {
	private String nome;
	private int nMec;
	private String curso;
	private ArrayList<Integer> livros = new ArrayList<Integer>();
	
	public Utilizador(String nome, int nMec, String curso) {
		this.nMec = nMec;
		this.nome = nome;
		this.curso = curso;		
	}
	
	public void setnMec(int i) {
		nMec = i;
	}
	public int getNMec() {
		return nMec;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setLivro(int idLivro) {
		livros.add(idLivro);
	}
	
	public void EntregaLivro(int idLivro) {
		livros.remove(idLivro);
	}
	
	public ArrayList<Integer> getLivros() {
		return livros;
	}
	
	public String toString() {
		return "Aluno: " + nMec + "; " + nome + "; " + curso + "\n";
	}
}
