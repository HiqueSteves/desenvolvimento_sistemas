package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> tarefas = new ArrayList<>();
		String tarefa;
		String continuar;
		
		
		do {
			System.out.println("Digite uma tarefa: ");
			tarefa = input.nextLine();
			
			tarefas.add(tarefa);
			
			System.out.println("Deseja cadastrar outra tarefa? (S/N): ");
			continuar = input.nextLine();
			
		} while (continuar.equalsIgnoreCase("s"));
		
		System.out.println("\nTarefas cadastradas: ");
		
		for (String nomeCadastrado : tarefas) {
			System.out.println(nomeCadastrado);
		}
		
		input.close();

	}

}
