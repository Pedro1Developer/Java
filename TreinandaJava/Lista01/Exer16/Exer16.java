package Exer16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho em m² da parede a ser pintada");
		double area = scan.nextDouble();
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		double qtdLitros = area/3;
		double qtdLatas = qtdLitros/18;
		double preco = qtdLatas * 80;
		
		String resultLatas = df.format(qtdLatas);
		String resultPreco = df.format(preco);
		
		if (qtdLatas <=1) {
			System.out.println("Quantidade de Latas: 1 - Preço: R$80,00");
		}else {
			System.out.println("Quantidade de Latas: "+resultLatas+" - Preço: R$" + resultPreco);
		}
	}

}
