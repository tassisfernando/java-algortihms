package ordenacao;

import java.util.Scanner;

public class Ordenacao {

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Informe as dimensões da matriz: \n Linhas: ");
		int row = scn.nextInt();
		while (row <= 0) {
			System.out.println("Informe as dimensões da matriz: \n Linhas: ");
			row = scn.nextInt();
		}
		System.out.println("Colunas: ");
		int col = scn.nextInt();
		while (col <= 0) {
			System.out.println("Informe as dimensões da matriz: \n Colunas: ");
			col = scn.nextInt();
		}
		int[][] mat = new int[row][col];

		mat = preencheMatriz(mat);

		exibeMatriz(mat);

		mat = ordenaMatriz(mat);
		
//		int aux = 0;
//		for (int linha = 0; linha < mat.length; linha++) {
//			for (int coluna = 0; coluna < mat[linha].length; coluna++) {
//				int col = coluna;
//				for (int i = linha; i < mat.length; i++) {
//					for (int j = col + 1; j < mat[i].length; j++) {
//						if (mat[linha][coluna] > mat[i][j]) {
//							aux = mat[linha][coluna];
//							mat[linha][coluna] = mat[i][j];
//							mat[i][j] = aux;
//						}
//					}
//					col = -1;
//				}
//			}
//		}

		exibeMatriz(mat);

		scn.close();
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
		scn.close();
		return mat;
	}

	private static void exibeMatriz(int[][] mat) {
		if (mat != null) {
			System.out.println("Exibindo a matriz");
			for (int row = 0; row < mat.length; row++) {
				for (int col = 0; col < mat[0].length; col++) {
					if (col == 0)
						System.out.print("|" + mat[row][col] + "\t");
					else if (col == mat[0].length - 1)
						System.out.print(mat[row][col] + "|");
					else
						System.out.print(mat[row][col] + "\t");
				}
				System.out.println();
			}
		}
	}

	private static int[][] ordenaMatriz(int[][] mat) {
		int c, aux;
		
		if (mat != null) {
			for (int lin = 0; lin < mat.length; lin++) {
				for (int col = 0; col < mat[lin].length; col++) {
					c = col;
					for (int i = lin; i < mat.length; i++) {
						for (int j = c+1; j < mat[i].length; j++) {
							if(mat[lin][col] > mat[i][j]) {
								aux = mat[i][j];
								mat[i][j] = mat[lin][col];
								mat[lin][col] = aux;
							}
						}
						c = -1;
					}
				}
			}
		}
		return mat;
	}
}
