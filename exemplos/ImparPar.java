package exemplos;

import java.util.Scanner;

public class ImparPar {
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		//variaveis
		int numero;
		//entradas
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		//procedimento
		if (numero == 0) {
			System.out.print("Zero é neutro!");
		}
		else if (numero < 0) {
			System.out.print("Número negativo!");
		}
		else if (numero % 2 == 0) {
			System.out.print("Número par!");
		}
		else { 
			System.out.print("Número impar!");
		}
	}
}
