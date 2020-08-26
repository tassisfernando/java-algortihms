package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Ficha[] fichas = new Ficha[2];

		fichas = cadastrar(fichas);

		listar(fichas);

	}

	public static Ficha[] cadastrar(Ficha[] fichas) {
		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < fichas.length; i++) {
			fichas[i] = new Ficha();

			System.out.println("Nome do usuário da " + (i + 1) + "° ficha: ");
			fichas[i].nome = scn.next();

			System.out.println("CPF do usuário da " + (i + 1) + "° ficha: ");
			fichas[i].cpf = scn.next();

			System.out.println("Idade do usuário da " + (i + 1) + "° ficha: ");
			fichas[i].idade = scn.nextInt();

			System.out.println("Salário do usuário da " + (i + 1) + "° ficha: ");
			fichas[i].salario = scn.nextDouble();

			System.out.println("Sexo do usuário da " + (i + 1) + "° ficha: (M ou F)");
			fichas[i].sexo = scn.next().charAt(0);

			System.out.println("----" + (i + 1) + "° ficha cadastrada----\n\n");
		}

		return fichas;
	}

	public static void listar(Ficha[] fichas) {
		System.out.println("----Listando as fichas----\n");

		System.out.println("| Nome  -  Salário  -  CPF  -  Idade  -  Sexo |");
		System.out.println("-----------------------------------------------");
		
		for (int j = 0; j < fichas.length; j++) {
			System.out.println("  "+fichas[j].nome + "  -  " + fichas[j].salario + "  -  " + fichas[j].cpf + "  -  "
					+ fichas[j].idade + "  -  " + fichas[j].sexo);
		}
	}
}
