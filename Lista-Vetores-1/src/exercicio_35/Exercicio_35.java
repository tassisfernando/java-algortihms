package exercicio_35;

import java.util.Scanner;

public class Exercicio_35 {
	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Informe o tamanho do vetor: ");
		int tam = scn.nextInt();
		
		while(tam > 20) {
			System.out.println("Informe o tamanho do vetor (menor ou igual a 20): ");
			tam = scn.nextInt();
		}
		
		int[] v = new int[tam];
		v = read(v);
		
		System.out.println("------Depois da leitura------");
		show(v);
		
		System.out.println("Escolha uma posição: ");
		int k = scn.nextInt();
		
		System.out.println("Valor na posição "+k+" antes de ordenar: "+v[k-1]);
		
		order(v);
		
		System.out.println("------Depois de ordenado----");
		show(v);
		
		System.out.println("Novo valor na posição "+k+" depois de ordenar: "+v[k-1]);
		
		scn.close();
	}
	
	public static void show(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]+"\t");
		}
		System.out.println();
	}
	
	public static int[] read(int[] v) {
		Scanner scn = new Scanner(System.in);

		if(v != null) {
			for (int i = 0; i < v.length; i++) {
				System.out.println("Pos "+(i+1)+": ");
				v[i] = scn.nextInt();
			}
		}
		scn.close();
		return v;
	}
	
	public static int[] order(int[] v) {
		int aux;
		if(v != null) {
			for (int i = v.length-1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if(v[j] > v[j+1]) {
						aux = v[j];
						v[j] = v[j+1];
						v[j+1] = aux;
					}
				}
			}
		}
		return v;
	}
}
