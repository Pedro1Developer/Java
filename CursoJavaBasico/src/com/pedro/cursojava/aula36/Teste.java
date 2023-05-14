package com.pedro.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Pedro");
		// contato.setEndereco("Lagoinha"); Nao funciona mais :D
		// contato.setNumero("4002-8922"); Nao funciona mais :D

		// Criar objeto da classe endereco;

		// relacionamento tem-um endereco
		Endereco end = new Endereco();

		end.setCep("38550-000");
		end.setCidade("Lagoinha");
		end.setComplemento("Logo Alí");
		end.setEstado("Acre");
		end.setNomeRua("Arthur Bernardes");
		end.setNumero("125");

		contato.setEndereco(end);

		// relacionamento tem-um endereco
		Telefone tel1 = new Telefone();

		tel1.setTipo("celular");
		tel1.setDdd("11");
		tel1.setNumero("4002-8922");
		
		Telefone tel2 = new Telefone();

		tel2.setTipo("casa");
		tel2.setDdd("34");
		tel2.setNumero("3841-8922");
		
		Telefone telefones[] = new Telefone[2];
		telefones[0] = tel1;
		telefones[1] = tel2;

		// contato.setTelefone(tel); Parou com o array
		
		contato.setTelefones(telefones);

		System.out.println(contato.getNome());

		// verifica se o endereco/telefone é nulo, tornando o código securo e evitando
		// erro :D
		// importante, eu acho
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getEstado());
		}

		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}

	}

}
