public class smartTv {
	
	boolean ligada = false;
	int volume = 5;
	int canal = 4;

	public void ligar(){
		ligada = true;
	}
	public void desligar(){
		ligada = false;
	}

	public void avancarCanal(){
		if (canal == 40) {
			canal = 1;
		}
		else
			canal++;
	}
	
	public void voltarCanal(){
		if (canal == 1) {
			canal = 40;
		}
		else
			canal--;
	}
	public void aumentaVolume(){
		if (volume == 10) {
			System.out.println("Volume no máximo!");
		}
		else
			volume++;
	}
	
	public void diminuiVolume(){
		if (volume == 0) {
			System.out.println("Tv muda!");
		}
		else
			volume--;
	}

	public void escolherCanal(int channel){
		System.out.println("Informe canal:");
		if (channel > 40 || channel < 1){
			System.out.println("Canal não existe.");	
		}
		else
			canal = channel;
	}


	public static void main(String[] args) {

	}
	


}
