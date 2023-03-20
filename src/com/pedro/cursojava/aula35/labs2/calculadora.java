package com.pedro.cursojava.aula35.labs2;

public class calculadora {
	
	public static int fibonacci(int num) {
		
		if (num < 2) {
			return 1;
		}
		
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
