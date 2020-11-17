package aula06;

class Triangulo extends Figura{
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo (int a, int b, int c, String cor){
		super(cor);
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
		return super.toString() + "Lado1 = " + lado1 + "; Lado2=" + lado2 + "; Lado3 = " + lado3;
	}
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}
	public double area() {
			int s = (lado1+lado2+lado3)/2;
			double area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
		return area;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + lado1;
		result = prime * result + lado2;
		result = prime * result + lado3;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulo other = (Triangulo) obj;
		if (lado1 != other.lado1)
			return false;
		if (lado2 != other.lado2)
			return false;
		if (lado3 != other.lado3)
			return false;
		return true;
	}
}
