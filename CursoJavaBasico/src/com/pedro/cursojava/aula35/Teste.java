package com.pedro.cursojava.aula35;

public class Teste {

	public static void main(String[] args) {

		metodo1();

		int i = 0;

	}

	static int i;

	static public void metodo1() {

		i += 1;
		metodo2();
	}

	static public void metodo2() {

		i -= 1;
		metodo1();
	}

}
