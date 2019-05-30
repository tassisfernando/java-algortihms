package binary_to_int;

import java.util.List;

public class BinaryArrayToNumber {
	
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		int num = 0;
		int ret = 0;
		int j = 0;
		for (int i = binary.size()-1; i >= 0; i--) {
			num = binary.get(j).intValue();
			ret += num*Math.pow(2, i);
			j++;
		}
		return ret;
	}
}
