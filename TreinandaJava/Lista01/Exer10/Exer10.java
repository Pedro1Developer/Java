package Exer10;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double fahrenheit = 0;
		double celsius = 0;

		System.out.println("Informe a temperatura em graus °C");
		celsius = scan.nextDouble();

		fahrenheit = ((celsius * 9 / 5) + 32);

		String output = String.format("%.1f", fahrenheit);

		System.out.println("°F = " + output);

	}

}
