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
		System.out.println(" Colunas: ");
		int col = scn.nextInt();
		while (col <= 0) {
			System.out.println("Informe as dimensões da matriz: \n Colunas: ");
			col = scn.nextInt();
		}
		int[][] mat = new int[row][col];

		mat = preencheMatriz(mat);

		System.out.println("------------Antes de ordenar------------");
		exibeMatriz(mat);

		mat = ordena(mat);
		System.out.println("------------Depois de ordenar------------");
		exibeMatriz(mat);

		scn.close();
	}
	
	private static int[][] ordena(int[][] m){
		int aux;
		int c; 
		
		for (int lin = 0; lin < m.length; lin++) {
			for (int col = 0; col < m[lin].length; col++) {
				c = col;
				for (int i = lin; i < m.length; i++) {
					for (int j = c+1; j < m[lin].length; j++) {
						if(m[lin][col] > m[i][j]) {
							aux = m[lin][col];
							m[lin][col] = m[i][j];
							m[i][j] = aux;
						}
					}
					c = -1;
				}
			}
		}
		return m;
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
					// VAI PERCORRER O RESTO DA MATRIZ A PARTIR DO ELEMENTO ATUAL
					for (int j = lin; j < mat.length; j++) {
						// VAI COMEÇAR DO ELEMENTO DO LADO
						for (int i = c + 1; i < mat[j].length; i++) {
							if (mat[lin][col] > mat[j][i]) {
								aux = mat[lin][col];
								mat[lin][col] = mat[j][i];
								mat[j][i] = aux;
							}
						}
						// VAI VOLTAR A COMEÇAR PELA COLUNA 0 EM CADA LINHA
						c = -1;
					}
				}
			}
		}
		return mat;
	}
}