package exercicio_09;

public class Exercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = new int[10];
		int j = 0;
		for (int i = 1; i < 20; i++) {
			if(i % 2 != 0) {
				v[j] = i*i;
				j++;
			}
		}
		System.out.println("Quadrado dos números ímpares");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]+"\t");
		}
	}

}
