package exercicio_12;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Linhas das matrizes: ");
		int lin = scn.nextInt();

		System.out.println("Colunas das matrizes: ");
		int col = scn.nextInt();

		int[][] m1 = new int[lin][col];	
		int[][] m2 = new int[lin][col];

		int[][] m3 = new int[lin][col];

		System.out.println("M1:");
		m1 = preencheMatriz(m1);
		escrever(m1);
		
		System.out.println("M2:");
		m2 = preencheMatriz(m2);
		escrever(m2);
		
		m3 = somar(m1, m2);
		System.out.println("Soma: ");
		escrever(m3);

	}
	
	public static int[][] somar(int[][] m1, int[][] m2){
		int[][] m3 = new int[m1.length][m1[0].length];
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		return m3;
	}

	private static int[][] preencheMatriz(int[][] mat) {
		Scanner scn = new Scanner(System.in);

		System.out.println("------------Preenchendo a matriz------------");
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
				System.out.println("[" + row + "][" + col + "]:");
				mat[row][col] = scn.nextInt();
			}
		}
		System.out.println();
		
		return mat;
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
