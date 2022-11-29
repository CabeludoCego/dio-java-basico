import java.util.Scanner;
import java.util.Locale;


public class TestandoScanner {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
			

		System.out.println("Digite seu nome:");
		String nome = scanner.next();

		System.out.println("Digite sua altura:");
		double altura = scanner.nextDouble();

		System.out.println("Parâmetros recebidos: " + nome + " e " + altura);

		
	
	}
	
}
