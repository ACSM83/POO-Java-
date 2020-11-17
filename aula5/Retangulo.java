package aula05;

public class Retangulo {
	private double comprimento;
	private double altura;
	
	public Retangulo (double c, double a){
		comprimento = c;
		altura = a;
	}
	public double getComprimento() {
		return comprimento;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setComprimento(double c) {
		comprimento = c;
	}
	public void setAltura(double a) {
		altura = a;
	}
	
	public String toString() {
		return "Comprimento = " + comprimento + "; Altura = " + altura;
	}
	public double perimetro() {
		return 2*(comprimento + altura);
	}
	public double area() {
		return comprimento*altura;
	}
}
