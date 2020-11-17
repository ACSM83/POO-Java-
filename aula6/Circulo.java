package aula06;

import aula06.Ponto;
import aula06.Figura;

import java.lang.Math;

class Circulo extends Figura {
	private Ponto centro;
	private double raio;

	public Circulo(Ponto c, double r, String cor) {
		super(cor);
		centro = c;
		raio = r;
	}
	public Ponto getCentro() {
		return centro;
	}
	public double getRaio() {
		return raio;
	}
	public void setCentro(Ponto c) {
		centro = c;
	}
	public void setRaio(double r) {
		raio = r;
	}
	public double perimetro() {
		return 2*Math.PI*raio;
	}
	public double area() {
		return Math.PI*raio*raio;
	}
	
	public boolean intercept(Circulo c) {
		double distance = distancia(c.getCentro(), centro);
		if(distance <= c.getRaio()+raio)
			return true;
		return false;
	}
	
	private double distancia(Ponto p1, Ponto p2) {
		return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		long temp;
		temp = Double.doubleToLongBits(raio);
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
		Circulo other = (Circulo) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return super.toString() + "Circulo [centro=" + centro + ", raio=" + raio + "]";
	}
}
