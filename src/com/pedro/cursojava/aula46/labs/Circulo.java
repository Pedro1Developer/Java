package com.pedro.cursojava.aula46.labs;

public class Circulo extends Figura2D {

	private double diametro;

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	@Override
	public double calcularArea() {

		double diametro = getDiametro();

		double area = ((diametro / 2) * (diametro / 2)) * Math.PI;

		return area;
	}

}
