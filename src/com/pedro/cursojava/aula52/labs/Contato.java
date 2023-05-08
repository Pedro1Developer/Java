package com.pedro.cursojava.aula52.labs;

public class Contato {

	private static int contador;
	private int id;

	private String nome;
	private String telefone;

	public Contato() {
		contador++;
		id = contador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		String s ="[id = " + id;
		s += ", nome = " + nome;
		s+= ", telefone = " + telefone;
		return s;
	}

}
