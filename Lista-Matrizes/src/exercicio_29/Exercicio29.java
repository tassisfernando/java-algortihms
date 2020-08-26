package exercicio_29;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		double[][] m1 = new double[2][2];
		
		m1 = preencheMatriz(m1);
		
		System.out.println("Matriz preenchida");
		escrever(m1);
		
		m1 = getInversa(m1);
		
		System.out.println("Matriz inversa");
		if(m1 != null)
			escrever(m1);
		else 
			System.out.println("A matriz não possui inversa.");
	}
	
	public static void escrever(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	private static double[][] getInversa(double[][] mat){
		double[][] aux = getInv(mat);
		
		if(det(mat) != 0) {
			double det = det(mat);
			for (int i = 0; i < aux.length; i++) {
				for (int j = 0; j < aux.length; j++) {
					mat[i][j] = (1/det)*aux[i][j];
				}
			}
		} else {
			return null;
		}
		return mat;
	}
	
	
	private static double det(double[][] mat) {
		return mat[0][0] * mat[1][1] - mat[0][1]*mat[1][0]; 
	}
	
	private static double[][] getInv(double[][] mat){
		double[][] aux = new double[mat.length][mat[0].length];
		
		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux.length; j++) {
				if(i == 0 && j == 0) {
					aux[i][j] = mat[i+1][j+1];
				}
				else if(i == 1 && j == 1) {
					aux[i][j] = mat[i-1][j-1];
				} else {
					aux[i][j] = (-1)*(mat[i][j]);
				}				
			}
		}
		return aux;
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
}
