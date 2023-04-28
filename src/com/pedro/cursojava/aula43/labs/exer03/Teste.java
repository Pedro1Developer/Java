package com.pedro.cursojava.aula43.labs.exer03;

public class Teste {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.setNome("Camaleão");
		animal.setComprimento("30cm");
		animal.setCor("Adptável");
		animal.setAmbiente("Florestas");
		animal.setVelocidade("0,025 m/s");
		
		Peixe peixe = new Peixe();
		
		peixe.setNome("Tilápia");
		peixe.setComprimento("20cm");
		peixe.setCor("Azul");
		peixe.setAmbiente("Lagoas");
		peixe.setVelocidade("1,5 m/s");
		peixe.setCaracteristicas("Água doce, onívoro");
		
		Mamifero mamifero = new Mamifero();
		
		mamifero.setNome("Raposa");
		mamifero.setComprimento("90cm");
		mamifero.setCor("Marrom");
		mamifero.setAmbiente("Áreas rurais");
		mamifero.setVelocidade("12 m/s");
		mamifero.setAlimento("Carne");
		
		Animal[] animais = new Animal[3];
		animais[0] = animal;
		animais[1] = peixe;
		animais[2] = mamifero;
		
		for (Animal a : animais) {
			System.out.println(a.toString() + "\n");
		}
		
	}
	
}
