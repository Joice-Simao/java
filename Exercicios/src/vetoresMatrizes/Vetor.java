package vetoresMatrizes;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int maiorValor = 0;
		int valores[] = new int[5];
		int x;

		for (x = 0; x <= 4; x++) {
			System.out.print("Digite valor: ");
			valores[x] = leia.nextInt();
		}
		for (x = 0; x <= 4; x++) {
			System.out.printf(" [" + valores[x] + "] ");

			if (valores[x] > maiorValor) {
				maiorValor = valores[x];
			}
		}

		System.out.printf("\n\nMaior valor: %d", maiorValor);
	}
}