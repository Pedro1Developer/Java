package Exer04;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] notas = new double[4];
		double soma = 0;

		for (int i = 0; i < 4; i++) {

			System.out.println("Insira a nota " + (i+1));
			notas[i] = scan.nextDouble();

			soma += notas[i];
			
		}
		
		System.out.println("Média = " + (soma/4));

	}

}
