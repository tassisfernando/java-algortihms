package exercicio_71;

public class Exercicio_71 {

	public static void main(String[] args) {
		double paisA = 5000000, paisB = 7000000;
		int anos = 0;
		
		while(paisA < paisB) {
			paisA = paisA*1.03;
			paisB = paisB*1.02;
			anos++;
		}
		System.out.println("Para a população do pais A se tornar maior que a do país B são necessários "+anos+" anos.");
	}

}
