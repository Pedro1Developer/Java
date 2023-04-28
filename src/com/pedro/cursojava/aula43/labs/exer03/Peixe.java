package com.pedro.cursojava.aula43.labs.exer03;

public class Peixe extends Animal {

	private String caracteristicas;

	public Peixe() {

		super.setPatas(0);
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return super.toString() + "caracteristicas= " + caracteristicas + "]";
	}

}
