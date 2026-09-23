package livro;

public class Livro {
	String titulo, autor, editora;
	int numeroPag, anoPubli;

	public Livro() {
		super();
	}

	public Livro(String titulo, String autor, String editora, int numeroPag, int anoPubli) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numeroPag = numeroPag;
		this.anoPubli = anoPubli;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getNumeroPag() {
		return numeroPag;
	}

	public void setNumeroPag(int numeroPag) {
		this.numeroPag = numeroPag;
	}

	public int getAnoPubli() {
		return anoPubli;
	}

	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}
	
	public void exibirDados() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Editora: " + editora);
		System.out.println("Número de páginas: " + numeroPag);
		System.out.println("Ano publicação: " + anoPubli);
	}

}
