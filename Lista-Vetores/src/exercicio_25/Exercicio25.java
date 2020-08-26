package exercicio_25;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] notas = new int[11];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println((i+1)+"° nota: ");
			notas[i] = scn.nextInt();
			
			while(notas[i] < 0 || notas[i] > 10) {
				System.out.println("Valor inválido! Informe outra nota: ");
				notas[i] = scn.nextInt();
			}
		}
		
		int[] freqAb = new int[11];
		
		for (int i = 0; i < freqAb.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				if(notas[j] == i) {
					freqAb[i]++;
				}
			}
		}
		
		System.out.println("Nota\tFreq. Abso.\tFreq. Rel.");
		float freqRel;
		for (int i = 0; i < freqAb.length; i++) {
			freqRel = (float) (freqAb[i]/notas.length);
			System.out.println(i+"\t\t"+freqAb[i]+"\t\t"+freqRel);
		}

	}

}
