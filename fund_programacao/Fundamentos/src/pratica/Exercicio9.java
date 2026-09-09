package pratica;

import java.net.Socket;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valor;
		
		do {
			System.out.println("Digite o valor do número: ");
			 valor = Integer.parseInt(leia.nextLine());
			 double resultado = Math.sqrt(valor);
			
			System.out.println("Valor digitado: " + valor + "\n" + 
			"O quadrado do número: " + valor * valor +"\n" + 
			"O cubo do número: " + valor * valor * valor + "\n" +
			"A raiz quadrada do número: " + resultado + "\n" + "\n" );	
			
		} while (valor > 0);
		
	}

}
