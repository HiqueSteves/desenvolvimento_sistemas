package contaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Matheus", 101, 190.90);
		ContaBancaria conta2 = new ContaBancaria("Hugo", 102, 260.40);
		
		conta1.depositar(1000);
		conta1.sacar(150);
		conta1.exibirDados();
		
		System.out.println("\n");
		
	
		conta2.depositar(100);
		conta2.exibirDados();
		
	
	}

}
