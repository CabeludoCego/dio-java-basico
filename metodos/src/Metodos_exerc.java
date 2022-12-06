import java.util.Scanner;

public class Metodos_exerc {

	public static void somar(double a, double b){
		double res = a + b;
		System.out.println("Resultado da soma dos números:" + res);
	}
	public static void subtrair(double a, double b){
		double res = a - b;
		System.out.println("Resultado da subtração dos números:" + res);
	}
	public static void multiplicar(double a, double b){
		double res = a * b;
		System.out.println("Resultado da multiplic. dos números:" + res);
	}
	public static void dividir(double a, double b){
		double res = a / b;
		System.out.println("Resultado da divisão dos números:" + res);
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// System.out.println("Sou seu smartphone! Que operação deseja realizar?");
		// System.out.println(" 'c' para calculadora, 'e' para sair");
		// String key = scanner.nextLine();
		boolean exec = true;
		double numA,numB, altura; 
		// String ckey;

		

		System.out.print("Informe os números envolvidos! Lado 1= ");
		numA = scanner.nextDouble();
		System.out.print("Lado 2 = ");
		numB = scanner.nextDouble();
		System.out.print("Altura = ");
		altura = scanner.nextDouble();

		// // Exemplo de sobrecarga
		System.out.println("Area do quadrado com esses lados: " + areasQuadrilat.area(numA));
		System.out.println("Area do retangulo com esses lados: " + areasQuadrilat.area(numA, numB));
		System.out.println("Area do trapezio com esses lados: " + areasQuadrilat.area(numA, numB, altura));
		
		// Exemplo de calculadora em loop
		// while (exec){
		// 	switch (key) {
		// 		case "c":
		// 			System.out.println("Que operação matemática deseja? 'e' para sair");
					
		// 			String ckey = scanner.nextLine();

		// 			System.out.print("Informe os números envolvidos! A = ");
		// 			numA = scanner.nextDouble();
		// 			System.out.print("B = ");
		// 			numB = scanner.nextDouble();
		// 			System.out.println("Vai começar! Operação escolhida:" + ckey);
		// 			switch (ckey) {
		// 				case ("+"):
		// 					somar(numA,numB);
		// 				break;
	
		// 				case ("-"):
		// 					subtrair(numA,numB);
		// 				break;

		// 				case ("*"):
		// 					multiplicar(numA,numB);
		// 				break;

		// 				case ("/"):
		// 					dividir(numA,numB);
		// 				break;
						
		// 				case "e":
		// 					key = "e";
		// 					exec = false;
		// 				break;	
			
						
		// 				default:
		// 					System.out.println("Digite valor válido.");
		// 				break;
		// 			}
	
		// 		break;
			
	
		// 		case "e":
		// 			exec = false;
		// 		break;
				
		// 		default:
		// 			System.out.println("Digite valor válido.");
		// 		break;
		// 	}
		// }


    }
}
