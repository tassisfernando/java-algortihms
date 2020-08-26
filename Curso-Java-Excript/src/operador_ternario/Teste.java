package operador_ternario;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int a = scn.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int b = scn.nextInt();
		
		String res = (a > b) ? "maior" : "menor"; //OPERADOR TERNÁRIO: FUNCIONA COMO UM IF
		
		System.out.println("O primeiro número é "+res+" que o segundo.");
	}

}
