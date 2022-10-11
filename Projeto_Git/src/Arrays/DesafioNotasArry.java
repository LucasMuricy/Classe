package Arrays;

import java.util.Scanner;

public class DesafioNotasArry {
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos Alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por Aluno?");
		int qtdeNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double [qtdeAlunos] [qtdeNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Imforme a nota %d do aluno %d: ", a +1, n +1);
				notasDaTurma [a] [n] = entrada.nextDouble();
				total += notasDaTurma [a] [n];
			}
		}

		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Media da Turma é : " + media );
		
		
		entrada.close();
	}
	
}
		
	
		
				
				
			
		
		
		
