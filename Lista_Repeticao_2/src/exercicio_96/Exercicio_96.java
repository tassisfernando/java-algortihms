package exercicio_96;

import java.util.Scanner;

public class Exercicio_96 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num = 1, tipo, qtdGeral = 0, qtd12 = 0;
		double kwhConsumo, precoUsuario = 0, totalGeral = 0, total12 = 0, media12 = 0;

		while (num != 0) {
			System.out.println("Informe o número do consumidor: ");
			num = scn.nextInt();

			System.out.println("Informe o tipo de consumidor: \n1- Residencial \n2- Comercial \n3- Industrial");
			tipo = scn.nextInt();
			while (tipo < 1 || tipo > 3) {
				System.out.println("Tipo inválido!!");
				System.out.println("Informe o tipo de consumidor: \n1- Residencial \n2- Comercial \n3- Industrial");
				tipo = scn.nextInt();
			}

			System.out.println("Informe o consumo em kWh: ");
			kwhConsumo = scn.nextDouble();
			while (kwhConsumo < 0) {
				System.out.println("Consumo inválido! Não existe consumo negativo.");
				System.out.println("Informe o consumo em kWh: ");
				kwhConsumo = scn.nextDouble();
			}

			if (num != 0) {
				qtdGeral++;

				switch (tipo) {
				case 1:
					precoUsuario = kwhConsumo * 0.3;
					totalGeral += precoUsuario;
					total12 += precoUsuario;
					qtd12++;
					break;
				case 2:
					precoUsuario = kwhConsumo * 0.5;
					totalGeral += precoUsuario;
					total12 += precoUsuario;
					qtd12++;
					break;
				case 3:
					precoUsuario = kwhConsumo * 0.7;
					totalGeral += precoUsuario;
					break;
				}
				System.out.println("O custo para o consumidor " + num + " é de R$" + precoUsuario+"\n");
			}
		}
		
		if(qtd12 > 0)
			media12 = total12 / qtd12;
		System.out.println("*****Dados finais*****");
		System.out.println("O custo total nas 3 categorias foi de R$"+totalGeral+", referente a "+qtdGeral+" usuários");
		System.out.println("A média de custo entre as categorias 1 e 2 foi de R$"+media12+", referente a "+qtd12+" usuários");
		
		scn.close();
	}

}
