package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] notas = new double[5];
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			notas[i] = input.nextDouble();
			
			soma += notas[i];
		}
		
		System.out.println("Notas cadastradas: ");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		double media = soma / notas.length;
		
		System.out.printf("\nMédia: %.2f%n", media);

	}

}
