public class App {


    public static void main(String[] args) {
		
		// Carro mustang = new Carro("preto", "Mustang", 40);
		// Carro fiatUno = new Carro();
		// fiatUno.setCor("vermelho");
		// fiatUno.setModelo("Mille");
		// fiatUno.setTanque(50);

		// System.out.println(mustang.getTanque());
		// System.out.println(fiatUno.valorTanqueCheio(3.20));
		// System.out.println(mustang.valorTanqueCheio(3.78));
	
		// EXEMPLO 2:  Funcionario e Herança
		Funcionario A = new Funcionario();
		Faxineiro B = new Faxineiro();


		Funcionario GerenteUpcast = new Gerente();
		Funcionario FaxineiroUpcast = new Faxineiro();

		// Downcast deve ser evitado em POO
		// Gerente GerenteDowncast = (Gerente) new Funcionario();
		
		
		// Exemplo sobrescrita e polimorfismo
		Funcionario[] classes = new Funcionario[]{new Funcionario(), new Gerente(), new Faxineiro(), new Estagiario()};

		// Polimorfismo: chama-se o mesmo método e a forma dele é distinta, explicitada na classe.
		// Usa-se também o metodo da classe mãe.
		for (Funcionario i: classes){
			i.trabalhar();
		}
		System.out.println("");

		// Sobrescrita: chama-se o método próprio já modificado de uma classe filha
		// Não se usa o método da classe filha
		Faxineiro Jose = new Faxineiro();
		Jose.pedirFerias();
	}
}
