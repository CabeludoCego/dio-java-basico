import java.util.Scanner;
import java.util.Formatter;
public class Q01 {

	
	// Entrar com numero entre 0 e 10. Informar erro se não for no alcance.
	public static void ex01(){
		Scanner scanner = new Scanner(System.in);
		boolean notaValida = false;
		double notaInput; 
		while (!notaValida){
			System.out.println("Informe nota do aluno X:");
			notaInput = scanner.nextDouble();
			if (notaInput > 0 && notaInput < 10){
				System.out.println("Nota válida! Aluno tem nota " + notaInput);
				notaValida = true;
			}
			else{
				System.out.println("Nota inválida!");
			}
		}
		
	}

	public static void ex03(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Validador! Digite nome:");
		String nome = scanner.nextLine();
		while(nome.length() < 3){
			System.out.println("Digite nome válido!");
			nome = scanner.nextLine();
		}

		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
		while(idade < 0 || idade > 150){
			System.out.println("Digite idade válida!");
			idade = scanner.nextInt();
		}
		
		System.out.println("Digite salario:");
		double salario = scanner.nextDouble();
		while(salario <= 0){
			System.out.println("Digite salario válido!");
			salario = scanner.nextInt();
		}

		System.out.println("Digite sexo (f ou m):");
		String sexo = scanner.nextLine();
		while( !(sexo.equals("f") || sexo.equals("m") )){
			System.out.println("Digite sexo válido!");
			sexo = scanner.nextLine();
		}

		System.out.println("Digite seu estado civil (s, c, v, d):");
		String estadoCivil = scanner.nextLine();
		while( !(estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d")) ) {
			System.out.println("Digite estado civil válido!");
			estadoCivil = scanner.nextLine();
		}

		System.out.println("Obrigado, " + nome + " que ganha " + salario + "! Clonaremos seu cartão agora.");
	}
	
	public static void ex04(){
		System.out.println("Gerenciador de crescimento habitacional, welcome!");
		double PopA = 80000; double rateA = 1.03;
		double PopB = 200000; double rateB = 1.015;
		// double popA, popB;
		int anos = 0;
		while(PopA < PopB){
			PopA = PopA*rateA; PopB = PopB*rateB;
			anos += 1;
			System.out.println("Anos corridos:" + anos);
		}
		System.out.println("Total de anos:" + anos);
	}

	public static void ex22(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Primos 1. Informe número inteiro n:");
		int num = scanner.nextInt(); boolean res=true;

		for (int i=2; i<num;i++){
			if (num%i == 0){
				res = false;
				System.out.println("Divisível por " + i);
				// Não é primo.
				// break;
			}
		}
		System.out.println("O número " + num + " é primo? " + res);
	}

	public static void ex38(){
		Scanner scanner = new Scanner(System.in);
		Formatter formatter = new Formatter();

		System.out.println("Digite salario inicial. Aumento de 6% ao ano no valor do salario.");
		double salarioInicial = scanner.nextDouble();
		System.out.println("Digite ano de entrada. Aumento no primeiro ano: 50%.");
		int anoInicial = scanner.nextInt();
		double salario = (salarioInicial*1.2);

		for (int i=anoInicial; i<2022;i++){
			salario = salario*1.05;
		}
		System.out.println("Salario no ano atual: R$" + salario);
		formatter.format("%.2f", salario);
		System.out.println("Salario no ano atual: R$" + formatter.toString());
	
	}


	public static void fatorial(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fatorial! Digite o inteiro a calcular fatorial:");
		int num = scanner.nextInt(); int res=1;
		for (int i = num; i > 0; i--){
			res *= i;
			// System.out.println(i);
		}
		System.out.println("Resultado fatorial:" + res);
	}

	/// SEÇÃO DE LISTAS	
	public static void ex101(){
		int[] vetor1 = {5, -5, 15, 26};
		int count=0;
		while(count < vetor1.length){
			System.out.print(vetor1[count] + " ");
			count++;
		}
		System.out.println("Agora na ordem inversa!");
		count=vetor1.length - 1;
		while(count >= 0){
			System.out.print(vetor1[count] + " ");
			count--;
		}
	}

	public static void ex105(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Contador de consoantes.Digite número de caracteres.");
		int qtdC = 0;
		int numL = scanner.nextInt();
		int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}}; // information

		String[] vogais = {"a", "e", "i", "o", "u"};
		String[] letras = new String[numL];
		boolean ehVogal;

		for(int i=0; i<numL; i++){
			ehVogal = false;
			System.out.println("Digite letra:");

			letras[i] = scanner.nextLine();

			for(int k=0;k<5;k++){
				System.out.println("Comparação: " + letras[i] + " com " + vogais[k]);
				if(letras[i].equalsIgnoreCase(vogais[k])){ // se for uma vogal
					ehVogal = true;
					System.out.println("É vogal");	
				}
			}

			if(ehVogal==false){
				qtdC += 1;
				System.out.println("É consoante");
			}
			// Não igual a qualquer vogal? É consoante
		}
		System.out.print("Número de consoantes:" + qtdC);
	}

    public static void main(String[] args) {
        System.out.println("Hello, World!");
		ex105();



    }
}