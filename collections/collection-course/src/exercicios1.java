
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exercicios1 {
	
	// Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// questao1_temperatura();
		questao2_criminalCase();
	}

	public static void questao1_temperatura () {
		// scanner pra receber 6 temperaturas
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> temps = new ArrayList<>();		
		List<String> meses = new ArrayList<>(
			Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho")
		);

		System.out.println("Digite 6 temperaturas. Inteiros apenas!");
		for (int i = 0; i < 6; i++){
			int var = scanner.nextInt();
			temps.add(var);
		}
		
		System.out.println(temps);
		System.out.println(meses);

		// exibir media 
		Iterator<Integer> iterator = temps.iterator();
		int soma = 0;
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			soma += next;
		};
		double media = (soma/temps.size());
		System.out.println("Média das notas: " + media);

		// exibir temperaturas acima da media + mes respectivo
		
		System.out.println("Meses acima da média de temperatura:");
		Iterator<Integer> iterator2 = temps.iterator();
		while(iterator2.hasNext()) {
			Integer next = iterator2.next();
			if(next > media){
				String mes = meses.get(temps.indexOf(next));
				System.out.println("Mês:" + mes +  ", Temperatura:" + next);
				
				// iterator2.remove();
			}
		};
	}

	public static void questao2_criminalCase () {
		// fazer 5 perguntas
		// telefone p vitima,  esteve no local, mora perto, devia para a vitima, trabalhou com a vitima
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Criminal case! Responda o questionário da polícia. Y/N:");

		List<String> respostas = new ArrayList<>();	

		List<String> perguntas = new ArrayList<>(
			Arrays.asList("Ligou para a vitima?", 
			"Esteve no local do crime?", 
			"Mora perto da vitima?", 
			"Devia algo para a vitima?", 
			"Por fim...ja trabalhou com a pessoa?")
		);

		for (int i = 0; i < perguntas.size(); i++){
			System.out.println(perguntas.get(i));
			String var = scanner.next();
			respostas.add(var);
		}
		// 2 sim: suspeita
		// 3 ou 4 sim: cumplice
		// 5 sim: culpada!
		// 0 a 1 sim: inocente

		Iterator<String> iterator = respostas.iterator();
		int resPositivas = 0;
		while(iterator.hasNext()) {
			String next = iterator.next();
			int var = next.compareToIgnoreCase("y");
			if(var == 0){
				resPositivas += 1;
			}
		};

		switch(resPositivas){
			case 0:
				System.out.println("Resultado: inocente");
				break;
			case 1:
				System.out.println("Resultado: inocente");
				break;
			case 2:
				System.out.println("Resultado: suspeito!");
				break;
			case 3:
				System.out.println("Resultado: suspeito ou cúmplice!");
				break;
			case 4:
				System.out.println("Resultado: suspeito ou cúmplice!");
				break;
			case 5:
				System.out.println("Resultado: culpado!");
				break;
			default:
				System.out.println("Respostas inconclusivas.");
				break;
		}

	}
	
}
