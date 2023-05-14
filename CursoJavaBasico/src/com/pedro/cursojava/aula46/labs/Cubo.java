package com.pedro.cursojava.aula46.labs;

public class Cubo extends Figura3D {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {

		double volume = Math.pow(lado, 3);

		return volume;
	}

	@Override
	public double calcularArea() {

		double area = 6 * (lado * lado);

		return area;
	}

}
