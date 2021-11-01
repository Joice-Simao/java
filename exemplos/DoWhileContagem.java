package exemplos;

import java.util.Scanner;

public class DoWhileContagem {
	public static void main(String[] args) {
		
		/* 1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
		 * contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não
		 * estiver.
		 */
		// variaveis
		Scanner leia = new Scanner(System.in);
		int contagem;

		contagem = 233;

		do {
			System.out.println(contagem);			
			if (contagem >= 233 && contagem < 300) {
				contagem += 3;
			} 
			else {
			contagem += 5;
			}
		}while (contagem <= 456);

	}
}
