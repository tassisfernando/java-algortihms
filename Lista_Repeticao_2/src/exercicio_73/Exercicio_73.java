package exercicio_73;

import java.util.Scanner;

public class Exercicio_73 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		double massa, tempo = 0;
		
		System.out.println("Informe a massa inicial (em gramas): ");
		massa = scn.nextDouble();
		
		while(massa > 0.1) {
			massa = massa*0.75;
			tempo += 30;
		}
		System.out.println("Tempo necessário: "+tempo+" segundos");
		scn.close();
	}
}
