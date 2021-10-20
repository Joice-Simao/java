package introducaoJava;

import java.util.Scanner;

public class Expressao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double a = 0.00, b = 0.00, c = 0.00, r = 0.00, s = 0.00, d = 0.00;
		
		System.out.println("Insira valor de A : ");
		a = leia.nextInt();
		
		System.out.println("Insira valor de B : ");
		b = leia.nextInt();
		
		System.out.println("Insira valor de C : ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s) / 2;
		
		System.out.printf("\nR = %.2f", r);
		System.out.printf("\nS = %.2f", +s);
		System.out.printf("\nD = %.2f", +d);
	}
}
