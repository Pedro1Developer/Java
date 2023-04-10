package com.pedro.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("---CURSO---");

		System.out.println("Entre com o nome do curso");
		String nomeCurso = scan.nextLine();

		System.out.println("Entre com o horário do curso");
		String horario = scan.nextLine();

		Curso curso = new Curso();

		curso.setNome(nomeCurso);
		curso.setHorario(horario);

		System.out.println("---PROFESSOR---");

		System.out.println("Entre com o nome do professor");
		String nomePRof = scan.nextLine();

		System.out.println("Entre com o departamento do professor");
		String departamento = scan.nextLine();

		System.out.println("Entre com o email do professor");
		String email = scan.nextLine();

		Professor professor = new Professor();

		professor.setNome(nomePRof);
		professor.setDepartamento(departamento);
		professor.setEmail(email);

		curso.setProfessor(professor);

		Aluno[] alunos = new Aluno[5];
		
		System.out.println("---ALUNO---");

		for (int i = 0; i < alunos.length; i++) {
			
			scan.nextLine();

			System.out.println("Entre como o nome do aluno " + (i+1));
			String nomeAluno = scan.nextLine();

			System.out.println("Entre como a matricula do aluno " + (i+1));
			String matriculaAluno = scan.nextLine();

			double[] notas = new double[4];

			for (int j = 0; j < 4; j++) {

				System.out.println("Entre com a nota " + (j + 1) + " do aluno " + (i + 1));
				notas[j] = scan.nextDouble();

			}

			Aluno aluno = new Aluno();

			aluno.setNome(nomeAluno);
			aluno.setNome(matriculaAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;

		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());

	}

}
