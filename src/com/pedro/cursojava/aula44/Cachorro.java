package com.pedro.cursojava.aula44;

public class Cachorro extends Mamifero {
	
	private String tamanho;
	private String raca;
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void amamentar() {
		
	}
	@Override
	public void emitirSom() {
		
	}
	
}
