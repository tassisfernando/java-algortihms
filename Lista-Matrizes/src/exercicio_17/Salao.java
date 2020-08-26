package exercicio_17;

import java.util.Scanner;

public class Salao {

	public static void main(String[] args) {

		int[][] servicos = new int[3][3];
		
		servicos = preencheMatriz(servicos);
		escrever(servicos);
		
		double[] salarios = new double[servicos.length];
		
		for (int i = 0; i < servicos.length; i++) {
			for (int j = 0; j < servicos[i].length; j++) {
				if (j == 0)
					salarios[i] += (double) (servicos[i][j] * 10) / 2;
				else if (j == 1)
					salarios[i] += (double) (servicos[i][j] * 15) / 2;
				else if (j == 2)
					salarios[i] += (double) (servicos[i][j] * 30) / 2;
			}
		}
		
		for (int i = 0; i < salarios.length; i++) {
			System.out.println("Manicure "+(i+1)+" - Salário = "+salarios[i]);
		}
	}

	public static void escrever(int[][] m) {
		System.out.println("------------Manicures------------");
		System.out.println("Pés\tMãos\tPodologia");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static int[][] preencheMatriz(int[][] mat) {
		Scanner scn = new Scanner(System.in);

		System.out.println("------------Manicures------------");
		for (int row = 0; row < mat.length; row++) {
			System.out.println("Manicure " + (row + 1) + ": ");
			for (int col = 0; col < mat[0].length; col++) {
				if (col == 0)
					System.out.println("Pés: ");
				else if (col == 1)
					System.out.println("Mãos: ");
				else if (col == 2)
					System.out.println("Podologia: ");

				mat[row][col] = scn.nextInt();
			}
		}
		System.out.println();

		return mat;
	}
}
