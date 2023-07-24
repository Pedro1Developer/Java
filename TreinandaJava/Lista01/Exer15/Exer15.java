package Exer15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double phora = 0;
		double tdia = 0;
		double total = 0;
		double ir = 0;
		double inss = 0;
		double sindicato = 0;
		double liquido = 0;

		try {
			System.out.println("Informe o valor da hora");
			phora = scan.nextDouble();

			System.out.println("Informe total de horas trabalhadas no dia");
			tdia = scan.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Número inválido");
		}
		total = (tdia * 22) * phora;
		ir = (total * 11) / 100;
		inss = (total * 8) / 100;
		sindicato = (total * 5) / 100;
		liquido = total - ir - inss - sindicato;

		System.out.println("Considerando um mês com 22 dias úteis, o salário bruto será: " + total);

		System.out.println("Taxa do IR: " + ir);

		System.out.println("Taxa do INSS: " + inss);

		System.out.println("Sindicato: " + sindicato);

		System.out.println("Salário líquido: " + liquido);

	}

}
