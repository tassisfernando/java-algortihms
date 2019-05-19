package exercicio_80;

import java.util.Scanner;

public class Exercicio_80 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String nome, sexo, nmAlto = "", nmPesada = "";
		double peso, altura, mediaId = 0, maisAlto = 0, maisPesa = 0;
		int idade, totalId = 0, qtd = 0;

		System.out.println("Informe o nome do atleta ");
		nome = scn.next();
		System.out.println("Informe o sexo: (M ou F) ");
		sexo = scn.next().toUpperCase();
		System.out.println("Informe o peso: ");
		peso = scn.nextDouble();
		System.out.println("Informe a altura: ");
		altura = scn.nextDouble();
		System.out.println("Informe a idade: ");
		idade = scn.nextInt();

		while (!nome.equals("@")) {
			totalId += idade;
			qtd++;
			if (sexo.equals("M")) {
				if (altura > maisAlto) {
					maisAlto = altura;
					nmAlto = nome;
				}
			} else {
				if (peso > maisPesa) {
					maisPesa = peso;
					nmPesada = nome;
				}
			}

			System.out.println("Informe o nome do atleta ");
			nome = scn.next().toUpperCase();
			System.out.println("Informe o sexo: (M ou F) ");
			sexo = scn.next().toUpperCase();
			System.out.println("Informe o peso: ");
			peso = scn.nextDouble();
			System.out.println("Informe a altura: ");
			altura = scn.nextDouble();
			System.out.println("Informe a idade: ");
			idade = scn.nextInt();
		}
		if (qtd > 0) {
			mediaId = totalId / qtd;
		}

		if (!nmAlto.equals("") && !nmPesada.equals("")) {
			System.out.println("O atleta do sexo masculino mais alto é o " + nmAlto + ", que tem " + maisAlto + "m");
			System.out.println("A atleta do sexo feminino mais pesada é a " + nmPesada + ", que pesa " + maisPesa + "kg");
			System.out.println("A média geral da idade é " + mediaId + " anos.");
		} else {
			System.out.println("Não foram informados atletas.");
		}
		scn.close();

	}

}
