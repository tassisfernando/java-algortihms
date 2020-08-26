package exercicioSomaLinha;

import java.util.Scanner;

public class SomaLinha {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Linhas das matrizes: ");
		int lin = scn.nextInt();

		System.out.println("Colunas das matrizes: ");
		int col = scn.nextInt();

		int[][] m1 = new int[lin][col];	
		
		m1 = preencheMatriz(m1);
		escrever(m1);
		
		int soma = 0;
		
		for (int i = 0; i < m1.length; i++) {
			for (int k = 0; k < m1[i].length; k++) {
				soma += m1[i][k];
			}
			System.out.println("Soma linha "+(i+1)+" = "+soma);
			soma = 0;
		}
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
