package Arrays;

import java.util.Scanner;

public class DesafioArry {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("quantas Notas: ");
		int qtdeNotas = entrada.nextInt();
		
		double [] nota = new double [qtdeNotas];
		
		for(int i = 0; i < nota.length; i++) {
			System.out.print("Imforme a Nota: " +( i + 1) + ": ");
			nota[i] = entrada.nextDouble();
		}

		double total = 0;
		for(double notas : nota) {
			total += notas;
		}

		double media = total / nota.length;
		System.out.println("A Media é: " + media + "!");
		
			
		 
		entrada.close();	
		
		
	}

}
