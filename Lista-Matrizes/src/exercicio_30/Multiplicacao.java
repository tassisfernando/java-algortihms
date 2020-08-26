package exercicio_30;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Linhas da primeira matriz: ");
		int lin = scn.nextInt();

		while (lin <= 0) {
			System.out.println("A matriz precisa pelo menos 1 linha: ");
			lin = scn.nextInt();
		}

		System.out.println("Colunas da primeira matriz: ");
		int col = scn.nextInt();

		while (col <= 0) {
			System.out.println("A matriz precisa pelo menos 1 coluna: ");
			lin = scn.nextInt();
		}

		int[][] m1 = new int[lin][col];

		m1 = preencheMatriz(m1);
		escrever(m1);

		System.out.println("A segunda matriz terá " + col + " linhas. Quantas colunas ela terá? ");
		int col2 = scn.nextInt();

		while (col2 <= 0) {
			System.out.println("A matriz precisa pelo menos 1 coluna: ");
			lin = scn.nextInt();
		}

		int[][] m2 = new int[col][col2];
		m2 = preencheMatriz(m2);
		escrever(m2);

		System.out.println("A matriz resultado terá " + lin + " linhas e " + col2 + " colunas.");
		int[][] m3 = multiplicar(m1, m2);
		escrever(m3);
	}
	
	public static int[][] multiplicar(int[][] m1, int[][] m2){
		int[][] m3 = new int[m1.length][m2[0].length];
		
		for (int l = 0; l < m3.length; l++) {
			for (int c = 0; c < m3[l].length; c++) {
				for (int i = 0; i < m1[0].length; i++) {
					m3[l][c] += m1[l][i] * m2[i][c];
				}
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
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
