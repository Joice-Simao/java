package exemplos;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
//Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o  m�ltiplos de tr�s 
//	e que se encontram no conjunto dos n�meros de 1 at� 500.	

		// variaveis
		Scanner ler = new Scanner(System.in);
		double x;
		int numero;
		double somaImpar = 0.00;
		// entradas
		// totalizadora comeca a contar a partir do zero
		somaImpar = 0;

		for (x = 0; x <= 500; x++) {
			if (x % 2 == 1 && x % 3 == 0) {
				somaImpar = somaImpar + x;
				System.out.println(x);
			}
		}
		System.out.print("Soma: "+somaImpar);

	}
}
