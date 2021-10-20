package exemplos;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double somatoria = 0.00, media = 0.00, total = 0.0;
		double numero1 = 0.00, numero2 = 0.00, numero3 = 0.00, numero = 0.00;
		while (numero >= 0) {
			System.out.println("Digite o primeiro número a ser somado: ");
			numero1 = leia.nextDouble();
			somatoria = somatoria + numero1;
			total = total + 1;
			System.out.println("Digite o segundo número a ser somado: ");
			numero2 = leia.nextDouble();
			somatoria = somatoria + numero2;
			total = total + 1;
			System.out.println("Digite o terceiro número a ser somado: ");
			numero3 = leia.nextDouble();
			somatoria = somatoria + numero3;
			total = total + 1;
			if (numero < 0) {
				System.out.println("Número inválido. Digite um número positivo!");
			}
			media = somatoria / total;
			System.out.println("Média dos valores: " + media);
			System.out.println("Somatória dos números: " + somatoria);
			System.out.println("Total de números lidos: " + total);
			break;
		}

	}

}
