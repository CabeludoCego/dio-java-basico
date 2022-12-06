import java.util.Scanner;

public class Desafio02 {
		
	public static void main(String[] args) {
		System.out.println("Digite quantidade de metros quadrados a pintar:");
		Scanner scanner = new Scanner(System.in);
		double areaCoberta = scanner.nextDouble();

		double valorLata = 80;
		double valorGalao = 25; 

		double litrosNecessarios = areaCoberta / 6;

		double quantidadeLatas = Math.ceil(litrosNecessarios / 18);
		double quantidadeGaloes = Math.ceil(litrosNecessarios / 3.6);
		
		System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * valorLata );
		System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * valorGalao);

	}
}