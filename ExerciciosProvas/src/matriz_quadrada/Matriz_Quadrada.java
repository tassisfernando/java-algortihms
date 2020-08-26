package matriz_quadrada;

import java.util.Scanner;

public class Matriz_Quadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe a ordem da matriz quadrada: ");
		int n = scn.nextInt();
		
		int[][] mat = new int[n][n];
		
		System.out.println("Preenchendo a matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("["+i+"]["+j+"] = ");
				mat[i][j] = scn.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("MATRIZ PREENCHIDA");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\nVALORES NA DIAGONAL PRINCIPAL");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i == j) {
					System.out.print(mat[i][j]+"\t");
				}
			}
		}
		
		System.out.println("\nVALORES NA DIAGONAL SECUNDÁRIA");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i+j == n-1)
					System.out.print(mat[i][j]+"\t");
			}
		}
		
		System.out.println("\nVALORES ABAIXO DA DIAGONAL PRINCIPAL");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i > j)
					System.out.print(mat[i][j]+"\t");
			}
		}
		
		System.out.println("\nVALORES ACIMA DA DIAGONAL PRINCIPAL");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i < j)
					System.out.print(mat[i][j]+"\t");
			}
		}
		
		System.out.println("\nVALORES ABAIXO DA DIAGONAL SECUNDÁRIA");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i + j >= n)
					System.out.print(mat[i][j]+"\t");
			}
		}
		
		System.out.println("\nVALORES ACIMA DA DIAGONAL SECUNDÁRIA");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(i+j < n-1)
					System.out.print(mat[i][j]+"\t");
			}
		}
	}

}
