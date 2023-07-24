package Exer05;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Metros: ");
		double metros = scan.nextDouble();

		double cent = metros * 100;
		System.out.println("Centímetros = " + cent);

	}

}
