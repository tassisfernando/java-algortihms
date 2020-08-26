package calculadora;

import java.awt.RadialGradientPaint;
import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int escolha = 1;

		while (escolha != 0) {

			System.out.println("----MENU INICIAL----");
			System.out.println("1- Soma");
			System.out.println("2- Subtração");
			System.out.println("3- Multiplicação");
			System.out.println("4- Divisão");
			System.out.println("5- Radiciação");
			System.out.println("6- Potenciação");
			System.out.println("0- Sair");
			System.out.println("-------------------");

			escolha = scn.nextInt();

			switch (escolha) {
			case 1:
				soma();
				break;
			case 2:
				subtracao();
				break;
			case 3:
				produto();
				break;
			case 4:
				divisao();
				break;
			case 5:
				raiz();
				break;
			case 6:
				potencia();
				break;
			case 0:
				System.out.println("Saindo da calculadora... Digite qualquer tecla");
				scn.next();
				System.out.println("*DESLIGADA*");
				break;
			default:
				System.out.println("Opção inválida!\n");
				break;
			}
		}
	}

	public static void soma() {
		Scanner scn = new Scanner(System.in);

		System.out.println("\n-----OPERAÇÃO ESCOLHIDA: SOMA-----\n");
		System.out.println("Informe o primeiro número: ");
		float n1 = scn.nextFloat();
		System.out.println("Informe o segundo número: ");
		float n2 = scn.nextFloat();
		
		float res = n1 + n2;
		
		System.out.println("A soma entre "+n1+" e "+n2+" é "+res);
		System.out.println("-------------------------\n");
	}
	
	public static void subtracao() {
		Scanner scn = new Scanner(System.in);

		System.out.println("\n-----OPERAÇÃO ESCOLHIDA: SUBTRAÇÃO-----\n");
		System.out.println("Informe o primeiro número: ");
		float n1 = scn.nextFloat();
		System.out.println("Informe o segundo número: ");
		float n2 = scn.nextFloat();
		
		float res = n1 - n2;
		
		System.out.println("A diferença entre "+n1+" e "+n2+" é "+res);
		System.out.println("-------------------------\n");
	}
	
	public static void produto() {
		Scanner scn = new Scanner(System.in);

		System.out.println("\n-----OPERAÇÃO ESCOLHIDA: MULTIPLICAÇÃO-----\n");
		System.out.println("Informe o primeiro número: ");
		float n1 = scn.nextFloat();
		System.out.println("Informe o segundo número: ");
		float n2 = scn.nextFloat();
		
		float res = n1 * n2;
		
		System.out.println("O produto entre "+n1+" e "+n2+" é "+res);
		System.out.println("-------------------------\n");
	}
	
	public static void divisao() {
		Scanner scn = new Scanner(System.in);

		System.out.println("\n-----OPERAÇÃO ESCOLHIDA: DIVISÃO-----\n");
		System.out.println("Informe o primeiro número: ");
		float n1 = scn.nextFloat();
		System.out.println("Informe o número divisor: ");
		float n2 = scn.nextFloat();
		
		while(n2 == 0) {
			System.out.println("Informe outro número. Não é possível dividir por 0");
		}
		float res = n1 / n2;
		
		System.out.println("O produto entre "+n1+" e "+n2+" é "+res);
		System.out.println("-------------------------\n");
	}
	
	public static void raiz() {
		Scanner scn = new Scanner(System.in);

		System.out.println("\n-----OPERAÇÃO ESCOLHIDA: RADICIAÇÃO-----\n");
		System.out.println("Informe o número: ");
		double n1 = scn.nextDouble();
		
		while(n1 <= 0) {
			System.out.println("Número inválido! Informe outro: ");
			n1 = scn.nextDouble();
		}
		double res = Math.sqrt(n1);
		
		System.out.println("A raiz de "+n1+" é "+res);
		System.out.println("-------------------------\n");
	}
	
	public static void potencia() {
		Scanner scn = new Scanner(System.in);

		System.out.println("\n-----OPERAÇÃO ESCOLHIDA: EXPONENCIAÇÃO-----\n");
		System.out.println("Informe o número: ");
		double n1 = scn.nextDouble();
		
		System.out.println("Informe a potência: ");
		double n2 = scn.nextDouble();
		
		double res = Math.pow(n1, n2);
		
		System.out.println("A raiz de "+n1+" é "+res);
		System.out.println("-------------------------\n");
	}
}
