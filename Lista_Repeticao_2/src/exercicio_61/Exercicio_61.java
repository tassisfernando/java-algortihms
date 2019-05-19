package exercicio_61;

import java.util.Scanner;

public class Exercicio_61 {

	public static void main(String[] args) {
		double num = 0;
		Scanner scn = new Scanner(System.in);
		
		while(num != -999) {
			System.out.println("Informe um número: ");
			num = scn.nextDouble();
			System.out.println(num*3);
		}
		System.out.println("---------Programa encerrado--------");
		scn.close();
	}

}
