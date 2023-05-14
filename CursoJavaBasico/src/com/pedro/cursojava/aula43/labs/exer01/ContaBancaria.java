package com.pedro.cursojava.aula43.labs.exer01;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	public ContaBancaria() {
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void realizarSaque(double qtdSaque) {

		if (qtdSaque <= saldo) {

			if ((saldo - qtdSaque) < 0) {
				System.out.println("Saldo insuficiente");

			} else {
				saldo -= qtdSaque;
				System.out.println("Saque realizido: -" + qtdSaque);

			}
		} else {
			System.out.println("Saldo insuficiente");

		}
	}

	public void realizarDeposito(double qtdDeposito) {
		saldo += qtdDeposito;
		System.out.println("Deposito realizado: +" + qtdDeposito);
	}
	
	public void verificarSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}

}
