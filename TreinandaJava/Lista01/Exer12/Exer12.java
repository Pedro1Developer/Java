package Exer12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double altura = 0;
		double pesoIdeal;

		try {
			System.out.println("Informe a altura");
			altura = scan.nextDouble();

			pesoIdeal = 72.2 * altura - 58;

			System.out.println("O peso ideal é de " + pesoIdeal + "Kg");
		} catch (InputMismatchException e) {
			System.out.println("Número inválido");
		}

	}

}
