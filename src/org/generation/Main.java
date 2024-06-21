package org.generation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo tr = new Triangulo("Bermudas",20, 15, 15);
		imprimirTriangulo(tr);
		Triangulo t = new Triangulo("TrianguLOTE",250,175,145);
		imprimirTriangulo(t);
		
		Cuadrado c = new Cuadrado("Cuadrado 1",5);
//		Rectangulo rec = new Rectangulo("Rectangulo 1",5, 3);
		Rectangulo rec = new Rectangulo("Rectangulo 1",20, 15);
		Rombo ro = new Rombo("Rombo 1", 5, 4,8); 
		Romboide romb = new Romboide("Romboide 1", 10,7);
		Trapecio trap = new Trapecio("trapecio 1",6,6,5,8,5,8,4);
		
		System.out.println();
		printForma(tr);
		printForma(c);
		printForma(rec);
		printForma(ro);
		printForma(romb);
		printForma(trap);
	}
	
	
	public static void printForma(FormasGeometricas f){
		f.toString();
		System.out.println("+========================================+");
		System.out.println("El área de [" + f.getNombre()
				+ "] es: " + f.calcularArea());
		System.out.println("El perímetro de [" + f.getNombre()
		+ "] es: " + f.calcularPerimetro());
		System.out.println("+========================================+");
	}
	public static void imprimirTriangulo(Triangulo triangulo) {
		triangulo.toString();
		System.out.println("+========================================+");
		System.out.println("El área de [" + triangulo.getNombre()
				+ "] es: " + triangulo.calcularArea());
		System.out.println("El perímetro de [" + triangulo.getNombre()
		+ "] es: " + triangulo.calcularPerimetro());
		System.out.println("+========================================+");
	}

}
