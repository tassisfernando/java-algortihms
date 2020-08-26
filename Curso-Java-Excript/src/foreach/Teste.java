package foreach;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();

		lista.add(5);
		lista.add(4);

		// Usando o foreach ( <variavel> : <array> )
		for (int item : lista) {
			System.out.print(item + "\t");
		}

		String[] array = new String[3];
		array[0] = "Ok";
		array[1] = "Não Ok";
		array[2] = "Não sei";

		for (String palavra : array) {
			System.out.println("\n"+palavra);
		}
	}

}
