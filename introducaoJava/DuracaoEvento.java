package introducaoJava;

import java.util.Scanner;

public class DuracaoEvento {
	public static void main(String[] args) {
		// variaveis
		int horas, minutos, segundos, segundosTotais;

		// entradas
		Scanner ler = new Scanner(System.in);
		System.out.print("Tempo de duração do evento em segundos: ");
		segundosTotais = ler.nextInt();

		// processo
		horas = (segundosTotais / 3600);
		minutos = ((segundosTotais % 3600) / 60);
		segundos = ((segundosTotais % 3600) % 60);

		// saidas
		System.out.printf("\nTempo total do evento em horas: %d", horas);
		System.out.printf("\nTempo total do evento em minutos: %d", minutos);
		System.out.printf("\nTempo total do evento em segundos: %d", segundos);
	}
}