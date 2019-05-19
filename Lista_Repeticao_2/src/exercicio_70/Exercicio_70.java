package exercicio_70;

import java.util.Scanner;

public class Exercicio_70 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int maior, menor, num;
		
		System.out.println("Informe um número positivo: ");
		num = scn.nextInt();
		while(num <= 0) {
			if(num != -1) {
				System.out.println("Número inválido. Informe um positivo: ");
				num = scn.nextInt();			
			}else {
				System.out.println("Programa encerrado: sem maior e menor números");
			}
		}
		maior = num;
		menor = num;
		
		while(num != -1) {
			System.out.println("Informe um número: ");
			num = scn.nextInt();
			while( num <= 0 && num != -1) {
				System.out.println("Número inválido. Informe um positivo: ");
				num = scn.nextInt();
			}
			if(num != -1) {
				if(num > maior)
					maior = num;
				else if( num < menor)
					menor = num;
			}
		}
		System.out.println("-------- Maior: "+maior);
		System.out.println("-------- Menor: "+menor);
		
		scn.close();
	}

}
