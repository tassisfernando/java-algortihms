package criptografia;

import java.util.Scanner;

public class Criptografia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		String[] alfa = new String[26];
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int i = 0; i < alfa.length; i++) {
			alfa[i] = String.valueOf(alfabeto.charAt(i));
		}
		
		System.out.println("Informe a palavra: ");
		String palavra = scn.next();
		
		System.out.println("Você deseja? ");
		System.out.print("1- Criptografar \n2 -Descriptografar\n");
		int opcao = scn.nextInt();
		
		String digito, cript = "";
		if(opcao == 1) {
			for (int i = 0; i < palavra.length(); i++) {
				digito = String.valueOf(palavra.charAt(i)).toUpperCase();
				for (int j = 0; j < alfa.length; j++) {
					if(digito.equals(alfa[j])) {
						if(j+3 > alfa.length-1) {
							cript += alfa[0 + (alfa.length-1) - (j+3)];
						} else {
							cript += alfa[j+3];
						}
					}
				}
			}
		} else {
			for (int i = 0; i < palavra.length(); i++) {
				digito = String.valueOf(palavra.charAt(i)).toUpperCase();
				for (int j = 0; j < alfa.length; j++) {
					if(digito.equals(alfa[j])) {
						if(j-3 < 0) {
							cript += alfa[(alfa.length - 1) + (j-2)];
						} else {
							cript += alfa[j-3];
						}
					}
				}
			}
		}
		System.out.println("Nova palavra: "+cript);
	}

}
