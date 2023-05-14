package com.pedro.cursojava.aula34.labs;

public class exer03 {

	public static void main(String[] args) {

		imprimirTela(calculadora.somar(2, 2));

		imprimirTela(calculadora.subtrair(5, 3));

		imprimirTela(calculadora.multiplicar(10, 2));

		imprimirTela(calculadora.dividir(50, 2));

		imprimirTela(calculadora.potencia(3, 3));
		
		imprimirTela(calculadora.fatorial(5));

	}

	static void imprimirTela(double resultado) {
		System.out.println(resultado);
	}

}
