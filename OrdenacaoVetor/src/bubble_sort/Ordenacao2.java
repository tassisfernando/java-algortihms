package bubble_sort;

import java.util.Scanner;

public class Ordenacao2 {

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
		System.out.println("------Ordenando de forma decrescente------");
		int aux;
		//j começa na primeira posição
		for(int j = 0; j < vet.length-1; j++) {
			//i começa na penúltima posição e vai até a posição j
			for (int i = vet.length-2; i >= j; i--) {
				//coloca o maior na posição j
				if(vet[i] < vet[i+1]) {
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
