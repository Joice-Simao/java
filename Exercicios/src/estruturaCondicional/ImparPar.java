package estruturaCondicional;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		double par, impar, numero, raiz;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("N�mero par, raiz quadrada de %.2f = %.2f", numero, raiz);

		} else {
			impar = Math.pow(numero, 2);
			System.out.printf("\nN�mero impar,\n%.2f elevado ao quadrado = %.2f", numero, impar);
		}
	}
}
