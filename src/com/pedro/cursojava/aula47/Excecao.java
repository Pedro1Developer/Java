package com.pedro.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da exception");

			vetor[4] = 10;

			System.out.println("Este texto não será impresso");

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção/erro ao acessar um indíce/posição que não existe no vetor");
		}
		
		System.out.println("Este texto será impresso");

	}

}
