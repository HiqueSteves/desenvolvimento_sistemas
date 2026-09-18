package senai;

public class Principal {

	public static void main(String[] args) {
		
		UnidadeSenai unidade1 = new UnidadeSenai("SENAI Valença");
		
		Departamento ti = new Departamento(
				1, "Tecnologia da Informação", "(24)1111-1111");
		Departamento ad = new Departamento(
				2, "Administração", "(24)2222-2222");
		
		Funcionario func1 = new Funcionario(1, "Maria", "Desenvolvedora", 3500);
		Funcionario func2 = new Funcionario(2, "Pedro", "Suporte", 2800);
		Funcionario func3 = new Funcionario(3, "Leticia", "Analista", 3200);
		Funcionario func4 = new Funcionario(4, "Douglas", "Assistente", 2200);
		
		unidade1.adicionarDepartamento(ad);
		unidade1.adicionarDepartamento(ti);
		
		ti.adicionarFuncionario(func1);
		ti.adicionarFuncionario(func2);
		
		ad.adicionarFuncionario(func3);
		ad.adicionarFuncionario(func4);
		
		unidade1.exibirEstrutura();
		func1.setSalario(4800);
		unidade1.exibirEstrutura();

	}

}
