package com.pedro.cursojava.aula51;

public class TesteNullPointException {

	public static void main(String[] args) {

		AaNullPointException teste = new AaNullPointException();

		System.out.println(teste.getI());

		// Eu esperava que ocorresse um erro, más não aconteceu

	}

}
