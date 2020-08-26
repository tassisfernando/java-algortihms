package funcao_matricial;

public class Funcao {

	public static void main(String[] args) {

		int[][] valores = new int[10][10];
		String str;

		for (int x = 0; x < valores.length; x++) {
			str = "";
			for (int y = 0; y < valores[x].length; y++) {
				valores[x][y] = (3 * (x + 1) + (y * y));
				
				//Verificando se é a última coluna
				if(y < 9)
					str += valores[x][y]+", ";
				else
					str += valores[x][y];
			}
			System.out.println(str);
		}
	}

}
