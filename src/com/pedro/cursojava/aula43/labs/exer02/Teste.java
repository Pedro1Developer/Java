package com.pedro.cursojava.aula43.labs.exer02;

public class Teste {

	public static void main(String[] args) {
		
		PessoaJuridica contribuinte1 = new PessoaJuridica();
		contribuinte1.setNome("João");
		contribuinte1.setCnpj("74.982.925/0001-11");
		contribuinte1.setRendaBruta(2500);
		
		PessoaJuridica contribuinte2 = new PessoaJuridica();
		contribuinte2.setNome("Julia");
		contribuinte2.setCnpj("32.568.238/0001-04");
		contribuinte2.setRendaBruta(13000);
		
		PessoaJuridica contribuinte3 = new PessoaJuridica();
		contribuinte3.setNome("Lucas");
		contribuinte3.setCnpj("38.156.312/0001-61");
		contribuinte3.setRendaBruta(3500);
		
		PessoaFisica contribuinte4 = new PessoaFisica();
		contribuinte4.setNome("Davi");
		contribuinte4.setCpf("891.364.330-80");
		contribuinte4.setRendaBruta(1300);
		
		PessoaFisica contribuinte5 = new PessoaFisica();
		contribuinte5.setNome("Flávia");
		contribuinte5.setCpf("411.668.380-99");
		contribuinte5.setRendaBruta(3500);
		
		PessoaFisica contribuinte6 = new PessoaFisica();
		contribuinte6.setNome("Cristiane");
		contribuinte6.setCpf("891.364.330-80");
		contribuinte6.setRendaBruta(1700);
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = contribuinte1;
		contribuintes[1] = contribuinte2;
		contribuintes[2] = contribuinte3;
		contribuintes[3] = contribuinte4;
		contribuintes[4] = contribuinte5;
		contribuintes[5] = contribuinte6;
		
		for (Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
		
		
	}

}
