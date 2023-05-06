package com.pedro.cursojava.aula46.labs;

public class Cilindro extends Figura3D {

	private double diametro;
	private double altura;

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {

		double raio = diametro / 2;
		double areaBase = Math.PI * Math.pow(raio, 2);
		double volume = areaBase * altura;

		return volume;
	}

	@Override
	public double calcularArea() {

		double raio = diametro / 2;
		double area = 2 * Math.PI * raio * (raio + altura);

		return area;
	}

}
