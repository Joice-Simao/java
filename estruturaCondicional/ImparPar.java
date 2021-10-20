package estruturaCondicional;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {

		// variaveis
		double par, impar, numero;
		Scanner ler = new Scanner(System.in);

		// entradas
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		// procedimento
		if (numero % 2 == 0) {
			par = Math.sqrt(numero);
			System.out.printf("Número par, raiz quadrada de %.2f = %.2f", numero, par);

		} else {
			impar = Math.pow(numero, 2);
			System.out.printf("\nNúmero impar\nRaiz quadrada de %.2f = %.2f", numero, impar);
		}
	}
}
