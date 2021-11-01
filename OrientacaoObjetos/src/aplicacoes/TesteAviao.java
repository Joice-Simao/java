package aplicacoes;

import classes.Aviao;
import classes.Cliente;

import java.util.Scanner;

public class TesteAviao {
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			String modelo, nome;
					
			System.out.println("Nome: ");
			nome = leia.next();
			
			System.out.println("Modelo : ");
			modelo = leia.next();
			
			Aviao avi1 = new Aviao(nome, modelo);
			
			System.out.println(avi1.getNome());
			
			
		}
}
