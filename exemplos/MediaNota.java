package exemplos;

import java.util.Scanner;

public class MediaNota {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String alune;
		double nota = 0.00;
		char pronome;
		double media = 0.00;
		double totalNotas = 0.00;
		double maiorNota = 0.00;

		System.out.print("Digite seu nome:");
		alune = leia.next();
		System.out.print("Qual o pronome O/A/E :");
		pronome = leia.next().charAt(0);

		if (pronome == 'A') {
			System.out.printf("Bom dia aluna %s !!!", alune);
		} 
		else if (pronome == 'O') {
			System.out.printf("Bom dia aluno %s !!!", alune);
		} 
		else if (pronome == 'E') {
			System.out.printf("Bom dia alune %s !!!", alune);
		}
		for (int x = 1; x < 4; x++) {
			System.out.printf("Digite a nota " + x + ":");
			nota = leia.nextInt();
			totalNotas = totalNotas + nota;
			if (nota > maiorNota) {
				maiorNota = nota;
			}
		}
		media = (totalNotas / 3);
		System.out.printf("\nOi alun%c %s, sua média de notas foi %.2f ", pronome, alune, media);
		System.out.printf("\nSua maior nota foi %.2f", maiorNota);
	}
}
