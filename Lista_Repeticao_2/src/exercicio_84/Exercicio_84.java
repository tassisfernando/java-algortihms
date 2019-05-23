package exercicio_84;

import java.util.Scanner;

public class Exercicio_84 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n1, n2, n3, maior, i;
		boolean mmc = false;
		
		
		System.out.println("Informe o primeiro número: ");
		n1 = scn.nextInt();
		maior = n1;
		
		System.out.println("Informe o segundo número: ");
		n2 = scn.nextInt();
		if(n2 > maior) 
			maior = n2;
		
		System.out.println("Informe o terceiro número: ");
		n3 = scn.nextInt();
		if(n3 > maior)
			maior = n3;
		
		i = maior;
	
		while(!mmc) {
			if((i % n1 == 0) && (i % n2 == 0) && (i % n3 == 0)) {
				mmc = true;
			}else
				i++;
		}
		System.out.println("O MMC entre "+n1+", "+n2+" e "+n3+" é "+i);
		
		scn.close();
	}

}
