package introducaoJava;

import java.util.Scanner;

public class ValorCarro {

	public static void main(String[] args) {
		// variaveis
		Scanner leia = new Scanner(System.in);
		double custoFabrica, imposto, distribuidor, custoConsumidor;
		// entradas
		System.out.println("Informe custo de fábrica do carro : ");
		custoFabrica = leia.nextDouble();
		// procedimentos
		imposto = (custoFabrica * 0.45);
		distribuidor = (custoFabrica * 0.28);
		custoConsumidor = custoFabrica + imposto + distribuidor;
		// saidas
		System.out.println("O custo do carro ao consumidor é R$ " + custoConsumidor);

	}

}
