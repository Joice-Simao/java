package estruturaCondicional;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {

		// variaveis
		Scanner leia = new Scanner(System.in);
		double numero1, numero2, numero3, maiorNumero = 0.00;
		// entradas
		System.out.println("Digite n�mero 1 : ");
		numero1 = leia.nextDouble();
		System.out.println("Digite n�mero 2 : ");
		numero2 = leia.nextDouble();
		System.out.println("Digite n�mero 3 : ");
		numero3 = leia.nextDouble();
		// procedimentos
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("Maior n�mero : " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("Maior n�mero : " + numero2);
		} else {
			System.out.println("Maior n�mero : " + numero3);
		}
	}
}
