package exercicio_loteria;

import java.util.Scanner;

public class Exercicio_Loteria {
	public static void main(String[] args) {
		int n, acertos = 0, acert6 = 0, acert5 = 0, acert4 = 0;
		int[][] apostas = new int[2][10];

		Scanner scn = new Scanner(System.in);
		int repetido;
		int j = 0;
		while (j < apostas.length) {
			System.out.println("\n-----Aposta "+(j+1)+"-----\n");
			System.out.println("Digite quantos números: ");
			n = scn.nextInt();
			while (n < 6 || n > 10) {
				System.out.println("INVÁLIDO! Digite quantos números: ");
				n = scn.nextInt();
			}

			for (int i = 0; i < n; i++) {
				repetido = 1;
				System.out.println("Informe o " + (i + 1) + " número: ");
				apostas[j][i] = scn.nextInt();
				while (apostas[j][i] > 60 || apostas[j][i] < 0) {
					System.out.println("INVÁLIDO! Informe o " + (i + 1) + " número:");
					apostas[j][i] = scn.nextInt();
				}

				while (repetido == 1 && i != 0) {
					for (int k = (i - 1); k >= 0; k--) {
						if (apostas[j][i] == apostas[j][k]) {
							repetido = 1;
							break;
						} else {
							repetido = 0;
						}
					}

					if (repetido == 1) {
						System.out.println("Informe o " + (i + 1) + " número: SEM REPETIR");
						apostas[j][i] = scn.nextInt();
					}
				}
			}

			System.out.println("---APOSTA REALIZADA---");
			j++;
			repetido = 1;
		}

		int[] res = new int[6];
		int p = 0;
		System.out.println("\n\n----RESULTADO DO SORTEIO----\n");
		for (int i = 1; i <= 6; i++) {
			res[p] = i;
			System.out.print(res[p] + "\t");
			p++;
		}

		for (int i = 0; i < apostas.length; i++) {
			for (int k = 0; k < apostas[i].length; k++) {
				for (int k2 = 0; k2 < res.length; k2++) {
					if (apostas[i][k] == res[k2]) {
						acertos++;
					}
				}
			}

			switch (acertos) {
			case 6:
				acert6++;
				break;
			case 5:
				acert5++;
				break;
			case 4:
				acert4++;
				break;
			}

			acertos = 0;
		}
		
		System.out.print("\n\n-----JOGADORES-----\n");
		for (int i = 0; i < apostas.length; i++) {
			System.out.println("\nApostador " + (i + 1));
			for (int k = 0; k < apostas[i].length; k++) {
				if (apostas[i][k] != 0)
					System.out.print(apostas[i][k] + "\t");
			}
		}
		System.out.println("\n\nQuantidade de ganhadores: \n");
		System.out.println("6 acertos - 5 acertos - 4 acertos");
		System.out.println(acert6 + "\t-\t" + acert5 + "\t-\t" + acert4);
		scn.close();
	}
}