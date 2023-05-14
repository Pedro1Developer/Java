package com.pedro.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {
		
		Object obj1 = obterString();
		String s1 = (String) obj1;
		
		System.out.println(obj1);
		System.out.println(s1);
		
		Object obj2 = "String";
		String s2 = (String) obj2;
		
		System.out.println(obj2);
		System.out.println(s2);
		
		Object obj3 = 50.5;
		Double d1 = (Double) obj3;
		
		System.out.println(obj3);
		System.out.println(d1);
		
		Object obj4 = new Object();
		String s3 = (String) obj4;
		
		System.out.println(obj4);
		System.out.println(s3);

	}
	
	public static String obterString() {
		return "Minha String";
	}

}
