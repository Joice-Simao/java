package vetoresMatrizes;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// variaveis
		Scanner leia = new Scanner(System.in);
		int Matriz[][] = new int[3][3];// matriz
		int soma = 0;
		int somaDiagonal = 0;
		// entradas e procedimentos
		System.out.print("Digite os valores\n");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print("Linha " + linha + " e coluna " + coluna + " =");
				Matriz[linha][coluna] = leia.nextInt();

				soma = soma + Matriz[linha][coluna];
				// soma diagonal
				if (linha == coluna) {
					somaDiagonal = somaDiagonal + Matriz[linha][coluna];
				}
				System.out.print(Matriz[linha][coluna]);
			}
		}
		// saidas
		System.out.printf("\nA soma dos dos n�meros �: %d", soma);
		System.out.printf("\nE a diagonal principal �: %d", somaDiagonal);
	}
}
