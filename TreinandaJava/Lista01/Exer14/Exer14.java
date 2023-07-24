package Exer14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer14 {
	// Exer13+1
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double peso = 0;
		double excesso = 0;
		double multa = 0;

		try {
			System.out.println("Informe o peso do peixe em kg");
			peso = scan.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Número inválido");
		}

		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
		}

		String output = String.format("%.2f", multa);

		System.out.println("Valor da multa = " + output + "R$");

	}

}
