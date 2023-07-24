package Exer08;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double phora = 0;
		double tdia = 0;
		double total = 0;

		System.out.println("Informe o valor da hora");
		phora = scan.nextDouble();

		System.out.println("Informe total de horas trabalhadas no dia");
		tdia = scan.nextDouble();

		total = (tdia * 22) * phora;

		System.out.println("Considerando um mês com 22 dias úteis, o salário será: " + total);

	}

}
