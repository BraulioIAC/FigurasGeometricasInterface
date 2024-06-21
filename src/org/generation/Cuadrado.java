package org.generation;

public class Cuadrado implements FormasGeometricas{
	private String nombre;
	private double lado;
	
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}

	public double calcularArea() {
		return Math.pow(2, lado);
	}
	
	public double calcularPerimetro() {
		return 4*lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
