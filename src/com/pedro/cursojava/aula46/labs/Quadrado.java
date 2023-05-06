package com.pedro.cursojava.aula46.labs;

public class Quadrado extends Figura2D {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {

		double ladoQ = getLado();

		double area = ladoQ * ladoQ;

		return area;
	}

}
