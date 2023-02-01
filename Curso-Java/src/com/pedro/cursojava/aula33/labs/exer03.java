package com.pedro.cursojava.aula33.labs;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Insira o nome do aluno");
		aluno.setNome(scan.nextLine());

		System.out.println("Insira o número de matrícula do aluno");
		aluno.setMatricula(scan.nextLong());

		System.out.println("Informe o curso em que o aluno está matriculado");
		aluno.setCurso(scan.next());

		for (int i = 0; i < aluno.getDiciplinas().length; i++) {
			System.out.println("Informe o nome da diciplina " + (i + 1));
			aluno.setDisciplinaPos(i, scan.next());
		}

		for (int i = 0; i < aluno.getNotas().length; i++) {
			for (int j = 0; j < aluno.getNotas()[i].length; j++) {
				System.out.println("Informe a nota " + (j + 1) + " da diciplina " + aluno.getDiciplinas()[i]);
				aluno.setNotaPosIJ(i, j, scan.nextDouble());
			}
		}

		aluno.mostrarInfos();

		for (int i = 0; i < aluno.getDiciplinas().length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Diciplina " + aluno.getDiciplinas()[i] + " - Aprovado");
			} else {
				System.out.println("Diciplina " + aluno.getDiciplinas()[i] + " - Reprovado");
			}
		}

	}

}
