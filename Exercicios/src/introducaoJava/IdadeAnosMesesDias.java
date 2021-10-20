package introducaoJava;

import java.util.Scanner;

public class IdadeAnosMesesDias {

	public static void main(String[] args) {
		
		int anos, meses, dias, totalDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a idade expressa em dias: ");
		totalDias = ler.nextInt();
		
		anos = (totalDias / 365);
		meses = ((totalDias % 365) / 30);
		dias = ((totalDias % 365) % 30);
		
		System.out.printf("Anos: %d\n", anos);
		System.out.printf("Meses: %d\n", meses);
		System.out.printf("Dias: %d\n", dias);
	}
}

