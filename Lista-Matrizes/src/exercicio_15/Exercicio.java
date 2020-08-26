package exercicio_15;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[][] m = new int[3][5];
		m = preencher(m);
		escrever(m);
		
		int[] s = new int[3];

		for (int j = 0; j < m.length; j++) {
			for (int k = 0; k < m[j].length; k++) {
				s[j] += m[j][k];
			}
			System.out.println("Soma da linha "+(j+1)+" = "+s[j]);
		}
		
	}

	public static int[][] preencher(int[][] m) {
		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("[" + i + "][" + j + "]:");
				m[i][j] = scn.nextInt();
			}
		}
		return m;
	}
	
	public static void escrever(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
