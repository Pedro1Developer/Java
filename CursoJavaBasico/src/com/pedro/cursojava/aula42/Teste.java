package com.pedro.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//Exemplo 2
		
		System.out.println(Constantes.BATATA_1);
		System.out.println(Constantes.BATATA_2);
		
		//Constantes.BATATA_1 = "axrcvgbhnjmk"; Error
		
		Constantes.BATATA_2 = "zasxdcfgbhnmtbrf";
		
		System.out.println(Constantes.BATATA_1);
		System.out.println(Constantes.BATATA_2);
		
	}

}
