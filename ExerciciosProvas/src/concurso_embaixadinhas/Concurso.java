package concurso_embaixadinhas;

import java.util.Scanner;

public class Concurso {

	public static void main(String[] args) {

		int[] as = new int[6];
		Scanner scn = new Scanner(System.in);
		
		int total = 0;
		for (int i = 0; i < as.length; i++) {
			System.out.println("Num de embaixadas do aluno "+(i+1)+":");
			as[i] = scn.nextInt();
			total += as[i];
		}
		
		for (int i = 0; i < as.length; i++) {
			System.out.println("Aluno "+(i+1)+": "+as[i]);
		}
		
		double media = total / as.length;
		System.out.println("Média de embaixadinhas: "+media);
		
		int acima = 0;
		for (int i = 0; i < as.length; i++) {
			if(as[i] > media)
				acima++;
		}
		
		System.out.println("Ao todo, "+acima+" alunos ficaram acima da média.");
		
		int somaCinco = 0, aux;
		for(int i = (as.length-1); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(as[j] > as[j+1]) {
					aux = as[j];
					as[j] = as[j+1];
					as[j+1] = aux;
				}
			}
		}
		
		System.out.println("ORDENADO:");
		for (int i = 0; i < as.length; i++) {
			System.out.println("Aluno "+(i+1)+": "+as[i]);
		}
		
		int i = as.length-2, j=1;
		while(j <= 5) {
			somaCinco += as[i];
			i--;
			j++;
		}
		
		if(as[as.length-1] > somaCinco) {
			System.out.println("O primeiro colocado fez mais que a soma dos outros 5 primeiros.");
		} else {
			System.out.println("O primeiro colocado não fez mais que a soma dos outros 5 primeiros.");
		}
	}
}
