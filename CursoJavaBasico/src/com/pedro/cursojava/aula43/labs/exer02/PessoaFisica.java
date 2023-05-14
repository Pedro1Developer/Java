package com.pedro.cursojava.aula43.labs.exer02;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa Física: [" + super.toString() + "Imposto a pagar = " + calcularImposto() + "]";
	}

	public double calcularImposto() {
		
		double renda = super.getRendaBruta();
		
		if (renda > 1400 && renda <=2100) {
			return renda * 0.1 - 100;
		}
		if (renda > 2100 && renda <= 2800) {
			return renda * 0.15 - 270;
		}
		if (renda > 2800 && renda <= 3600) {
			return renda * 0.25 - 500;
		}
		if (renda > 3600) {
			return renda * 0.3 - 700;
		}
		
		return 0;
	}

}
