package estruturaRepeticao;

import java.util.Scanner;

public class WhileIdades {
	public static void main(String[] args) {

		// variaveis
		Scanner leia = new Scanner(System.in);
		int idade = 0;
		int totalMenosVinteUm = 0;
		int totalMaisCinquenta = 0;
		int contador = 0;
		// entradas
		System.out.print("Qual a sua idade ? ");
		idade = leia.nextInt();
		// recebendo idades
		while (idade > 0) {
			System.out.print("Qual a sua idade ? ");
			idade = leia.nextInt();

			if (idade < 21) {
				totalMenosVinteUm = (totalMenosVinteUm + 1);
			}
			if (idade > 50) {
				totalMaisCinquenta = (totalMaisCinquenta + 1);
			}
			if (idade <= 0) {
				System.out.print("\nIdade inválida!!!");
			}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos : " + totalMenosVinteUm);
		System.out.println("Total de pessoas com mais de 50 anos : " + totalMaisCinquenta);

	}
}
