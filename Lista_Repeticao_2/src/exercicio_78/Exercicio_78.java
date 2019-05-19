package exercicio_78;

import java.util.Scanner;

public class Exercicio_78 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int idade=1, sexo, qtdFem=0, totalMas=0, qtd=0, totalId = 0;
		double media;
		
		System.out.println("Informe a idade: ");
		idade = scn.nextInt();
		System.out.println("Informe o sexo");
		sexo = scn.nextInt();
		
		while(idade > 0) {
			qtd++;
			totalId += idade;
			if(sexo == 0) {
				totalMas++;
			} else if(idade >= 30 && idade <= 45) {
				qtdFem++;
			}
			
			System.out.println("Informe o sexo");
			sexo = scn.nextInt();
			System.out.println("Informe a idade: ");
			idade = scn.nextInt();
		}
		media = totalId / qtd;
		System.out.println("Média das idades: "+media);
		System.out.println("Pessoas do sexo feminino com idade entre 30 e 45: "+qtdFem);
		System.out.println("Total de pessoas do sexo masculino: "+totalMas);
		
		scn.close();
	}
}
