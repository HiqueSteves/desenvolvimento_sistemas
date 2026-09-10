package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] temperaturas = new double[7];
		double maior;
		double menor;

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª temperatura: ");
			temperaturas[i] = input.nextDouble();
		}

		maior = temperaturas[0];
		menor = temperaturas[0];

		System.out.println("Temperaturas cadastradas: ");

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
		}

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] > maior) {
				maior = temperaturas[i];
			}

			if (temperaturas[i] < menor) {
				menor = temperaturas[i];
			}
		}
		
		System.out.println("\nMaior temperatura: " + maior);
		System.out.println("Menor temperatura: " + menor);
	}

}
