package exemplos;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double somatoria = 0.00, media = 0.00, total = 0.0;
		double numero1 = 0.00, numero2 = 0.00, numero3 = 0.00, numero = 0.00;
		while (numero >= 0) {
			System.out.println("Digite o primeiro n�mero a ser somado: ");
			numero1 = leia.nextDouble();
			somatoria = somatoria + numero1;
			total = total + 1;
			System.out.println("Digite o segundo n�mero a ser somado: ");
			numero2 = leia.nextDouble();
			somatoria = somatoria + numero2;
			total = total + 1;
			System.out.println("Digite o terceiro n�mero a ser somado: ");
			numero3 = leia.nextDouble();
			somatoria = somatoria + numero3;
			total = total + 1;
			if (numero < 0) {
				System.out.println("N�mero inv�lido. Digite um n�mero positivo!");
			}
			media = somatoria / total;
			System.out.println("M�dia dos valores: " + media);
			System.out.println("Somat�ria dos n�meros: " + somatoria);
			System.out.println("Total de n�meros lidos: " + total);
			break;
		}

	}

}
