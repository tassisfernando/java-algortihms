package mirrored_number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mirrored_number {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.println("Enter an integer, please: ");
			int num = scn.nextInt();
			if(isMirrored(num)) {
				System.out.println("The number "+num+" is a mirrored number.");
			}else {
				System.out.println(num+" isn't a mirrored number.");
			}
		} catch (InputMismatchException ex) {
			System.out.println("Uncompatible type. Please, enter an integer.");
		}
		scn.close();
	}
	
	private static boolean isMirrored(int num) {
		String number = Integer.toString(num);
		
		String inverted = "";
		for (int i = (number.length()-1); i >=0; i--) {
			inverted += number.charAt(i);
		}
		
		if(number.equals(inverted)) {
			return true;
		} else {
			return false;
		}
		
	}

}
