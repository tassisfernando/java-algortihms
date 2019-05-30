package exercicio_80;

import java.util.Scanner;

public class Exercicio_80 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String nome = "", sexo, nmAlto = "", nmPesada = "";
		double peso, altura, mediaId = 0, maisAlto = 0, maisPesa = 0;
		int idade, totalId = 0, qtd = 0;

		while (!nome.equals("@")) {
			System.out.println("Informe o nome do atleta ");
			nome = scn.nextLine();
			while (nome.length() < 2 && !nome.equals("@")) {
				System.out.println("Informe um nome com pelo menos 2 letras.");
				nome = scn.nextLine();
			}

			System.out.println("Informe o sexo: (M ou F) ");
			sexo = scn.next().toUpperCase();
			while (!sexo.equals("M") && !sexo.equals("F")) {
				System.out.println("O sexo só pode ser M ou F: ");
				sexo = scn.next().toUpperCase();
			}

			System.out.println("Informe o peso: ");
			peso = scn.nextDouble();
			while (peso <= 0) {
				System.out.println("Peso inválido! Informe o peso:");
				peso = scn.nextDouble();
			}

			System.out.println("Informe a altura: ");
			altura = scn.nextDouble();
			while (altura <= 0) {
				System.out.println("Altura inválida! Informe a altura: ");
				altura = scn.nextDouble();
			}

			System.out.println("Informe a idade: ");
			idade = scn.nextInt();
			while (idade <= 0 || idade > 100) {
				System.out.println("Idade inválida! Informe a idade: ");
				idade = scn.nextInt();
			}
			scn.nextLine();
			if (!nome.equals("@")) {
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
			}
		}
		System.out.println("\n******FIM DA LEITURA DE ATLETAS******");
		if (qtd > 0) {
			mediaId = (double) totalId / qtd;

			if (maisAlto != 0)
				System.out
						.println("O atleta do sexo masculino mais alto é o " + nmAlto + ", que tem " + maisAlto + "m");
			else
				System.out.println("Não há atletas do sexo masculino.");
			if (maisPesa != 0)
				System.out.println(
						"A atleta do sexo feminino mais pesada é a " + nmPesada + ", que pesa " + maisPesa + "kg");
			else
				System.out.println("Não há atletas do sexo feminino.");
			System.out.println("A média geral da idade é " + mediaId + " anos.");
		} else {
			System.out.println("Não foram informados atletas.");
		}
		scn.close();
	}
}
