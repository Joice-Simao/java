package estruturaRepeticao;

import java.util.Scanner;

public class ForParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero, contador = 0, par = 0, impar = 0;

		for (int x = 0; x < 10; x++) {
			System.out.println("Digite um número : ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par = par + 1;
			}
			if (numero % 2 != 0) {
				impar = impar + 1;
			}
		}
		System.out.println("Total de números impares : " + par);
		System.out.println("Total de números pares : " + impar);
	}
}
