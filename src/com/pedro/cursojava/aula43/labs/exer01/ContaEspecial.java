package com.pedro.cursojava.aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaEspecial() {
	}

	//@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "]";
	}
	
	public boolean sacar(double qtdSaque) {
		
		double saldoComLimite = super.getSaldo() + limite;
		
		if ((saldoComLimite - qtdSaque) >=0) {
			super.setSaldo(super.getSaldo() - qtdSaque);
			return true;
		}
		
		return false;
		
	}
	
}
