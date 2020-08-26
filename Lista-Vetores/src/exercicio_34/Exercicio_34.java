package exercicio_34;

import java.util.Scanner;

public class Exercicio_34 {

	public static void main(String[] args) {
		double[][] tempos = new double[10][2];

		for (int i = 0; i < tempos.length; i++) {
			tempos[i][0] = i + 1;
		}
		
		System.out.println("---ATLETAS LIDOS---");
		tempos = read(tempos);
		show(tempos);
		
		System.out.println("\n---ATLETAS ORDENADOS PELO TEMPO---");
		tempos = order(tempos);
		show(tempos);
	}

	public static void show(double[][] m) {
		for (int j = 0; j < m.length; j++) {
			System.out.print("Atleta: " + m[j][0]);
			System.out.println("\tTempo: " + m[j][1]);
		}
	}

	public static double[][] order(double[][] m) {
		double aux;
		for (int i = m.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (m[j][1] > m[j + 1][1]) {
					aux = m[j][1];
					m[j][1] = m[j + 1][1];
					m[j + 1][1] = aux;

					aux = m[j][0];
					m[j][0] = m[j+1][0];
					m[j+1][0] = aux;
				}
			}
		}
		return m;
	}

	public static double[][] read(double[][] v) {
		Scanner scn = new Scanner(System.in);
		if (v != null) {
			for (int i = 0; i < v.length; i++) {
				System.out.println("Tempo do atleta " + (i + 1) + ": ");
				v[i][1] = scn.nextDouble();
			}
		}
		scn.close();
		return v;
	}

}
