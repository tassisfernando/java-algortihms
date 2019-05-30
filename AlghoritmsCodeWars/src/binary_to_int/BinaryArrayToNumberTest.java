package binary_to_int;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryArrayToNumberTest {

	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a binary number");
		String bin = scn.next();
		
		List<Integer> binary = new ArrayList<Integer>();
		
		for (int i = 0; i < bin.length(); i++) {
			binary.add(Character.getNumericValue(bin.charAt(i)));
		}
		
		
		int num = BinaryArrayToNumber.ConvertBinaryArrayToInt(binary);
		
		System.out.println(num);
		scn.close();
	}
	
}
