package prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("----Questão 02----\n");
		Ficha[] fichas = new Ficha[2];
		fichas = cadastrar(fichas);

		listar(fichas);

		int escolha = 1;

		while (escolha != 0) {
			System.out.println("\n----Escolha uma questão----\n");
			System.out.println("3- Funcionárias com maior salário");
			System.out.println("4- Aumento de salários");
			System.out.println("0- Sair");

			escolha = scn.nextInt();

			switch (escolha) {
			case 3:
				System.out.println("\n---Quantos funcionárias recebem o maior salário??---\n");
				double maiorSal = getMaiorSalario(fichas);

				int qtdMaior = getQtdFemMaiorSal(fichas, maiorSal);

				if (qtdMaior > 0)
					System.out.println(qtdMaior + " funcionária(s) recebe(m) o maior salário (R$" + maiorSal + ").");
				else
					System.out.println("Nenhuma funcionária recebe o maior salário (R$" + maiorSal + ").");
				break;
				
			case 4:
				System.out.println("\n---Realizar aumento por sexo---\n");
				System.out.println("Escolha o sexo dos funcionários que irão receber o aumento: (M ou F)");
				char sexo = scn.next().toUpperCase().charAt(0);

				while (sexo != 'M' && sexo != 'F') {
					System.out.println("Sexo inválido. Informe 'M' para masculino e 'F' para feminino: ");
					sexo = scn.next().toUpperCase().charAt(0);
				}

				System.out.println("Informe o percentual de aumento (em %): ");
				double aumento = scn.nextDouble();

				while (aumento <= 0) {
					System.out.println("O aumento não pode ser menor ou igual a 0: ");
					aumento = scn.nextDouble();
				}

				realizarAumentoSexo((aumento / 100), sexo, fichas);
				break;

			case 0: 
				System.out.println("Saindo do programa...");
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
			}

		}
	}

	public static void realizarAumentoSexo(double aumento, char sexo, Ficha[] fichas) {
		double novoSalario;
		int qtdAumento = 0;
		if (fichas != null) {
			for (int i = 0; i < fichas.length; i++) {
				if (fichas[i].sexo == sexo) {
					qtdAumento++;
					novoSalario = fichas[i].salario + (fichas[i].salario * aumento);
					System.out.println("--Aumento realizado--");
					System.out.println("Nome: " + fichas[i].nome + " - Salário anterior: " + fichas[i].salario
							+ " - Novo salário: " + novoSalario);
					fichas[i].salario = novoSalario;
				}
			}
		}
		
		if(qtdAumento == 0)
			System.out.println("Nenhum funcionário do sexo informado está cadastrado.");

	}

	public static int getQtdFemMaiorSal(Ficha[] fichas, double maiorSal) {
		int qtd = 0;

		if (fichas != null) {

			for (int i = 0; i < fichas.length; i++) {
				if (fichas[i].salario == maiorSal && fichas[i].sexo == 'F')
					qtd++;
			}
		}

		return qtd;
	}

	public static double getMaiorSalario(Ficha[] fichas) {
		double maiorSal = 0;
		if (fichas != null) {
			maiorSal = fichas[0].salario;

			for (int i = 1; i < fichas.length; i++) {
				if (fichas[i].salario > maiorSal)
					maiorSal = fichas[i].salario;
			}
		}

		return maiorSal;
	}

	public static Ficha[] cadastrar(Ficha[] fichas) {
		Scanner scn = new Scanner(System.in);

		if (fichas != null) {
			System.out.println("----Cadastro de funcionários----\n");
			for (int i = 0; i < fichas.length; i++) {
				fichas[i] = new Ficha();

				System.out.println("Nome do funcionário " + (i + 1) + ": ");
				fichas[i].nome = scn.next();

				System.out.println("CPF do funcionário " + (i + 1) + ": ");
				fichas[i].cpf = scn.next();

				while (fichas[i].cpf.length() != 14) {
					System.out.println("O CPF deve ter o formato '000.000.000-00': ");
					fichas[i].cpf = scn.next();
				}

				System.out.println("Idade do funcionário " + (i + 1) + ": ");
				fichas[i].idade = scn.nextInt();

				while (fichas[i].idade <= 0) {
					System.out.println("Idade inválida. Informe uma idade real: ");
					fichas[i].idade = scn.nextInt();
				}

				System.out.println("Sexo do funcionário " + (i + 1) + ": (M ou F)");
				fichas[i].sexo = scn.next().toUpperCase().charAt(0);

				while (fichas[i].sexo != 'M' && fichas[i].sexo != 'F') {
					System.out.println("Sexo inválido. Informe 'M' para masculino e 'F' para feminino: ");
					fichas[i].sexo = scn.next().toUpperCase().charAt(0);
				}

				System.out.println("Salário do funcionário " + (i + 1) + ": ");
				fichas[i].salario = scn.nextDouble();

				while (fichas[i].salario <= 0) {
					System.out.println("Informe um salário real!");
					fichas[i].salario = scn.nextDouble();
				}

				System.out.println("\n----Funcionário " + (i + 1) + " cadastrado com sucesso!----\n");
			}
		}

		return fichas;

	}

	public static void listar(Ficha[] fichas) {
		if (fichas != null) {
			System.out.println("----Listando os funcionários----\n");

			System.out.println("| Nome  -  Salário  -  CPF  -  Idade  -  Sexo |");
			System.out.println("-----------------------------------------------");

			for (int j = 0; j < fichas.length; j++) {
				System.out.println(fichas[j].toString());
			}
		}

	}
}
