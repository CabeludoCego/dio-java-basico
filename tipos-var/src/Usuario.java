public class Usuario {
	
	public static void main(String[] args) {
	
		smartTv smartTv = new smartTv();
		System.out.println("Ligada? " + smartTv.ligada);
		System.out.println("Canal: " + smartTv.canal);
		System.out.println("Volume: " + smartTv.volume);
	
		smartTv.ligar();
		System.out.println("Ligada? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Ligada? " + smartTv.ligada);
		
		smartTv.aumentaVolume();
	
	
	
	}

}
