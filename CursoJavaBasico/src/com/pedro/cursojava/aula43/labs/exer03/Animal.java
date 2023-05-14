package com.pedro.cursojava.aula43.labs.exer03;

public class Animal {

	private String nome;
	private String comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private String velocidade;

	public Animal() {
		this.patas = 4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		return "Animal: " + nome + "\nComprimento: " + comprimento + "\nQuantidade de patas: " + patas + "\nCor: " + cor
				+ "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade + "\n";
	}

}
