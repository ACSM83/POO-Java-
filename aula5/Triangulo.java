package aula05;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo (int a, int b, int c){
		lado1 = a;
		lado2 = b;
		lado3 = c;
	}
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado1(int l1) {
		lado1 = l1;
	}
	public void setLado2(int l2) {
		lado2 = l2;
	}
	public void setLado3(int l3) {
		lado3 = l3;
	}
	public String toString() {
		return "Lado1 = " + lado1 + "; Lado2=" + lado2 + "; Lado3 = " + lado3;
	}
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}
	public double area() {
		//if((lado1+lado2) > lado3 && (lado1+lado3) > lado2 && (lado2+lado3) > lado1) {
			int s = (lado1+lado2+lado3)/2;
			double area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
		//}
		return area;
	}
}
