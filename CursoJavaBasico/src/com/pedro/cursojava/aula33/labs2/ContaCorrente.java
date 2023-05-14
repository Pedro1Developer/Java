package com.pedro.cursojava.aula33.labs2;

import java.util.Scanner;

public class ContaCorrente {

	private String numero;
	private int agencia;
	private double saldo;
	private boolean especial;
	private int limiteEspecial;

	public ContaCorrente() {
	}

	public ContaCorrente(String numero, double saldo, boolean especial, int limeteEspecial) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.limiteEspecial = limeteEspecial;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public int getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(int limeteEspecial) {
		this.limiteEspecial = limeteEspecial;
	}

	public void realizarSaque(double valorSaque, Scanner scan) {

		System.out.println("Informe o valor do saque");
		valorSaque = scan.nextDouble();

		if (saldo >= valorSaque) { // tem saldo
			saldo -= valorSaque;
			System.out.println("Saque efetuado - " + valorSaque);
		} else { /// não tem saldo
			if (especial) {
				double limite = saldo + limiteEspecial;

				if (limite >= valorSaque) {
					saldo -= valorSaque;
					System.out.println("Saque efetuado com o cheque especial - " + valorSaque);
				} else {
					System.out.println("Saldo do cheque especial insuficiente");
				}
			} else {
				System.out.println("Saldo insuficiente");
			}
		}
	}

	public void realizarDeposito(double valorDeposito) {
		saldo += valorDeposito;
		System.out.println("Deposito efetuado + " + valorDeposito);
	}

	public void exebirSaldo() {
		System.out.println("Saldo - " + getSaldo());
	}

	public void exibirLimiteEspecial() {
		if (especial) {
			System.out.println("Limite especial - " + getLimiteEspecial());
		} else {
			System.out.println("Sua conta não possui um cheque especial");
		}
	}

}
