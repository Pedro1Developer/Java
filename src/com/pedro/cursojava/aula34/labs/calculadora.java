package com.pedro.cursojava.aula34.labs;

public class calculadora {

	public static double somar(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}

	public static double potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	public static long fatorial(double num) {
		int fatorial = 1;

		for (int i = 1; i <= num; i++) {
			fatorial *= i;
		}

		return fatorial;
	}

}
