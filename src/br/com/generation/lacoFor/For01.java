package br.com.generation.lacoFor;

public class For01 {

	public static void main(String[] args) throws InterruptedException{

		for(int i = 0; i <= 10; i++) {
			
			System.out.println("Repetição nr: " + i);
			i++;
		
			Thread.sleep(500);
		}

	}

}
