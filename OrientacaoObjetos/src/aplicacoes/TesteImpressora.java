package aplicacoes;

import classes.Impressora;
import java.util.Scanner;

public class TesteImpressora {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String modelo;

		System.out.println("Modelo : ");
		modelo = leia.next();
		
		Impressora Impressora1 = new Impressora (modelo);
		
		
		
		
	}
}