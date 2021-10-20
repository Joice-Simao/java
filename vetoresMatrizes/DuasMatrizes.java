package vetoresMatrizes;

import java.util.Scanner;

public class DuasMatrizes {

	public static void main(String[] args) {
		// variaveis
		Scanner leia = new Scanner(System.in);
		double N1[][] = new double[4][6];// matriz
		double N2[][] = new double[4][6];// matriz
		double M1[][] = new double[4][6];// matriz
		double M2[][] = new double[4][6];// matriz
		// entradas
		System.out.println("Insira os valores N1");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print("Linha " + linha + " e coluna " + coluna + " =");
				N1[linha][coluna] = leia.nextDouble();
			}
		}
		System.out.println("Insira os valores N2");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				System.out.print("Linha " + linha + " e coluna " + coluna + " =");
				N2[linha][coluna] = leia.nextDouble();
			}
		}
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M1[linha][coluna] = (N1[linha][coluna] + N2[linha][coluna]);
				System.out.println(M1[linha][coluna] + " ");
			}
		}
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M2[linha][coluna] = (N1[linha][coluna] - N2[linha][coluna]);
				System.out.println(M2[linha][coluna] + " ");
			}
		}
	}
}
