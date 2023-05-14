package com.pedro.cursojava.aula52.labs;

public class Agenda {

	Contato[] contatos;

	public Agenda() {
		contatos = new Contato[2];
	}

	public void adicionarContato(Contato c) throws AgendaCheiaException {

		boolean cheia = true;

		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				cheia = false;
				contatos[i] = c;
				break;
			}
		}
		if (cheia) {
			throw new AgendaCheiaException();
		}
	}

	public int consultarContatoNome(String nome) throws ContatoNaoExisteException {

		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			} else {
				throw new ContatoNaoExisteException();
			}
		}

		return -1;

	}

	public String mostrarAgenda() {
		String agenda = "";

		for (int i = 0; i < 2; i++) {

			agenda += "Contato " + i + 1 + "\n";


				agenda += "Nome: " + contatos[i].getNome() + "\n";
				agenda += "Telefone: " + contatos[i].getTelefone() + "\n";


			agenda += "----------\n";

		}

		return agenda;
	}
}
