package exercicio_82;

import java.util.Scanner;

public class Exercicio_82 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		int n1 = 1, n2 = 2, n3 = 3, num;
		
		System.out.println("Escreva um número: ");
		num = scn.nextInt();
		while(num < 0) {
			System.out.println("Escreva um número: ");
			num = scn.nextInt();
		}
		
		while(num > n1*n2*n3) {
			n1++;
			n2++;
			n3++;
		}
		if(num == n1*n2*n3)
			System.out.println("O número "+num+" pode ser escrito como "+n1+"x"+n2+"x"+n3);
		else 
			System.out.println("O número "+num+" não é triangular");
		
		scn.close();
	}
}
