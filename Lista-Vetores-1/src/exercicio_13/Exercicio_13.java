package exercicio_13;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Informe a quantidade de números a ser informada: ");
		int tam = scn.nextInt();
		while (tam <= 0) {
			System.out.println("Informe pelo menos um numero :)");
			tam = scn.nextInt();
		}

		int vet[] = new int[tam];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° número:");
			vet[i] = scn.nextInt();
		}

		System.out.println("Vetor antes:");
		for (int i = 0; i < vet.length; i++) {
			if (i == 0)
				System.out.print("[" + vet[i] + ", ");
			else if (i == vet.length - 1)
				System.out.print(vet[i] + "]");
			else
				System.out.print(vet[i] + ", ");
		}

		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) Math.pow(vet[i], 3);
		}

		System.out.println();

		System.out.println("Vetor depois:");
		for (int i = 0; i < vet.length; i++) {
			if (i == 0)
				System.out.print("[" + vet[i] + ", ");
			else if (i == vet.length - 1)
				System.out.print(vet[i] + "]");
			else
				System.out.print(vet[i] + ", ");
		}
		
		scn.close();
	}

}
