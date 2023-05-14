package com.pedro.cursojava.aula34.labs;

public class exer01 {
	
	public static void exibirValor() {
		System.out.println(Contador.obterValor());
	}
	
	public static void main(String[] args) {
		
		exibirValor();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		exibirValor();
		
		Contador.zerar();
		
		Contador.incrementar();
		Contador.incrementar();
		
		exibirValor();
		
	}

}
