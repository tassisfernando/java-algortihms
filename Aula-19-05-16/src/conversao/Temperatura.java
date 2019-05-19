package conversao;

import java.util.Scanner;

public class Temperatura {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		double tempC, tempF;
		
		System.out.println("Informe a temperatura em °C");
		tempC = scn.nextDouble();
		tempF = tempC*1.8 + 32;
		System.out.println("°F: "+tempF);
		scn.close();
	}	
}
