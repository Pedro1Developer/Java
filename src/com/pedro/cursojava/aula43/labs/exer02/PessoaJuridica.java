package com.pedro.cursojava.aula43.labs.exer02;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public PessoaJuridica() {
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Pessoa Jurídica: [" + super.toString() + "Imposto a pagar = " + calcularImposto() + "]";
	}

	public double calcularImposto() {
		return (super.getRendaBruta() * 0.1);
	}

}
