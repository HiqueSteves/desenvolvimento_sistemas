package horario;

public class Horario {
	int hora;
	int minuto;
	int segundo;

	public Horario(int hora, int minuto, int segundo) {
		if (
				(hora >= 0 && hora <= 23)&&
				(minuto >= 0 && minuto <= 59) &&
				(segundo >= 0 && segundo <= 59)
				) {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;	
		} else {
			System.out.println("Hora inválida");
		}
		
	}

	public Horario() {
		hora = 0;
		minuto = 0;
		segundo = 0;

	}

	void exibirDados() {
		
		System.out.print(hora < 10 ? "0" + hora + ":" : hora);
		System.out.print(minuto < 10 ? "0" + minuto + ":" : minuto);
		System.out.print(segundo < 10 ? "0" + segundo : segundo);
	}

	void calcularSegundos() {
		System.out.println(hora * 3600 + minuto * 60 + segundo + " segundos");

	}

}
