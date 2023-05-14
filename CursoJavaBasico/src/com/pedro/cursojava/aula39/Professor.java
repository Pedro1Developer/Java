package com.pedro.cursojava.aula39;

public class Professor extends Pessoa{
	
	
	private String departamento;
	private String nomeCurso;
	private String salario;
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
}
