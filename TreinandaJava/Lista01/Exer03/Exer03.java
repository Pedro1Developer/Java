package Exer03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Insira o primeiro número");
			double num1 = scan.nextDouble();
			System.out.println("Insira o segundo número");
			double num2 = scan.nextDouble();
			System.out.println("Soma = " + (num1 + num2));
		} catch (InputMismatchException a) {
			System.out.println("Número inválido");
		}
		
	}

}
