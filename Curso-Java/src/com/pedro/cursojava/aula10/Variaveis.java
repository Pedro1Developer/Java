package com.pedro.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 14;
		String nome = "Pedro";
		String nomeDoMeuCachorro = "auau";
		String ano2022 = "2022";
		
		//aceito, mas não utilizado
		int _idade;
		int $idade;
		
		//não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 40;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// má prática
		int a = 10;
		String b = "Pedro";
	}

}
