package lampada;

public class Lampada {
	private String nome;
	private double valor;
	private int quantidade;
	boolean ligada;

	public Lampada(String nome, double valor, int quantidade, boolean ligada) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.ligada = ligada;
	}

	public Lampada() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void ligar() {
		ligada = true;
		System.out.println("ligada");
	}

	public void desligar() {
		ligada = false;
		System.out.println("desligada");
	}

	public void mostrarEstado() {
		System.out.println("Modelo: " + nome);
		System.out.println("Valor: " + valor);
		System.out.println("Quantidade: " + quantidade);
		System.out.print("Ela está ");
	}

}
