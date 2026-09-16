package academia;

import java.net.Socket;

public class AlunoAcademia {
	String nome;
	int idade;
	double peso;
	double altura;
	
	void alunos(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public static boolean ehMenorDeIdade(int idade) {
		if (idade < 18) {
			return true ;
		} else {
			return false;
		}
			
	}
	
	double calcularIMC() {
		return peso / altura * altura;
	}
	
	void exibirDados(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}
