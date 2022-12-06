
import java.util.Scanner;

public class Desafio04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double tmhMB = sc.nextFloat();
		double tmhMbps = sc.nextFloat();

		// Calcular tempo de download ()
		double tempoDownload = (tmhMB / tmhMbps ) / 60; //em minutos
		double tempoRounded = (Math.round(tempoDownload * 100d)) / 100d;

		// Converter para minutos
		System.out.println("O download deve levar " + tempoRounded + " minutos");
	}
}
