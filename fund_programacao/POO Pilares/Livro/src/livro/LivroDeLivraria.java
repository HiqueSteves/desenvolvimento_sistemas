package livro;

public class LivroDeLivraria extends Livro {
	int preco, quantidadeEstoque;

	public LivroDeLivraria(String titulo, String autor, String editora, int numeroPag, int anoPubli,int preco, int quantidadeEstoque) {
		super(titulo, autor, editora, numeroPag, anoPubli);
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public LivroDeLivraria() {
		
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void dadosBibliograficos() {
		super.exibirDados();
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade disponivel em estoque: " + quantidadeEstoque);

	}
}
