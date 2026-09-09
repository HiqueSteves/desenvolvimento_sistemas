package pratica;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double salarioC = 3000;
		double salarioJ = 1000;
		int mes = 1;
		
		do {
			System.out.println("Mês " + mes);
			
			salarioC = salarioC + (salarioC * 0.02);
			salarioJ = salarioJ + (salarioJ * 0.05);
			
			System.out.println("Salário Carlos: " + String.format("%.2f", salarioC));
			
			System.out.println("Salário João: " + String.format("%.2f", salarioJ));
			
			System.out.println("\n");
			
			mes++;
			
		} while (salarioC > salarioJ);


	}

}