package exercicio_29;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Tamanho do primeiro conjunto: ");
		int tam = scn.nextInt();

		while (tam <= 0 || tam > 30) {
			System.out.println("Tamanho do primeiro conjunto: ");
			tam = scn.nextInt();
		}

		int[] v1 = new int[tam];
		v1 = preenche(v1);

		System.out.println("Primeiro conjunto: ");
		exibe(v1);

		System.out.println("Tamanho do segundo conjunto: ");
		int tam2 = scn.nextInt();

		while (tam2 <= 0 || tam2 > 20) {
			System.out.println("Tamanho do segundo conjunto: ");
			tam2 = scn.nextInt();
		}

		int[] v2 = new int[tam2];
		v2 = preenche(v2);

		System.out.println("Segundo conjunto: ");
		exibe(v2);

		int[] u = new int[v1.length + v2.length];

		System.out.println("União: ");
		u = uniao(u, v1, v2);
		exibe(u);

		System.out.println("Interseção");

		if (tam > tam2) {
			int[] in = new int[tam2];
			in = intersec(in, v2, v1);
			exibe(in);

		} else {
			int[] in = new int[tam];
			in = intersec(in, v1, v2);
			exibe(in);
		}
		
	}
	
	public static boolean possui(int[] v, int aux) {
		for (int j = 0; j < v.length; j++) {
			if (aux == v[j]) {
				return true;
			}
		}
		return false;
	}

	public static int[] intersec(int[] in, int[] menor, int[] maior) {
		for (int i = 0; i < in.length; i++) {
			if (possui(maior, menor[i])) {
				in[i] = menor[i];
			}
		}

		return in;
	}

	public static int[] uniao(int[] u, int[] v1, int[] v2) {
		int aux;
		for (int i = 0; i < v1.length; i++) {
			aux = v1[i];
		    u[i] = aux;
		}

		int p = v1.length;
		int j = 0;
		while (p < u.length) {
			aux = v2[j];
			u[p] = aux;
			
			p++;
			j++;
		}
		return u;
	}

	public static int[] preenche(int[] v) {
		Scanner scn = new Scanner(System.in);

		int aux;
		for (int i = 0; i < v.length; i++) {
			System.out.println((i + 1) + "° elemento: ");
			aux = scn.nextInt();

			while (repete(v, aux, i)) {
				System.out.println("Esse elemento já existe!");
				aux = scn.nextInt();
			}

			v[i] = aux;
		}

		return v;
	}

	public static boolean repete(int[] v, int aux, int i) {
		for (int j = i; j > 0; j--) {
			if (aux == v[j - 1]) {
				return true;
			}
		}
		return false;
	}

	public static int[] exibe(int[] v) {
		String str = "";
		for (int i = 0; i < v.length; i++) {
			if (i != v.length - 1)
				if (i == 0)
					str += "{" + v[i] + ", ";
				else
					str += v[i] + ", ";
			else
				str += v[i] + "}";
		}

		System.out.println(str + "\n");
		return v;
	}

}
