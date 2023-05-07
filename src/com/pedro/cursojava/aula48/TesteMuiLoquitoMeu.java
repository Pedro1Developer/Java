package com.pedro.cursojava.aula48;

public class TesteMuiLoquitoMeu {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048 };
		int[] denominadores = { 2, 0, 4, 8, 0, 16, 32, 0, 64 };

		for (int j = 1; j > 0; j++) {
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

}
