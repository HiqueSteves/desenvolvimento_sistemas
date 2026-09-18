package consumo;

public class Eletrodomestico {
	String nome;
	double potenciaWatts, horasPorDia;

	public Eletrodomestico(String nome, double potenciaWatts, double horasPorDia) {
		this.nome = nome;
		this.potenciaWatts = potenciaWatts;
		this.horasPorDia = horasPorDia;
	}

	public Eletrodomestico() {
		super();
		this.nome = "";
		this.potenciaWatts = 0;
		this.horasPorDia = 0;
	}
	
	double consumoDiarioWh() {
		return potenciaWatts * horasPorDia;
	}

	double consumoMensalWh() {
		return consumoDiarioWh() * 30;
	}
	
	double consumoAnualWh() {
		return consumoMensalWh() * 12;
	}
	
	double gastoMensal(double precoKwh) {
		return (consumoMensalWh()) / 1000;
	}
	
	void exibirRelatorio(double precoKwh) {
		System.out.println("Nome: " + nome);
		System.out.println("Potência: " + potenciaWatts + "W");
		System.out.println("Uso diário: " + horasPorDia + " horas");
		consumoDiarioWh();
		consumoMensalWh();
		consumoAnualWh();
	}
	

}
