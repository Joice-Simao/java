package estruturaRepeticao;

import java.util.Scanner;

public class DoWhileMultiplos {
	public static void main(String[] args) {
		// variaveis
		Scanner leia = new Scanner(System.in);
		int numeroTeclado = 0;
		double media = 0.00;
		int total = 0;
		int contador = 0;
		// laço
		do {
			System.out.print("Digite número: ");
			numeroTeclado = leia.nextInt();
			if (((numeroTeclado % 3) == 0) && numeroTeclado > 0) {
				contador = (contador + 1); // contador
				total = total + numeroTeclado; // totalizador
			}
		} while (numeroTeclado > 0);

		if (contador > 0) {
			media = (total / contador);
		}
		System.out.printf("\nMédia dos números múltiplos de 3 : %.1f", media);
	}
}
