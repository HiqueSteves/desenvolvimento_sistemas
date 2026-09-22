package capitais;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná", "Curitiba");
		
		System.out.println("Digite o nome do estado: ");
		String estados = input.nextLine();
		
		if(capitais.containsKey(estados)) {
			String capital = capitais.get(estados);
			System.out.println("Capital encontrada: " + capital);
		} else {
			System.out.println("Capital não encontrada");
		}

	}

}
