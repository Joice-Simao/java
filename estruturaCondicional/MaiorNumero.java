package estruturaCondicional;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		// variaveis
		Scanner ler = new Scanner(System.in);
		int numero, numero1, numero2, numero3, maior;
		// entradas
		System.out.print("Digite n�mero 1: ");
		numero1 = ler.nextInt();
		System.out.print("Digite n�mero 2: ");
		numero2 = ler.nextInt();
		System.out.print("Digite n�mero 3: ");
		numero3 = ler.nextInt();
		// procedimentos
		if (numero2 < numero1 && numero3 < numero1) {
			System.out.printf("Maior n�mero %d", numero1);
		} else if (numero1 < numero3 && numero2 < numero3) {
			System.out.printf("Maior n�mero %d", numero3);
		} else
			System.out.printf("Maior n�mero %d", numero2);
		{
		}
	}
}
