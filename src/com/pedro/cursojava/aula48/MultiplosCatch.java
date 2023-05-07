package com.pedro.cursojava.aula48;

public class MultiplosCatch {

	public static void main(String[] args) {

		/*try {
			int i = 4 / 0;
			System.out.println("Não será executado");
		} catch (ArithmeticException exception) {
			System.out.println("Erro ao dividir por 0");
		}*/

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por 0");
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exceção ao acessar um indíce/posição que não existe no vetor");
			}
		}

	}

}
