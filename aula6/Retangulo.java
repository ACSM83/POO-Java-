package aula06;


class Retangulo extends Figura{
	private double comprimento;
	private double altura;
	
	public Retangulo(double c, double a, String cor){
		super(cor);
		comprimento = c;
		altura = a;
	}
	public double getComprimento() {
		return comprimento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(comprimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
			return false;
		return true;
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
		return super.toString() + "Comprimento = " + comprimento + "; Altura = " + altura;
	}
	public double perimetro() {
		return 2*(comprimento + altura);
	}
	public double area() {
		return comprimento*altura;
	}
}
