class Funcionario {
	String nome;
	double salario;
	int anosServico;

	void trabalhar(){
		System.out.println("Todo funcionário trabalha");
	}
	void pedirFerias(){
		System.out.println("2 folgas de 15 dias por ano");
	}
}

class Gerente extends Funcionario {
	int tamanhoEquipe;

	// Polimorfismo
	@Override
	void trabalhar() {
		System.out.println("O gerente trabalha com funcionários");
	}
		
}

class Faxineiro extends Funcionario {
	@Override
	void trabalhar() {
		System.out.println("O faxineiro trabalha em um dos turnos: ou entra 1h antes da equipe, ou sai 1h depois");
	}
	@Override
	void pedirFerias() {
		System.out.println("O faxineiro tem direito a mais 15 dias de férias");
	}
}

class Estagiario extends Funcionario {
	String curso;
	@Override
	void trabalhar() {
		System.out.println("O estagiário trabalha menos horas que outros funcionários");
	}
}
