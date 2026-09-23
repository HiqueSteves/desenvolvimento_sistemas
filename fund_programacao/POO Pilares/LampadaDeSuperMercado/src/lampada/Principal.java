package lampada;

public class Principal {

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada();
		
		lampada1.setNome("Philips");
		lampada1.setValor(4.90); 
		lampada1.setQuantidade(12);
		
		lampada1.mostrarEstado();
		lampada1.ligar();
		
		System.out.println("\n");
		
		Lampada lampada2 = new Lampada();
		
		lampada2.setNome("Bulbo");
		lampada2.setValor(9.90);
		lampada2.setQuantidade(8);
		
		lampada2.mostrarEstado();
		lampada2.desligar();
		
		

	}

}
