package aula06;

import aula06.Circulo;
import aula06.Ponto;
import aula06.Retangulo;
import aula06.Triangulo;

public class Ex6_2 {
	public static void main(String [] args) {
		Ponto p1;
		Circulo c1, c2;
		Triangulo t1;
		Retangulo r1;
			
		p1 = new Ponto(10, 4);
		System.out.println("Ponto 1 = " + p1);
			
		c1 = new Circulo (new Ponto(7, 3), 4, "AZUL");
		System.out.println("Circulo1:\n" + c1);
		System.out.printf("Per�metro do circulo 1 = %.2f\n", c1.perimetro());
		System.out.printf("�rea do circulo 1 = %.2f\n", c1.area());
			
		c2 = new Circulo(new Ponto(1, 3), 2, "VERDE");
		System.out.println("Circulo2:\n" + c2);
		System.out.println("Circulo 1 igual a Circulo 2: " + c1.equals(c2));
			
		t1 = new Triangulo(12, 10, 10, "CASTANHO");
		System.out.println("Tri�ngulo:\n" + t1);
		System.out.println("Per�metro do tri�ngulo = " + t1.perimetro());
		System.out.println("�rea do tri�ngulo = " + t1.area());
		
		r1 = new Retangulo(8, 4, "AMARELO");
		System.out.println("Ret�ngulo:\n" + r1);
		System.out.println("Per�metro do ret�ngulo = " +r1.perimetro());
		System.out.println("�rea do tri�ngulo = " + r1.area());
		}
	}
