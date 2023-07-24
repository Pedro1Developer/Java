package Exer13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double altura = 0;
		String sexo = null;
		double pesoM;
		double pesoF;

		try {
			System.out.println("Entre com a altura");
			altura = scan.nextDouble();
			System.out.println("Entre com o sexo");
			sexo = scan.next();
		} catch (InputMismatchException e) {
			System.out.println("Número inválido");
		}

		pesoM = 72.2 * altura - 58;
		pesoF = 62.1 * altura - 44.7;
		String outputM = String.format("%.3f", pesoM);
		String outputF = String.format("%.3f", pesoF);

		if (sexo.equalsIgnoreCase(sexo) == sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("masculino")) {
			if (sexo.equalsIgnoreCase("feminino")) {
				System.out.println("Peso ideal com base na altura: " + outputF + "Kg");
			} else {
				System.out.println("Peso ideal com base na altura: " + outputM + "Kg");
			}
		} else {
			System.out.println("Sexo inválido");
		}

	}

}
