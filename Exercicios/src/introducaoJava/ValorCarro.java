package introducaoJava;

import java.util.Scanner;

public class ValorCarro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double custoFabrica, imposto, distribuidor, custoConsumidor;
		
		System.out.println("Informe custo de fábrica do carro : ");
		custoFabrica = leia.nextDouble();
		
		imposto = (custoFabrica * 0.45);
		distribuidor = (custoFabrica * 0.28);
		custoConsumidor = custoFabrica + imposto + distribuidor;
		
		System.out.println("O custo do carro ao consumidor é R$ " + custoConsumidor);

	}

}
