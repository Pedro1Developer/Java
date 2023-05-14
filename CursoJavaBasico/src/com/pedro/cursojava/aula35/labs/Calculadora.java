package com.pedro.cursojava.aula35.labs;

public class Calculadora {
	
	public static int nesimo(int n, int qtd, int valor1, int valor2, int valorF) {

		if (qtd == n) {
			return valorF;
		}

		valor2 += valor1;
		valor1 = valor2;
		qtd++;

		return nesimo(n, valorF, valorF, valorF, valorF);

	}
	
	//ERROR
	
}
