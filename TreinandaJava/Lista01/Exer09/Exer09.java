package Exer09;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double fahrenheit = 0;
		double celsius = 0;

		System.out.println("Informe a temperatura em graus °F");
		fahrenheit = scan.nextDouble();

		celsius = (5 * (fahrenheit - 32) / 9);

		String output = String.format("%.1f", celsius);

		System.out.println("°C = " + output);

	}

}
