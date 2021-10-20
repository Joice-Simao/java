package vetoresMatrizes;

import java.util.Random;

public class VetorDado {
	
	public static void main(String[] args) {
		
		//variaveis
		Random lancar = new Random();
		int lancamentoDado=10, total=0;
		double media=0.00;
		int maior = 0;
		int valores[] = new int[10];// vetor
		
		for (int x = 0; x <10; x++){
			total = valores[x] + total;
			System.out.print("["+lancar.nextInt(7)+"] ");
			
			if (valores[x] > maior) {
				maior = valores[x];				
			}
		}
		
		media = (total /lancamentoDado);
		System.out.println("\n\nOcorrências da maior pontuação : "+maior);
		System.out.println("Média: "+media);
		
	}
	
}
