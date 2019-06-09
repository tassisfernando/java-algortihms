package bubble_sort;

import java.util.Scanner;

public class Ordenacao {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			
		System.out.println("Informe o tamanho do vetor: ");
		int tam = scn.nextInt();
		
		int vet[] = new int[tam];
		
		System.out.println("------Preenchendo o vetor------");
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Posição "+(i+1)+": ");
			vet[i] = scn.nextInt();
		}
		
		System.out.println("------Vetor preenchido------");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+"\t");
		}
		
		System.out.println();
		System.out.println("------Ordenando------");
		int aux;
		for(int j = vet.length-1; j > 0; j--) {
			//Coloca o maior na última posição (pos j)
			for (int i = 0; i < j; i++) {
				if(vet[i] > vet[i+1]) {
					aux = vet[i];
					vet[i] = vet[i+1];
					vet[i+1] = aux;
				}
			}
		}
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+"\t");
		}
		
		scn.close();
	}
}
