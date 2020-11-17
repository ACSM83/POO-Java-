package aula05;

public class Livro {
	public static int count = 100;
	private int id;
	private String titulo;
	private String tipoEmprestimo = "NORMAL";
	
	public Livro(int id, String titulo, String tipoEmprestimo) {
		this.id = id;
		this.titulo = titulo;
		this.tipoEmprestimo = tipoEmprestimo;
		id= count++;
	}
	
	public Livro(String titulo, String tipoEmprestimo) {
		this.titulo = titulo;
		this.tipoEmprestimo = tipoEmprestimo;
		id= count++;
	}
	public Livro(String titulo) {
		id= count++;
		this.titulo = titulo;
	}
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTipoEmprestimo(String s) {
		tipoEmprestimo = s;
	}
	public String getTipoEmprestimo() {
		return tipoEmprestimo;
	}
	
	public String toString() {
		return "Livro " + id + "; " + this.titulo + "; " + tipoEmprestimo + "\n";
	}
}
