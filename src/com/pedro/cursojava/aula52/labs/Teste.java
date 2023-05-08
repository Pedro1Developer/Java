package com.pedro.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();

		System.out.println("-----Agenda-----");

		int opcao = 0;
		while (opcao != 3) {
			opcao = obterMenu(scan);

			if (opcao == 1) {

			} else if (opcao == 2) {
				adicionarContato(scan, agenda);
			}

		}

	}

	// METODOS

	public static int obterMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;

		while (!entradaValida) {

			System.out.println("Digite a opção desejada");
			System.out.println("1-Consultar contato");
			System.out.println("2-Adicionar contato");
			System.out.println("3-Sair");

			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;
				} else {
					entradaValida = false;
				}
			} catch (Exception e) {
				System.out.println("Opção inválida - tente novamente\n");
			}

		}

		return opcao;

	}

	public static void adicionarContato(Scanner scan, Agenda agenda) {

		try {
			System.out.println("Adicionando contato");
			String nome = lerInfo(scan, "Nome: ");
			String telefone = lerInfo(scan, "Telefone: ");

			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);

			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("--Contatos--");
			System.out.println(agenda.mostrarAgenda());
		}

	}

	public static String lerInfo(Scanner scan, String print) {

		System.out.println(print);
		String info = scan.nextLine();
		return info;
	}

}
