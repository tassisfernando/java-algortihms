package exercicios1_10;

import java.util.Scanner;

public class Exercicio1_10 {

	public static void main(String[] args) {

		int dim = 3; 
		
		int[][] m = new int[dim][dim];

		m = ler(m);
		
		System.out.println("-----Matriz preenchida-----");
		show(m);
		
		System.out.println("\n-----Elementos da diagonal principal-----\n");
		int[] v = getDiagPrin(m);
		show(v);
		
		System.out.println("\n-----Elementos acima da diagonal principal-----\n");
		v = getAcimDiagPrin(m);
		show(v);
		
		System.out.print("\n-----Soma dos elementos acima da diagonal principal = ");
		System.out.println(getSoma(v));
		
		System.out.println("\n-----Elementos abaixo da diagonal principal-----\n");
		v = getAbaixDiagPrin(m);
		show(v);
		
		System.out.print("\n-----Soma dos elementos abaixo da diagonal principal = ");
		System.out.println(getSoma(v));
		
		System.out.println("\n-----Elementos da diagonal secundária-----\n");
		v = getDiagSec(m);
		show(v);
		
		System.out.println("\n-----Elementos acima da diagonal secundária-----\n");
		v = getAcimDiagSec(m);
		show(v);
		
		System.out.print("\n-----Soma dos elementos acima da diagonal secundária = ");
		System.out.println(getSoma(v));
		
		System.out.println("\n-----Elementos abaixo da diagonal secundária-----\n");
		v = getAbaixDiagSec(m);
		show(v);
		
		System.out.print("\n-----Soma dos elementos abaixo da diagonal secundária = ");
		System.out.println(getSoma(v));
	}
	
	public static int[] getDiagPrin(int[][] m) {
		int[] v = new int[m.length];
		int pos = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(i == j) {
					v[pos] = m[i][j];
					pos++;
				}
			}
		}
		return v;
	}
	
	public static int[] getAcimDiagPrin(int[][] m) {
		int[] v = new int[m.length];
		int pos = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(i < j) {
					v[pos] = m[i][j];
					pos++;
				}
			}
		}
		return v;
	}
	
	public static int[] getAbaixDiagPrin(int[][] m) {
		int[] v = new int[m.length];
		int pos = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(i > j) {
					v[pos] = m[i][j];
					pos++;
				}
			}
		}
		return v;
	}
	
	public static int[] getDiagSec(int[][] m) {
		int[] v = new int[m.length];
		int pos = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(i+j == m.length-1) {
					v[pos] = m[i][j];
					pos++;
				}
			}
		}
		return v;
	}
	
	public static int[] getAcimDiagSec(int[][] m) {
		int[] v = new int[m.length];
		int pos = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(i+j < m.length-1) {
					v[pos] = m[i][j];
					pos++;
				}
			}
		}
		return v;
	}
	
	public static int[] getAbaixDiagSec(int[][] m) {
		int[] v = new int[m.length];
		int pos = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(i+j >= m.length) {
					v[pos] = m[i][j];
					pos++;
				}
			}
		}
		return v;
	}

	public static int[][] ler(int[][] m){
		Scanner scn = new Scanner(System.in);
		System.out.println("-----PREENCHENDO A MATRIZ-----\n");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"] = ");
				m[i][j] = scn.nextInt();
			}
		}
		return m;
	}
	
	public static void show(int[][] m) {
		System.out.println();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void show(int[] m) {
		for (int i = 0; i < m.length; i++) {
				System.out.print(m[i]+"\t");
		}
	}
	
	public static int getSoma(int[] v) {
		int soma = 0;
		for (int i = 0; i < v.length; i++) {
			soma += v[i];
		}
		return soma;
	}
}
