package fatorial;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num, fat = 1;
		
		System.out.println("Informe um valor positivo: ");
		num = scn.nextInt();
		while(num < 0) {
			System.out.println("Valor inválido. Informe o valor positivo: ");
			num = scn.nextInt();
		}
		
		if(num == 0) 
			System.out.println("O fatorial de 0 é "+ fat);
		else {
			for(int i=1; i<=num; i++) {
				fat = fat*i;
			}
			System.out.println("O fatorial de "+num+" é "+ fat);
		}	
		
		scn.close();
	}

}
