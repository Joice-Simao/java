package exemplos;

import java.util.Scanner;

public class CalculoTriangulo {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);				
		double base1, base2;
		double altura1,altura2;
		double area1,area2;
		double maior;
		
		Triangulo t3 = new Triangulo();//exemplo triangulo 3 usando classe 
		
		// triangulo 1
		System.out.println("Qual a base do triângulo 1: ");
		base1 = leia.nextInt();
		System.out.println("Qual a altura do triângulo 1: ");
		altura1 = leia.nextInt();
		
		area1 = ((base1 * altura1) / 2);
				
		// triangulo 2
		System.out.println("Qual a base do triângulo 2: ");
		base2 = leia.nextInt();
		System.out.println("Qual a altura do triângulo 2: ");
		altura2 = leia.nextInt();				
		 
		area2 = (base2 * altura2) / 2;
		
		System.out.println("A area do triângulo 1 é : " +area1);		
		System.out.println("A area do triângulo 2 é : " +area2);
			
		if (area1 == area2) {
			System.out.println("Triângulos com areas iguais");
		}
		else if (area1 > area2)	{
			System.out.println("A area do triângulo 1 é maior que triangulo 2");
		}
		else
		System.out.println("A area do triângulo 2 é maior que triangulo 1");		
	}
}
