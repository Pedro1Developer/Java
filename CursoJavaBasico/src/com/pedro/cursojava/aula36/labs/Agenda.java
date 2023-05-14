package com.pedro.cursojava.aula36.labs;

public class Agenda {

	private Contato[] contatos;
	private String nome;

	public Agenda(String nome) {
		super();
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String mostarInfos() {
		String info = "Agenda " + nome + "\n";
		int i = 0;

		if (contatos != null) {
			for (Contato c : contatos) {
				i++;
				info += c.obterInfo() + "\n";
			}
		}

		return info;
	}

}
