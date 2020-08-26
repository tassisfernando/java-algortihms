package printf;

public class Teste {

	public static void main(String[] args) {

		/*
		 * System.out.printf(); => para imprimir formatado print = imprimir e f = format
		 */

		// Formatando inteiros
		System.out.printf("%-12s%-12s%s\n", "Coluna 1", "Coluna 2", "Coluna 3");
		System.out.printf("%-12d%-12d%07d\n", 15, 12, 5);

		int[] array;// declaração do nosso array
		array = new int[10]; // cria e reserva o espaço para o nosso array

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		System.out.printf("%s%10s\n", " _______", " ________ ");
		System.out.printf("%s%10s\n", "|Indice ", "| Valores|");
		System.out.printf("%s%10s\n", "|---", "||");
		for (int i = 0; i <= 9; i++) {
			System.out.printf("|%5d%3s%7d |\n", i, " |", array[i]);
		}
		System.out.printf("%s%10s\n", "|---", "||");
	}
}
