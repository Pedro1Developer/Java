package Exer06;

import java.text.Format;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double raio = 0;
		double area = 0;

		System.out.println("Entre com o raio do círculo");
		raio = scan.nextDouble();

		area = Math.PI * (Math.pow(raio, 2));
		
		String output = String.format("Área = %.2f", area);

		System.out.println(output);

	}

}
