package Exer11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		double num3 = 0;

		try {

			System.out.println("Entre com o primeiro número inteiro");
			num1 = scan.nextInt();
			System.out.println("Entre com o segundo número inteiro");
			num2 = scan.nextInt();
			System.out.println("Entre com um número real");
			num3 = scan.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Número inválido");
		}

		double a = ((num1 * 2) * (num2 / 2));
		double b = ((num1 * 3) + (num3));
		double c = Math.pow(num3, 3);

		System.out.println("a) = " + a);
		System.out.println("b) = " + b);
		System.out.println("c) = " + c);

	}

}
