package com.pedro.cursojava.aula43.labs.exer03;

public class Mamifero extends Animal {

	private String Alimento;

	public Mamifero() {
	}

	public String getAlimento() {
		return Alimento;
	}

	public void setAlimento(String alimento) {
		Alimento = alimento;
	}

	@Override
	public String toString() {
		return super.toString() + "Alimento: " + Alimento;
	}
	
}
