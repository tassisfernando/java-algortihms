package exercicio_26;

import java.util.Scanner;

public class Transposta {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Informe a quantidade de linhas: ");
		int l = scn.nextInt();

		System.out.println("Informe a quantiade de colunas: ");
		int c = scn.nextInt();

		double[][] m1 = new double[l][c];

		m1 = preencheMatriz(m1);

		System.out.println("Matriz preenchida");
		escrever(m1);

		double[][] trans = getTransposta(m1);

		System.out.println("Matriz transposta");
		escrever(trans);
		
		if(equals(m1, trans))
			System.out.println("A matriz 1 é simétrica, ou seja, é igual a sua transposta.");
		else 
			System.out.println("A matriz 1 não é simétrica.");
		
		double[][] inv = multEscalar(m1, -1);
		
		if(equals(trans, inv))
			System.out.println("A matriz 1 é anti-simétrica, ou seja, é igual a sua transposta multiplicada por -1.");
		else 
			System.out.println("A matriz 1 não é anti-simétrica.");
		
	}

	private static double[][] multEscalar(double[][] mat, double esc) {
		double[][] m = new double[mat.length][mat[0].length];

		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
				m[row][col] = mat[row][col] * esc;
			}
		}

		return m;
	}

	private static double[][] getTransposta(double[][] mat) {
		Scanner scn = new Scanner(System.in);

		double[][] trans = new double[mat[0].length][mat.length];

		for (int row = 0; row < trans.length; row++) {
			for (int col = 0; col < trans[0].length; col++) {
				trans[row][col] = mat[col][row];
			}
		}
		System.out.println();

		return trans;
	}

	private static boolean equals(double[][] m1, double[][] m2) {
		if (m1.length == m2.length && m1[0].length == m2[0].length) {
			for (int i = 0; i < m2.length; i++) {
				for (int j = 0; j < m2[0].length; j++) {
					if (m1[i][j] != m2[i][j])
						return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	private static double[][] preencheMatriz(double[][] mat) {
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

	public static void escrever(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
