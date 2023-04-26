package com.pedro.cursojava.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {

		System.out.println("---Conta Bancaria---");

		ContaBancaria conta = new ContaBancaria();

		conta.setNomeCliente("Cliente Bancária");
		conta.setNumConta("0000001");
		conta.setSaldo(600);

		conta.realizarSaque(150);
		
		conta.verificarSaldo();
		
		conta.realizarSaque(50);
		
		conta.verificarSaldo();
		
		conta.realizarDeposito(1000);
		
		conta.verificarSaldo();
		
		System.out.println("---Conta Poupança---");
		
		ContaPoupanca poupanca = new ContaPoupanca();
		
		poupanca.setNomeCliente("Cliente Poupanca");
		poupanca.setNumConta("0000002");
		poupanca.setSaldo(200);
		poupanca.setDiaRendimento(7.7);
		
		poupanca.realizarSaque(300);
		
		poupanca.realizarDeposito(200);
		
		poupanca.verificarSaldo();
		
		poupanca.calcularNovaSaldo();
		
		poupanca.verificarSaldo();
		
		System.out.println("---Conta Especial---");
		
		ContaEspecial especial = new ContaEspecial();
		
		especial.setNomeCliente("Cliene Especial");
		especial.setNumConta("0000003");
		especial.setSaldo(1000);
		especial.setLimite(200);
		
		especial.realizarDeposito(100);
		
		especial.verificarSaldo();
		
		especial.sacar(1200);
		
		especial.verificarSaldo();

	}

}
