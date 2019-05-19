package exercicio_76;

import java.util.Scanner;

public class Exercicio_76 {
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int num, prod = 1, soma = 0;
		
		System.out.println("Informe um número:");
		num = scn.nextInt();
		
		while(num > 0) {
			if(num % 2 == 0) {
				soma += num;
			} else {
				prod = prod*num;
			}
			System.out.println("Informe um número:");
			num = scn.nextInt();
		}
		System.out.println("Produto dos ímpares: "+prod+".\nSoma dos pares: "+soma);
		scn.close();
	}

}
