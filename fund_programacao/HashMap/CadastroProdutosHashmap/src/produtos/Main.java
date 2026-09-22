package produtos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		HashMap<Integer, Produto> produtos = new HashMap<>();

		produtos.put(1, new Produto("Teclado", 120.00, 10));
		produtos.put(2, new Produto("Monitor", 690.00, 5));
		produtos.put(3, new Produto("Mouse", 90.00, 12));
		produtos.put(4, new Produto("Headset", 220.00, 20));

		System.out.println("\nLista de produtos: ");

		for (Map.Entry<Integer, Produto> p : produtos.entrySet()) {
			System.out.println("Produto: " + p.getValue().getNome() 
					+ " | Preço: " + p.getValue().getPreco()
					+ " | Quantidade: " + p.getValue().getQuantidade());
		} 

			System.out.println("Digite o codigo do produto: ");
			int produto = input.nextInt();

			if (produtos.containsKey(produto)) {
				Produto produtoEncontrado = produtos.get(produto);

				System.out.println("\nProduto encontrado: ");
				System.out.println("Nome: " + produtoEncontrado.getNome());
				System.out.println("Preço: " + produtoEncontrado.getPreco());
				System.out.println("Quantidade: " + produtoEncontrado.getQuantidade());
			} else {
				System.out.println("Produto não encontrado!");
			}


	}

}
