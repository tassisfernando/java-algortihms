package exercicio_21;

import java.util.Scanner;

public class Exercicio {
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		
		double[][] m1 = new double[3][3];
		m1 = preencheMatriz(m1);
		
		System.out.println("Matriz preenchida");
		escrever(m1);
		
		double[][] m2 = get90(m1);
		
		System.out.println("Matriz virada");
		escrever(m2);
	}
	
	private static double[][] get90(double[][] m){
		double[][] res = new double[3][3];
		double[] v = new double[3];
		int cont = 2;
		for (int l = 0; l < res.length; l++) {
			for (int c = 0; c < res.length; c++) {
				v[c] = m[l][c];
			}
			for (int i = res.length-1; i >= 0; i--) {
				res[i][cont] = v[i];
			}
			cont--;
		}
		return res;
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
