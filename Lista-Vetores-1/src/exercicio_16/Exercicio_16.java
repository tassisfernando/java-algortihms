package exercicio_16;

import java.util.Scanner;

public class Exercicio_16 {
	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Informe a quantidade de atletas que será informada: ");
		int qtd = scn.nextInt();
		
		while(qtd <= 0) {
			System.out.println("Informe pelo menos um atleta, please: ");
			qtd = scn.nextInt();
		}
		
		double[] vet = new double[qtd];
		
		vet = lerAlt(vet);
		
		double media = getMedia(vet);
		
		listarAcima(vet, media);
		
		scn.close();
	}
	
	public static void listarAlt(double[] vet) {
		System.out.println("ALTURAS DOS ATLETAS");
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Atleta "+(i+1)+": "+vet[i]);
		}
	}
	
	public static void listarAcima(double[] vet, double media) {
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] > media) {
				System.out.println("Atleta "+(i+1)+" acima da média - altura: "+vet[i]);
			}
		}
	}
	
	public static double[] lerAlt(double[] vet) {
		Scanner scn = new Scanner(System.in);

		System.out.println("PREENCHENDO O VETOR");
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Atleta "+(i+1)+": ");
			vet[i] = scn.nextDouble();
			
			while(vet[i] <= 0) {
				System.out.println("Que altura é essa? Informe de novo: ");
				vet[i] = scn.nextDouble();
			}
		}
		scn.close();
		return vet;
	}
	
	public static double getMedia(double[] vet) {
		double soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		
		return soma/vet.length;
	}

}
