package exercicio_17;

public class Exercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] v = new int[50];
		
		v[0] = 1;
		v[1] = 1;
		
		for (int i = 2; i < v.length; i++) {
			v[i] = v[i-1] + v[i-2];
		}
		
		for (int i = 0; i < v.length; i++) {
			if(i != v.length-1)
				System.out.print(v[i]+", ");
			else
				System.out.println(v[i]);
		}
	}
}
