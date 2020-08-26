package exercicio_33;

import java.util.Scanner;

public class Exercicio33 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Quantidade de números: ");
		int tam = scn.nextInt();

		while (tam < 0 || tam > 1000) {
			System.out.println("Informe um valor entre 0 e 1000: ");
			tam = scn.nextInt();
		}

		int[] v = new int[tam];

		v = preenche(v);

		System.out.println("Valores informados: ");
		exibe(v);

		System.out.println("Valores ordenados: ");
		v = ordena(v);
		exibe(v);

		System.out.println("Valores que repetem: ");
		repete(v);
	}

	public static void repete(int[] v) {
		int cont = 0, rep=13546546;
		for (int i = 0; i < v.length - 1; i++) {
			cont = 0;
			if (v[i] == v[i + 1] && v[i] != rep) {
				rep = v[i];
				cont++;
				for (int j = i + 1; j < v.length - 1; j++) {
					if (v[i] == v[j + 1])
						cont++;
				}
				System.out.println("O número "+v[i]+" se repete "+cont+" vezes.\n");
			}
		}
	}

	public static int[] ordena(int[] v) {
		int aux;

		for (int i = v.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (v[j] > v[j + 1]) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}

		return v;
	}

	public static void exibe(int[] v) {
		String str = "";
		for (int i = 0; i < v.length; i++) {
			if (i != v.length - 1)
				str += v[i] + " - ";
			else
				str += v[i];
		}
		System.out.println(str + "\n");
	}

	public static int[] preenche(int[] v) {
		Scanner scn = new Scanner(System.in);

		System.out.println("----Preenchendo----");
		for (int i = 0; i < v.length; i++) {
			System.out.println("[" + (i + 1) + "] = ");
			v[i] = scn.nextInt();
		}
		return v;
	}
}
