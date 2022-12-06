class Veiculo {
	int numeroRodas;
	double capacidadeTanque;

	void setRodas(int numeroRodas){
		this.numeroRodas = numeroRodas;
	}
	int getRodas(){
		return numeroRodas;
	}

	void setTanque(double capacidadeTanque){
		this.capacidadeTanque = capacidadeTanque;
	}
	double getTanque(){
		return capacidadeTanque;
	}
}

class Moto extends Veiculo{
	
}

class CarroPasseio extends Veiculo{
	
}

class Caminhonete extends Veiculo{ 

}
