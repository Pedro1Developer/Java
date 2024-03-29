package com.pedro.cursojava.aula50;

public class ExceptionGenrica {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			} catch (Exception exc) {
				System.out.println(exc.getMessage());
				exc.printStackTrace();
			}
		}

	}

}
