package com.pedro.cursojava.aula37;

public class Exer02 {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		aluno.setNome("Pedro");
		
		professor.setNome("João");
		
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Nome do professor: " + professor.getNome());
		
	}

}
