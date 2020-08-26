package planilhas;

public class Planilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] plan = 
		{ 
				{ 200, 300, 120, 110, 0 },
				{ 200, 300, 120, 110, 0 },
				{ 200, 300, 120, 110, 0 },
				{ 200, 300, 120, 110, 0 }
		};

		int soma = 0;
		for (int i = 0; i < plan.length; i++) {
			for (int j = 0; j < plan[i].length - 1; j++) {
				plan[i][4] += plan[i][j];
			}
			soma += plan[i][4];
		}
		
		String str;
		for (int i = 0; i < plan.length; i++) {
			str = "";
			for (int j = 0; j < plan[i].length; j++) {
				if(j < plan[i].length - 1) 
					str += plan[i][j]+", ";
				else
					str += plan[i][j];
			}
			System.out.println(str);
		}
		
		System.out.println("Soma total = "+ soma);
	}
}
