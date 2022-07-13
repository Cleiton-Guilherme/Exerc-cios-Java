package br.com.generation.lacoFor;

public class For02 {

	public static void main(String[] args) {
		
        int numero = 10;
		
		for(int i = 0, soma = 0; i <= numero; i++) {
			
			System.out.print("Soma: " + soma + " + " + i);
			soma = soma + i;
			System.out.println(" = " + soma);
			
		}

	}

}
