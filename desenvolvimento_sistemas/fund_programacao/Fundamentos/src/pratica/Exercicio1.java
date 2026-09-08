package pratica;

public class Exercicio1 {
	public static void main(String[] args) {
		String numero1 = "10";
		String numero2 = "5";
		String preco = "12.50";
		
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		
		double precoConvertido = Double.parseDouble(preco);
	
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		
		System.out.println(preco);
		System.out.println(precoConvertido + n2);
	
	}
}