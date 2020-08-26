package exercicio_16;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Planta[] plantas = new Planta[2];

		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < plantas.length; i++) {
			plantas[i] = new Planta();

			System.out.println("Nome: ");
			plantas[i].nome = scn.next();

			System.out.println("Quantidade ideal: ");
			plantas[i].qtdIdeal = scn.nextInt();

			System.out.println("Quantidade em estoque: ");
			plantas[i].qtdEstoque = scn.nextInt();
		}

		System.out.println("----Flores----");
		System.out.println("Nome\tEstoque\tIdeal");
		escrever(plantas);

		System.out.println("\nPlanta QtdNecessária");
		for (Planta planta : plantas) {
			if (planta.getNecessario() > 0)
				System.out.println(planta.nome + "\t" + planta.getNecessario());
		}

	}

	public static void escrever(Planta[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i].nome + "\t" + m[i].qtdEstoque + "\t" + m[i].qtdIdeal+"\n");
		}
	}
}
