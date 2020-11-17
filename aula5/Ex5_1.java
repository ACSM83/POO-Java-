package aula05;
import aula05.Ponto;

public class Ex5_1 {
	public static void main(String [] args) {
		Ponto p1;
		Circulo c1, c2;
		Triangulo t1;
		Retangulo r1;
		
		p1 = new Ponto(10, 4);
		System.out.println("Ponto 1 = " + p1);
		
		c1 = new Circulo (new Ponto(7, 3), 4);
		System.out.println("Circulo1:\n" + c1);
		System.out.printf("Perímetro do circulo 1 = %.2f\n", c1.perimetro());
		System.out.printf("Área do circulo 1 = %.2f\n", c1.area());
		
		c2 = new Circulo(new Ponto(1, 3), 2);
		System.out.println("Circulo2:\n" + c2);
		System.out.println("Circulo 1 igual a Circulo 2: " + c1.equals(c2));
		
		t1 = new Triangulo(12, 10, 10);
		System.out.println("Triângulo:\n" + t1);
		System.out.println("Perímetro do triângulo = " + t1.perimetro());
		System.out.println("Área do triângulo = " + t1.area());
		
		r1 = new Retangulo(8, 4);
		System.out.println("Retângulo:\n" + r1);
		System.out.println("Perímetro do retângulo = " +r1.perimetro());
		System.out.println("Área do triângulo = " + r1.area());
	}
}
