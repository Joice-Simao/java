package estruturaRepeticao;

import java.util.Scanner;

public class DoWhileMultiplos {

	public static void main(String[] args) {

		int numeroTeclado = 0, contador = 0, total = 0;
		double media = 0.00;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("Digite n�mero: ");
			numeroTeclado = leia.nextInt();

			if (((numeroTeclado % 3) == 0) && numeroTeclado > 0) {
				contador = (contador + 1);
				total = numeroTeclado + total;
			}

		} while (numeroTeclado > 0);

		if (contador > 0) {
			media = (total / contador);
		}
		System.out.printf("\nM�dia dos n�meros m�ltiplos de 3 : %.2f", media);
	}
}
