package estruturaRepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numeroTeclado = 0, soma = 0;

		do {
			System.out.println("Digite um número do teclado: ");
			numeroTeclado = leia.nextInt();
			soma = numeroTeclado + soma;
			
		} while (numeroTeclado != 0);
			System.out.println("Soma dos números digitados: " + soma);
	}

}
