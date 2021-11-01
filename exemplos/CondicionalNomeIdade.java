package exemplos;

import java.util.Scanner; 
public class CondicionalNomeIdade {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.print("Entre com a seu nome: ");
		nome = ler.nextLine();
		System.out.print("Entre com a sua idade: ");
		idade = ler.nextInt();
	
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		if (idade >=18) {
			System.out.printf("\nVocê é maior de idade");
		}
		else if (idade >=1 && idade<18) {
			System.out.printf("\nVocê é menor de idade");
		}
		else {
			System.out.printf("\nVocê entrou com uma idade inválida!");
		}
	}	
}


