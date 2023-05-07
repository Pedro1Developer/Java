package com.pedro.cursojava.aula50;

public class Teste {

	public static void main(String[] args) {

		try {
			int i = 4 / 0;
		} catch (Throwable e) {
			System.out.println("Erro");
		}

	}

}
