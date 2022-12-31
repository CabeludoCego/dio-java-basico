import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class exemploStreamAPI {
	public static void main(String[] args) {
		List<String> numAl = Arrays.asList(
			"1", "0", "4", "1", "2", "9", "9", "5");

		numAl.stream().forEach( s -> System.out.println(s));
		// numAl.stream().forEach(System.out::println);
		
		// Reference method
		numAl.forEach(System.out::println);

		// Alocar 5 elementos iniciais em um set
		Set<String> collectSet = numAl.stream().limit(5).collect(Collectors.toSet());

		// Lista de string -> lista de int
		List<Integer> collectInt = numAl.stream()
			.map(Integer::parseInt)
			.collect(Collectors.toList());


		// Selecionar maiores que 2 e alocar em uma var
		List<Integer> ListMaiorque2 = numAl.stream()
			.map(Integer::parseInt)
			.filter(i -> (i % 2 == 0 && i > 2))
			.collect(Collectors.toList());
		System.out.println(ListMaiorque2);	

		numAl.stream()
			.mapToInt(Integer::parseInt)
			.average()
			.ifPresent(System.out::println);

		collectInt.removeIf(i -> (i % 2 != 0));
		System.out.println(collectInt);
			// List<Integer> ListSemImpares = numAl.stream()
			// .map(Integer::parseInt)
			// .filter(i -> (i % 2 != 0))



		System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
		
		// System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

		System.out.println("Mostre a lista na ordem númerica: ");

	  System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
	}
}
