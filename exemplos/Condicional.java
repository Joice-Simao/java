package exemplos;

import java.util.Scanner;

public class Condicional {
	public static void main(String[] args){
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis 
		String nome;
		int anoNascimento,idade;
		
		//entradas
		System.out.println("Digite o seu nome : ");
		nome = leia.next();
		
		System.out.println("Digite o seu ano de nascimento : ");
		anoNascimento = leia.nextInt();
		
		idade = (2021 - anoNascimento);
		
		System.out.printf("%d sua idade é %d anos e seu salário R$ %d");
		
		if (idade >45) {
			System.out.print("%d sua idade é %d anos, vc é gringe!");
		}
		else if  (idade >=18) {
			System.out.print("%d sua idade é %d anos, vc é adulte!");
		}
		else if  (idade >=13) {
			System.out.print("%d sua idade é %d anos, vc é jovem!");
		}
		else if  (idade ==0) {
				System.out.print("Recém nascido!");
		}
	}
}
