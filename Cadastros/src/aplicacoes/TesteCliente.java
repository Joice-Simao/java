package aplicacoes;

import classes.Cliente;
import java.util.Scanner;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String cpf;
		String nome;
		
		System.out.println("Digite o cpf : ");
		cpf = leia.next();
		System.out.println("Digite o nome : ");
		nome = leia.next();
		
		Cliente cli1 = new Cliente(cpf, nome);
		
		System.out.println(cli1.getNome());
	}
}