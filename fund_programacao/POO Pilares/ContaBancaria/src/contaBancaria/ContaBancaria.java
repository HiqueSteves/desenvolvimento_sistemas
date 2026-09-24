package contaBancaria;

public class ContaBancaria {
	private String nomeCliente;
	private int numeroConta;
	private double saldo;

	public ContaBancaria() {
		super();
	}

	public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;

		if (saldo < 0) {

			System.out.println("Saldo inválido");
		} else {
			this.saldo = saldo;
		}
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			System.out.println("Saldo inválido");

		} else {
			this.saldo = saldo;
		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;

		} else {
			System.out.println("Valor inválido");
		}
	}

	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor deve ser maior que zero");
		} else if (valor > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo = saldo - valor;
		}
	}

	public void consultarSaldo() {
		System.out.println(saldo);
	}

	public void exibirDados() {
		System.out.println("Nome do cliente: " + nomeCliente);
		System.out.println("Número da conta: " + numeroConta);
		System.out.printf("Saldo: %.2f", saldo);
	}

}
