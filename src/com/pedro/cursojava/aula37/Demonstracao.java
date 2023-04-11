package com.pedro.cursojava.aula37;

import java.util.Scanner;

public class Demonstracao {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número X");
		double X = scan.nextDouble();
		
		System.out.println("Entre com o número Y");
		double Y = scan.nextDouble();
		
		System.out.println("A soma de X + Y é: " + (X+Y));
		
	}

}
