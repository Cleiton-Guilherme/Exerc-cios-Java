package br.com.generation.lacodowhile;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0;
		
		do {
			
			System.out.println("Digite o 1 número: ");
			int numero1 = entrada.nextInt();
			
			System.out.println("Digite o 2 número: ");
			int numero2 = entrada.nextInt();
			
			System.out.println(numero1 + "/" + numero2 + "e:" + (numero1/numero2));
			
			i++;
		}while(i <= 10);
		
		
	}

}
