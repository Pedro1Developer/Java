package com.pedro.cursojava.aula43.labs.exer01;

public class ContaPoupanca extends ContaBancaria {

	private double diaRendimento;

	public ContaPoupanca() {
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovaSaldo() {

		double valorRendimento;
		valorRendimento = (diaRendimento * super.getSaldo()) / 100;
		double soma = super.getSaldo() + valorRendimento;
		super.setSaldo(soma);
		System.out.println("Rendimento de " + diaRendimento + "% acréscimo de R$" + valorRendimento + " Total: "
				+ super.getSaldo());
	}

}
