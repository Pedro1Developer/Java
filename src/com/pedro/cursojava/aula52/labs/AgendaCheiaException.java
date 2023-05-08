package com.pedro.cursojava.aula52.labs;

public class AgendaCheiaException extends Exception{
	
	public AgendaCheiaException() {
	}

	public String getMessage () {
		return "A agenda já está cheia\nCapacidade 5/5";
	}
	
}
