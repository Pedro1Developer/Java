package com.pedro.cursojava.aula33.labs;

public class Aluno {

	private String nome;
	private long matricula;
	private String curso;
	private String[] diciplinas;
	private double[][] notas;

	public Aluno() {
		diciplinas = new String[3];
		notas = new double[diciplinas.length][4];
	}

	public Aluno(String nome, long matricula, String curso, String[] diciplinas, double[][] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.diciplinas = diciplinas;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(String[] diciplinas) {
		this.diciplinas = diciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public void setDisciplinaPos(int pos, String nomeDisciplina) {
		this.diciplinas[pos] = nomeDisciplina;
	}

	public void setNotaPosIJ(int posI, int posJ, double nota) {
		this.notas[posI][posJ] = nota;
	}

	public boolean verificarAprovado(int indice) {

		if (obterMedia(indice) >= 7) {
			return true;
		}

		return false;
	}

	private double obterMedia(int indice) {

		double soma = 0;

		for (int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice][i];
		}

		double media = soma / 4;

		return media;
	}

	public void mostrarInfos() {
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Número de matrícula: " + matricula);
		System.out.println("Curso em que o aluno está matriculado: " + curso);
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Notas " + diciplinas[i] + ": ");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
	}

}
