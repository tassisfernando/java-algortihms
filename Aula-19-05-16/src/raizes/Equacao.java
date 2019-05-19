package raizes;

import java.util.Scanner;

public class Equacao {
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		double a, b, c, d, x1, x2;
		
		System.out.println("a:");
		a = scn.nextDouble();
		while(a == 0) {
			System.out.println("Valor inválido. Informe a: ");
			a = scn.nextDouble();
		}
		System.out.println("b:");
		b = scn.nextDouble();
		System.out.println("c:");
		c = scn.nextDouble();
		
		System.out.println(a+"x²+ "+b+"x+ "+c+" = 0");
		
		d = Math.pow(b, 2) - 4*a*c;
		
		if(d > 0) {
			x1 = (-b + Math.sqrt(d))/ (2*a); 
			x2 = (-b - Math.sqrt(d))/ (2*a); 
			System.out.println("Duas raízes: x' = "+x1+" e x''= "+x2);
		} else if(d == 0) {
			x1 = (-b + Math.sqrt(d))/ (2*a); 
			System.out.println("Raiz única: x = "+ x1);
		} else {
			System.out.println("Não existe raiz real, pois o delta é negativo.");
		}	
		scn.close();
	}
}
