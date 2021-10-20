package estruturaRepeticao;

import java.util.Scanner;

public class WhileIdade {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade = 0, totalMenosVinteUm = 0, totalMaisCinquenta = 0;
		
		System.out.print("Qual a sua idade ? ");
		idade = leia.nextInt();
		
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
		System.out.println("\nTotal de pessoas com menos de 21 anos : "
				+totalMenosVinteUm);
		
		System.out.println("Total de pessoas com mais de 50 anos : "
				+totalMaisCinquenta);

	}
}
