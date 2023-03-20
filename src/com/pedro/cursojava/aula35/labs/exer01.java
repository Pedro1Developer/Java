package com.pedro.cursojava.aula35.labs;

public class exer01 {

	public static void main(String[] args) {

		imprimirTela(Calculadora.nesimo(5, 0, 0, 0, 0));

	}

	static void imprimirTela(int n) {
		System.out.println(Calculadora.nesimo(n, n, n, n, n));
	}

}
