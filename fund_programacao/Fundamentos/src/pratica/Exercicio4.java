package pratica;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		int base = Integer.parseInt(leia.nextLine());
		
		System.out.println("Digite o valor da altura: ");
		int altura = Integer.parseInt(leia.nextLine());
		
		System.out.println("Valor da base x altura: " + (base * altura) / 2);
		
		
	}

}