package com.pedro.cursojava.aula33.labs2;

import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Lampada lampada = new Lampada(null, null, 0, null, null, 0, args, false, false);

		String info = null;

		boolean loop = false;

		lampada.mostrarStatus();

		while (loop == false) {

			boolean infoValida = false;

			while (!infoValida) {
				System.out.println("Deseja ligar ou desligar a lâmpada?");
				info = scan.next();

				if (info.equalsIgnoreCase("Ligar") || info.equalsIgnoreCase("Desligar")) {
					infoValida = true;
				} else {
					System.out.println("Ação inválida - tente novamente");
				}
			}

			if (info.equalsIgnoreCase("Ligar")) {
				lampada.ligar();
				System.out.println("*A lâmpada ligou*");
			} else if (info.equalsIgnoreCase("Desligar") && lampada.isLigada()) {
				lampada.ligar();
				System.out.println("*A lâmpada desligou*");
			}

		}
	}

}
