package introducaoJava;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double nota1 = 0.00, nota2 = 0.00, nota3 = 0.00, mediaFinal = 0.00;
		double pesoNota1 = 2.00, pesoNota2 = 3.00, pesoNota3 = 5.00;

		System.out.println("Digite valor da nota 1 : ");
		nota1 = leia.nextDouble();

		System.out.println("Digite valor da nota 2 : ");
		nota2 = leia.nextDouble();

		System.out.println("Digite valor da nota 3 : ");
		nota3 = leia.nextDouble();

		mediaFinal = ((nota1 * pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3))
				/ (pesoNota1 + pesoNota2 + pesoNota3);

		System.out.println("A média final é : " + mediaFinal);
	}
}
