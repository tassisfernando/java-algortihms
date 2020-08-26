package exericicio_conversao;

import java.util.Scanner;

public class Exercicio_Conversao {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Informe a base do primeiro número: ");
		int b1 = scn.nextInt();
		while (b1 < 2 || b1 > 10) {
			System.out.println("Valor inválido. Insira um número entre 2 e 10.");
			b1 = scn.nextInt();
		}

		System.out.println("Informe o número inteiro: ");
		int n1 = scn.nextInt();
		while (n1 <= 0) {
			System.out.println("Número inválido. Informe um positivo: ");
			n1 = scn.nextInt();
		}

		// verificando se o número possui algum algarismo ou igual a base
		String num;
		int n = 1;
		while (n == 1) {
			num = Integer.toString(n1);
			for (int i = 0; i < num.length(); i++) {
				n = Character.getNumericValue(num.charAt(i));
				if (n >= b1) {
					n = 1;
					break;
				} else {
					n = 0;
				}
			}
			if (n == 1) {
				System.out.println("O número deve conter algarismos menores que a base! Informe outro número: ");
				n1 = scn.nextInt();
				while (n1 <= 0) {
					System.out.println("Número inválido. Informe um positivo: ");
					n1 = scn.nextInt();
				}
			}
		}

		System.out.println("Informe a base a qual será convertida:");
		int b2 = scn.nextInt();
		while ((b2 < 2 || b2 > 10) && b2 != b1) {
			System.out.println("Valor inválido. Insira um número entre 2 e 10.");
			b2 = scn.nextInt();
		}

		int div, mod;
		String result = "", aux1 = "", base10 = "";
		num = String.valueOf(n1);
		if (b1 == 10) {
			n = n1;
			div = n / b2;
			// convertendo da base 10 para a base n
			
			// se a primeira divisão já for menor que a base (resto menor que a base também)
			if (div < b2) {
				mod = n % b2;
				result += String.valueOf(mod);
				// Pegando o último div
				if (div < b2) {
					result += String.valueOf(div);
				}
			}
			while (div >= b2) {
				div = n / b2;
				mod = n % b2;
				result += String.valueOf(mod);

				// Pegando o último div
				if (div < b2) {
					result += String.valueOf(div);
				}
				n = div;
			}
			
			aux1 = "";
			// invertendo o número
			for (int i = result.length() - 1; i >= 0; i--) {
				aux1 += result.charAt(i);
			}

			System.out.println(n1 + " na base " + b1 + " é igual a " + aux1 + " na base " + b2);
		} else {
			if (b2 != 10) {
				// invertendo o numero
				for (int i = num.length() - 1; i >= 0; i--) {
					aux1 += num.charAt(i);
				}

				int exp, pos, n2 = 0;

				// Convertendo para a base 10
				for (int i = 0; i < aux1.length(); i++) {
					// base elevada a posição
					exp = (int) Math.pow(b1, i);

					// valor na posição
					pos = Character.getNumericValue(aux1.charAt(i));

					// multiplicação entre os valores anteriores
					base10 = String.valueOf(pos * exp);
					n2 += Integer.parseInt(base10);
				}

				// convertendo da base 10 para a base n
				div = n2 / b2;

				// se a primeira divisão já for menor que a base (resto menor que a base também)
				if (div < b2) {
					mod = n2 % b2;
					result += String.valueOf(mod);
					// Pegando o último div
					if (div < b2) {
						result += String.valueOf(div);
					}
				}
				while (div >= b2) {
					div = n2 / b2;
					mod = n2 % b2;
					result += String.valueOf(mod);
					// Pegando o último div
					if (div < b2) {
						result += String.valueOf(div);
					}
					n2 = div;
				}
				
				aux1 = "";
				// invertendo o número
				for (int i = result.length() - 1; i >= 0; i--) {
					aux1 += result.charAt(i);
				}

				System.out.println(n1 + " na base " + b1 + " é igual a " + aux1 + " na base " + b2);
			} else {
				// invertendo o numero
				for (int i = num.length() - 1; i >= 0; i--) {
					aux1 += num.charAt(i);
				}
				
				int exp, n2 = 0, pos;
				// Convertendo para a base 10
				for (int i = 0; i < aux1.length(); i++) {
					// base elevada a posição
					exp = (int) Math.pow(b1, i);

					// valor na posição
					pos = Character.getNumericValue(aux1.charAt(i));

					// multiplicação entre os valores anteriores
					base10 = String.valueOf(pos * exp);
					n2 += Integer.parseInt(base10);
				}
				System.out.println(n1 + " na base " + b1 + " é igual a " + n2 + " na base " + b2);
			}
		}
	}
}