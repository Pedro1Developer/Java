package com.pedro.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Engenharia de software");
		double[] notas = {9, 10, 8 ,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Ciência da computação");
		double[] notas2 = {9, 10, 8 ,7};
		aluno2.setNotas(notas2);	
		
		System.out.println(aluno.equals(aluno2));

	}

}
