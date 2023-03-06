package com.pedro.cursojava.aula33.labs2;

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("03481824");
		conta.setAgencia(045);
		conta.setSaldo(13000);
		conta.setEspecial(false);
		conta.setLimiteEspecial(800);

		boolean sair = false;
		boolean inputValido = false;
		int input = 0;
		double valorSaque = 0;
		double valorDeposito = 0;

		while (!sair) {

			input = 0;
			inputValido = false;

			while (!inputValido) {
				System.out.println("Banco\n[1] - Realizar saque           [2] - Realizar deposito\n"
						+ "[3] - Consultar saldo          [4] - Consultar limite especial\n" + "[5] - Sair");
				input = scan.nextInt();

				if (input > 0 || input < 6) {
					inputValido = true;
				} else {
					System.out.println("Ação inválida");
				}
			}

			if (input == 1) {
				conta.realizarSaque(valorSaque, scan);
			} else if (input == 2) {
				conta.realizarDeposito(valorDeposito);
			} else if (input == 3) {
				conta.exebirSaldo();
			} else if (input == 4) {
				conta.exibirLimiteEspecial();
			} else {
				sair = true;
			}

		}

	}

}
