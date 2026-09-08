package pratica;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = Integer.parseInt(leia.nextLine());
		
		if (numero > 20) {
			
			System.out.println("Numero é maior que 20");
		} else if (numero == 20) {
			System.out.println("Número é o próprio 20");
		} else {
			System.out.println("Número é menor que 20");
		}

	}

}