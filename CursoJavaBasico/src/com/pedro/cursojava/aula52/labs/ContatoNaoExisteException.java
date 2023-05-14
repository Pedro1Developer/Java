package com.pedro.cursojava.aula52.labs;

public class ContatoNaoExisteException extends Exception{

	@Override
	public String getMessage() {
		return "Esse contato não existe";
	}
	
}
