package exercicio_18;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		System.out.println("Informe o ângulo em graus: ");
		double x = scn.nextDouble();

		double sen = getSen(x);
				
		System.out.println("Sen("+x+") = "+sen);
		
		scn.close();

	}

	public static double getSen(double x) {
		double sen = 0;

		double[] v = new double[15];
		int j = 1;
		for (int i = 0; i < v.length; i++) {
			if(i == 0) {
				v[i] = x;
			}
			else {
				if(i % 2 == 0)
					v[i] = Math.pow(x, j) / getFat(j);
				else
					v[i] = -1*Math.pow(x, j) / getFat(j);
			}
				
			j += 2;
		}
		
		for (int i = 0; i < v.length; i++) {
			sen += v[i];
		}

		return sen;
	}

	public static int getFat(int j) {
		int fat = 1;
		for (int i = 1; i <= j; i++) {
			fat = fat * i;
		}
		return fat;
	}

}
