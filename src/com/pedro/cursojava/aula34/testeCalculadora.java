package com.pedro.cursojava.aula34;

public class testeCalculadora {

	static int resultSoma;

	public static void main(String[] args) {

		resultSoma = minhaCalculadora.soma(1, 2);

		// MinhaCalculadora calc = new MinhaCalculadora();

		// calc.soma(1, 2);

		soma2Valores(1, 2);

	}

	static int soma2Valores(int num1, int num2) {
		return minhaCalculadora.soma(num1, num2);
	}

}
