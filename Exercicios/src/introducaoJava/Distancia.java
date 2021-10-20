package introducaoJava;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		double x1 = 0.00, x2 = 0.00, y1 = 0.00, y2 = 0.00, d = 0.00;
		
		System.out.println("Insira valor x1 :");
		x1 = leia.nextDouble();
		
		System.out.println("Insira valor x2 :");
		x2 = leia.nextDouble();
		
		System.out.println("Insira valor y1 :");
		y1 = leia.nextDouble();
		
		System.out.println("Insira valor y2 :");
		y2 = leia.nextDouble();
		
		// d = raiz (x2-x1)^2 + (y2-y1)^2
		d = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
	
		System.out.printf("\nD = %.2f", d);
	}
}

