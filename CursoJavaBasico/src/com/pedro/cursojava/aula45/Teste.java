package com.pedro.cursojava.aula45;

public class Teste {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno();
		
		Pessoa aluno3 = new Aluno();
		Aluno aluno4 = (Aluno) aluno3; //downcasting
		
	}
	
}
