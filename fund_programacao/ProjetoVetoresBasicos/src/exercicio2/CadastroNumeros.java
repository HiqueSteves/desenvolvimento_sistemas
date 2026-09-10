package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] numeros = new double[5];
		
		for (int i = 0; i < numeros.length; i++ ) {
			System.out.println("Digite o numero da posição " + i + ": ");
			numeros[i] = input.nextDouble();
		}
		
		System.out.println("Números cadastrados: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
