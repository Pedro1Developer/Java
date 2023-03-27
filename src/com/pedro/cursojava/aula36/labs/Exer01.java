package com.pedro.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o nome da agenda");
		String nomeAgenda = scan.nextLine();

		Agenda agenda = new Agenda(nomeAgenda);

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < 3; i++) {

			Contato cont = new Contato();

			System.out.println("Adicione o contato " + (i + 1));

			System.out.print("Nome: ");
			String nome = scan.next();
			cont.setNome(nome);

			System.out.print("Telefone: ");
			String telefone = scan.next();
			cont.setTelefone(telefone);

			System.out.print("Email: ");
			String email = scan.next();
			cont.setEmail(email);

			contatos[i] = cont;

		}
		
		agenda.setContatos(contatos);
		
		System.out.println(agenda.mostarInfos());

	}

}
