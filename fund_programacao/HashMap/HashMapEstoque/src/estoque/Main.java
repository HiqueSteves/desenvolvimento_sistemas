package estoque;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put("Teclado", 10);
		estoque.put("Mouse", 15);
		estoque.put("Monitor", 6);
		estoque.put("Notebook", 4);
		
		System.out.println("\nLista de produtos: ");
		
		for (Map.Entry<String, Integer> e : estoque.entrySet()) {
			System.out.println(
					"Produto: " + e.getKey() + 
					" | Quantidade: " + e.getValue()
					);
		}
		
		System.out.println("Digite o produto: ");
		String produto = input.nextLine();
		
		if (estoque.containsKey(produto)) {
			System.out.println("Estoque atual: " + estoque.get(produto));
			
			System.out.println("Digite a nova quantidade: ");
			Integer novoEstoque = input.nextInt();
			
			estoque.put(produto, novoEstoque);
			
			System.out.println("Estoque alterado!");
			System.out.println("Novo estoque: " + estoque.get(produto));
		} else {
			System.out.println("Produto não encontrado.");
		}
		
		input.close();

	}

}
