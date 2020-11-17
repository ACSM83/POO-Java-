package aula05;

import java.lang.Math;

public class Circulo {
	private Ponto centro;
	private double raio;
	
	public Circulo(Ponto c, double r) {
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
	
	public boolean equals(Circulo c) {
		if (c.getCentro().equals(centro) && c.getRaio()==raio)
			return true;
		return false;
	}
	public String toString() {
		return "Centro = " + centro + "; Raio = " + raio;
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
}
