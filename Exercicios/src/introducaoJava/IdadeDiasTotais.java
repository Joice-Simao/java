package introducaoJava;

import java.util.Scanner;

public class IdadeDiasTotais {

	public static void main(String[] args) {

		int anos, meses, dias, totalDias;

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a idade expressa em anos: ");
		anos = ler.nextInt();

		System.out.print("Informe a idade expressa em meses: ");
		meses = ler.nextInt();

		System.out.print("Informe a idade expressa em dias: ");
		dias = ler.nextInt();

		totalDias = ((anos * 365) + (meses * 30) + dias);

		System.out.printf("A idade em dias totais é " + totalDias);
	}
}
