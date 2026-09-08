package pratica;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int conta;
		
		System.out.println("Digite o valor do primeiro numero: ");
		int n1 = Integer.parseInt(leia.nextLine());
		
		System.out.println("Digite o valor do segundo numero: ");
		int n2 = Integer.parseInt(leia.nextLine());
		
		do {
			System.out.println("Selecione qual calculo você quer fazer: " + "\n" + 
		"1 - Calcular a média dos números" + "\n" + 
		"2 - Subtrair o menor número do maior" + "\n" + 
		"3 - Multiplicar os números" + "\n" + 
		"4 - Dividir o primeiro número pelo segundo");
			conta = Integer.parseInt(leia.nextLine());
		} while (conta <= 0 || conta >= 5);
		
		switch (conta) {
		case 1:
			 System.out.println("A média dos 2 números é " + (n1 + n2) / 2 );
			 break;
		
		case 2:
			if (n1 < n2) {
				System.out.println("Valor da subtração: " + (n2-n1));
			} else {
				System.out.println("Valor da subtração: " + (n1-n2));
			}
			break;
			
		case 3:
			System.out.println("Valor da multiplicação: " + n1*n2);
			break;
			
		case 4:
			System.out.println("Valor da divisão: " + n1/n2);
			break;
		}
		
	}

}
