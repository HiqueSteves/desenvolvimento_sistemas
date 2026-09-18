package horario;

public class Principal {

	public static void main(String[] args) {
		
		Horario horario1 = new Horario();
		
		horario1.hora = 0;
		horario1.minuto = 0;
		horario1.segundo = 0;
		
		horario1.exibirDados();
		System.out.println("\n");
		horario1.calcularSegundos();
		
		Horario horario2 = new Horario();
		
		horario2.hora = 8;
		horario2.minuto = 15;
		horario2.segundo = 30;
		
		horario2.exibirDados();
		System.out.println("\n");
		horario2.calcularSegundos();
		
		Horario horario3 = new Horario();
		
		horario3.hora = 14;
		horario3.minuto = 20;
		horario3.segundo = 5;
		
		horario3.exibirDados();
		System.out.println("\n");
		horario3.calcularSegundos();
	}

}
