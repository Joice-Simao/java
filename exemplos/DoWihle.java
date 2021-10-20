package exemplos;

import java.util.Scanner;

public class DoWihle {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
		 * apresente no final o total do somat�rio, a m�dia e o total de valores lidos.
		 * O programa deve fazer as leituras dos valores enquanto o usu�rio estiver
		 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usu�rio
		 * fornecer um valor negativo.
		 */
		// variaveis
		Scanner leia = new Scanner(System.in);
		double numeros;
		double media;
		double numeroDigitado;
		double somatorio = 0;
		int contador = 0;

		// entradas
		do {
			System.out.print("Digite n�mero: ");
			numeroDigitado = leia.nextDouble();
			if (numeroDigitado >= 0) {
				somatorio = somatorio + numeroDigitado;
				contador = contador + 1;
			}
		} while (numeroDigitado >= 0);
		media = somatorio / contador;
		System.out.println("___________________________");
		System.out.println("M�dia: " + media);
		System.out.println("Total do somat�rio: " + somatorio);
		System.out.println("Total de valores lidos: " + contador);
		System.out.println("___________________________");
	}
}
