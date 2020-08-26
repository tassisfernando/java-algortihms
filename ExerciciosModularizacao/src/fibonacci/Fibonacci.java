package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Quantos termos?");
		int n = scn.nextInt();
		while (n < 2) {
			System.out.println("Escolha mais termos: ");
			n = scn.nextInt();
		}
		
		System.out.println("\nFibonacci");
		int[] v = getFibo(n);

		System.out.println("\n\nEscolha o n-ésimo número da série de Fibonacci: ");
		n = scn.nextInt();
		int num = getNum(v, n);

		if (num != 0) {
			System.out.println("\n" + n + "° termo = " + num);
		} else {
			System.out.println("Não existe esse termo.");
		}
		scn.close();
	}

	public static int[] getFibo(int tam) {
		int[] v = new int[tam];
		v[0] = 1;
		v[1] = 1;
		for (int i = 0; i < v.length; i++) {
			if (i > 1)
				v[i] = v[i - 1] + v[i - 2];
			System.out.print(v[i] + "\t");
		}
		return v;
	}

	public static int getNum(int[] v, int n) {
		int num = 0;
		if (n <= v.length && n >= 0)
			num = v[n - 1];
		return num;
	}
}
