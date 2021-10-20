package estruturaCondicional;

import java.util.Scanner;

public class Categoria {
	public static void main(String[] args) {
		// variaveis
		Scanner ler = new Scanner(System.in);
		int idade;
		// entradas
		System.out.print("Informe a idade: ");
		idade = ler.nextInt();
		// procedimentos
		if (idade < 10) {
			System.out.println("\nInválido, as idades devem ser a partir de 10 anos!!!");
		} else if (idade >= 10 && idade <= 14) {
			System.out.println("\nCategoria infantil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nCategoria juvenil.");
		} else {
			System.out.println("\nCategoria adulto.");
		}

	}
}
