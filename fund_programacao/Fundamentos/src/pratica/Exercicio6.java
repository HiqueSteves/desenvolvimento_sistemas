package pratica;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int dia;
		
		do {
			System.out.println("Digite o dia: ");
			dia = Integer.parseInt(leia.nextLine());
		} while (dia <= 0 || dia >= 8 );
			
		
		switch (dia) {
			case 1:
				 System.out.println("Domingo");
				 break;
			
			case 2:
				System.out.println("Segunda-feira");
				break;
				
			case 3:
				System.out.println("Terça-feira");
				break;
				
			case 4:
				System.out.println("Quarta-feira");
				break;
				
			case 5:
				System.out.println("Quinta-feira");
				break;
				
			case 6:
				System.out.println("Sexta-feira");
				break;
				
			case 7:
				System.out.println("Sabado");
				break;
				 
		}
	}

}
