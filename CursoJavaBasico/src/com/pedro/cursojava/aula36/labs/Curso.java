package com.pedro.cursojava.aula36.labs;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public String obterInfo() {

		Aluno aluno = new Aluno();

		String info = "---CURSO---";
		info += "\nNome: " + nome;
		info += "\nHorário: " + horario;
		info += "\n---PROFESSOR---";
		professor.obterInfo();
		info += "---ALUNOS---";

		for (int i = 0; i < 5; i++) {
			if (aluno != null) {
				info += aluno.obterInfo();
			}
		}

		return info;

	}

}
