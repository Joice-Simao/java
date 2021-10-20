package introducaoJava;

import java.util.Scanner;

public class EquacaoLinear {

	public static void main(String[] args) {

		// variaveis
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, ee, f, x, y;
		// entradas
		System.out.println("Digite valor de A : ");
		a = leia.nextDouble();
		System.out.println("Digite valor de B : ");
		b = leia.nextDouble();
		System.out.println("Digite valor de C : ");
		c = leia.nextDouble();
		System.out.println("Digite valor de D : ");
		d = leia.nextDouble();
		System.out.println("Digite valor de E : ");
		ee = leia.nextDouble();
		System.out.println("Digite valor de F : ");
		f = leia.nextDouble();
		// procedimentos
		x = ((c * ee) - (b * f)) / ((a * ee) - (b * d));
		y = ((a * f) - (c * d)) / ((a * ee) - (b * d));
		c = ((a * x) + (b * y));
		f = ((d * x) + (ee * y));
		// saidas
		System.out.println("Resultado: ");
		System.out.printf("\nX = %.2f", x);
		System.out.printf("\nY = %.2f", y);
	}

}