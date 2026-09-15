package aula02;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			ArrayList<String> nomes = new ArrayList<>();
			String nome;
			String continuar;
			
			do {
				System.out.println("Digite um nome: ");
				nome = input.nextLine();
				
				nomes.add(nome);
				
				System.out.println("Deseja adicionar outro nome? (S/N): ");
				continuar = input.nextLine();
				
			} while (continuar.equalsIgnoreCase("s"));
			
			System.out.println("\nNomes cadastrados: ");
			
			for (String nomeCadastrado : nomes) {
				System.out.println(nomeCadastrado);
			}
			
			input.close();
	}

}
