package com.pedro.cursojava.aula33.labs2;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Insira a nome completo do aluno");
		aluno.setNome(scan.nextLine());

		System.out.println("Informe o número de matrícula do aluno " + aluno.getNome());
		aluno.setMatricula(scan.nextLong());

		System.out.println("Informe o curso que o aluno está matriculado");
		aluno.setCurso(scan.next());

		for (int i = 0; i < aluno.getDiciplinas().length; i++) {
			System.out.println("Insira o nome da diciplina " + (i + 1) + " do curso " + aluno.getCurso());
			aluno.setDisciplinaPos(i, scan.next());
		}

		for (int i = 0; i < aluno.getNotas().length; i++) {
			System.out.println("Obtendo notas da diciplina " + aluno.getDiciplinas()[i]);
			for (int j = 0; j < aluno.getNotas()[i].length; j++) {
				System.out.println("Insira a nota " + (j + 1));
				aluno.setNotasPosIJ(i, j, scan.nextDouble());
			}
		}

		aluno.mostrarInfos();

		for (int i = 0; i < aluno.getDiciplinas().length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Diciplina " + aluno.getDiciplinas()[i] + " - aprovado");
			} else {
				System.out.println("Diciplina " + aluno.getDiciplinas()[i] + " - Reprovado");
			}
		}

	}

}
