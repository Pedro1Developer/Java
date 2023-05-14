package com.pedro.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows2 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Entre com um número decimal");
		Double num = lerNumero();
		System.out.println("Teste");

	}
	
	public static double lerNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
