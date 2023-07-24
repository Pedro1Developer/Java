package Exer07;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double lado = 0;
		double area;

		System.out.println("Entre com 1 lado do quadrado");
		lado = scan.nextDouble();

		area = lado * 4;

		System.out.println("Área = " + area);
		System.out.println("Dobro da área = " + area * 2);

	}

}
