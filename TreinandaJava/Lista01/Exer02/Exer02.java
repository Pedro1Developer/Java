package Exer02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número");
		try {
			Double num = scan.nextDouble();
			System.out.println("O número informado foi " + num);
		} catch (InputMismatchException a) {
			System.out.println("Número inválido");
		}

	}

}
