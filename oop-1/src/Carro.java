
// Método construtor: Cria um objeto a partir da classe.
class Carro {

	// Organização da classe:
	// 1. Atributos
	// 2. Construtor
	// 3. Get e Set
	// 4. Métodos da classe

	String cor;
	String modelo;
	double capacidadeTanque;

	// Construtor: mesmo nome da classe
	// Todas as formas de poder inicializar uma classe.
	Carro(){

	}

	Carro(String cor){

	}

	Carro(String cor, String modelo, double capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}

	// Métodos SET e GET da classe
	void setCor(String cor){
		this.cor = cor;
	}
	String getCor(){
		return cor;
	}
	void setModelo(String modeloSet){
		modelo = modeloSet;
	}
	String getModelo(){
		return modelo;
	}

	void setTanque(double capacidadeTanque){
		this.capacidadeTanque = capacidadeTanque;
	}
	double getTanque(){
		return capacidadeTanque;
	}

	double valorTanqueCheio(double precoGasosa){
		return (capacidadeTanque*precoGasosa);
	}



	// // Destrutor: auxilia a destruir um objeto
	// void finalize(){
		
	// }
	// // Recurso do coletor de lixo: Limpar memoria

}

class Caminhonete extends Carro{

}