package exercicio_18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[][] alunos = new int[3][4];

		String mat = "", curso = "";
		System.out.println("Matrícula\tSexo\tCR");
		for (int i = 0; i < alunos.length; i++) {
			mat = "";
			curso = "";
			for (int j = 0; j < alunos[i].length; j++) {
				switch (j) {
				case 0:
					System.out.println("Matrícula: ");
					alunos[i][j] = scn.nextInt();
					mat = String.valueOf(alunos[i][j]);
					while (mat.length() != 10) {
						System.out.println("Matrícula inválida!");
						alunos[i][j] = scn.nextInt();
						mat = String.valueOf(alunos[i][j]);
					}
					break;
				case 1:
					System.out.println("Sexo: ");
					alunos[i][j] = scn.nextInt();
					break;
				case 2:
					System.out.println(mat.charAt(8));
					System.out.println(mat.charAt(9));
					curso = String.valueOf(mat.charAt(8));
					curso += String.valueOf(mat.charAt(9));
					alunos[i][j] = Integer.parseInt(curso);
					break;
				case 3:
					System.out.println("Coeficiente de Rendimento: ");
					alunos[i][j] = scn.nextInt();
					break;
				}
			}
		}

		escrever(alunos);
		
		System.out.println("Escolha um curso: ");
		int c = scn.nextInt();
		int maiorMat = 0, maiorCf = 0;
		
		for (int i = 0; i < alunos.length; i++) {
			for (int j = 0; j < alunos[i].length; j++) {
				switch (j) {	
				case 2:
					if(alunos[i][j] == c) {
						if(alunos[i][3] > maiorCf) {
							maiorCf = alunos[i][3];
							maiorMat = alunos[i][0];
						}
					}
					break;
				}
			}
		}
		
		if(maiorMat != 0)
			System.out.println("O aluno do curso "+c+" com maior CF foi o de mat. "+maiorMat+", com CF "+maiorCf);
		else
			System.out.println("Não há alunos deste curso.");
	}

	public static void escrever(int[][] m) {
		System.out.println("------------ALUNOS------------");
		System.out.println("Mat.\t\tSexo\tCurso\tCF");
		String str;
		for (int i = 0; i < m.length; i++) {
			str = "";
			for (int j = 0; j < m[i].length; j++) {
				str += m[i][j] + "\t";
			}
			System.out.println(str);
		}
	}

}
