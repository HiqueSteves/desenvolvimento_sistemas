package consumo;

public class Principal {

	public static void main(String[] args) {
		
		Eletrodomestico eletro1 = new Eletrodomestico();
		
		eletro1.nome = "Ventilador";
		eletro1.potenciaWatts = 100;
		eletro1.horasPorDia = 8;
		
		eletro1.exibirRelatorio(.9);

	}

}
