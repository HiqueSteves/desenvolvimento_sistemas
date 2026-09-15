package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class LIstaConvidados {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> convidados = new ArrayList<>();
		String nomeConvidado;
		String continuar;
		int opcao;
		int posicao;
		
		do {
			System.out.println("1 - Adicionar convidado " + 
								"\n2 - Alterar convidado" +
								"\n3 - Remover convidado" +
								"\n4 - Procurar convidado" +
								"\n5 - Exibir convidados" + 
								"\n6 - Encerrar");
			opcao = Integer.parseInt(input.nextLine());
			
			switch (opcao) {
				case 1:
					System.out.println("\nNovo convidado: ");
					nomeConvidado = input.nextLine();
					convidados.add(nomeConvidado);
					System.out.println("\n");
					break;
					
				case 2:
					System.out.println("\nDigite a posição e o nome do convidado, respectivamente: ");
					nomeConvidado = input.nextLine();
					posicao = Integer.parseInt(input.nextLine());
					convidados.set(posicao, nomeConvidado);

					System.out.println("\n");
					break;
					
				case 3:
					System.out.println("\nRemover convidado: ");
					nomeConvidado = input.nextLine();
					convidados.contains(nomeConvidado);
					convidados.remove(nomeConvidado);
					break;
					
				case 4:
					System.out.println("\nProcurar convidado: ");
					nomeConvidado = input.nextLine();
					convidados.indexOf(nomeConvidado);
					System.out.println("\n");
					break;
					
				case 5:
					System.out.println("\nConvidados: ");
					
					for (String nome : convidados) {
						System.out.println(nome);
					}
					System.out.println("\n");
					break;
					
				case 6:
					System.out.println("Programa encerrado\n\n");
					break;
					
				default:
					System.out.println("Opção inválida");
					
			}
			
		} while (opcao != 6);
		
		
	}

}
