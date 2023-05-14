package com.pedro.cursojava.aula36;

public class Vazio {
	
	//Error

	public static int fotorial(int num) {

		if (num == 1) {
			return 1;
		}

		return num * fotorial(num - 1);
	}

	public class Teste2 {

		public static void main(String[] args) {

			System.out.println(Vazio.fotorial(5));
			
			System.out.println("A");

		}

	}

}
