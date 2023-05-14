package com.pedro.cursojava.aula43.labs.exer02;

public abstract class Contribuinte {

	private String Nome;
	private double rendaBruta;

	public Contribuinte() {
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	@Override
	public String toString() {
		return "Nome = " + Nome + "; Renda bruta = " + rendaBruta + "; ";
	}

	public abstract double calcularImposto();

}
