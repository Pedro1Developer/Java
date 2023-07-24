package Exer1;

public class ExerAposentadoria {
	
	public static void main(String[] args) {
		
		int idade = 31;
		int contri = 5;
		
		while(idade + contri != 100) {
			idade +=1;
			contri +=1;
			System.out.println("idade = "+ idade + " contribuição = "+ contri);
		}
		
	}

}
