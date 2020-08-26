package exercicio_32;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Tamanho: ");
		int tam = scn.nextInt();
		
		while(tam <= 0 || tam > 20) {
			System.out.println("Tamanho inválido. Informe outro: ");
			tam = scn.nextInt();
		}
		
		int[] v = new int[tam];
		
		System.out.println("----Preenchendo----");
		for (int i = 0; i < v.length; i++) {
			System.out.println("Pos. "+(i+1)+" = ");
			v[i] = scn.nextInt();
		}
		
		System.out.println("\n----Vetor preenchido----");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]+"\t");
		}
		
		int aux;
		for (int i = v.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(v[j] < v[j+1]) {
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
		
		System.out.println("----Vetor ordenado----");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]+"\t");
		}
	}
}
