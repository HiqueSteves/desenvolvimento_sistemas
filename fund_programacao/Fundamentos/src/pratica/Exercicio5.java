package pratica;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Digite o número: ");
			numero = Integer.parseInt(leia.nextLine());
		} while (numero <= 0);
		
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i );
			
		}
		

	}

}
