package exercicio5;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] numeros = new double[4];
		int par = 0;
		int impar = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			numeros[i] = Double.parseDouble(input.nextLine());
		}
		

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {

				System.out.println("Número " + numeros[i] + ": par");
				par++;
			} else {
				System.out.println("Número " + numeros[i] + ": impar");
				impar++;
			}
		}

		System.out.println("\nQuantidade de pares: " + par);
		System.out.println("Quantidade de impares: " + impar);

	}

}
