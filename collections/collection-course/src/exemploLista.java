

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploLista {
		public static void main(String[] args) {
		
			List<Double> notas2 = new ArrayList<>(Arrays.asList(7d, 8.5, 3.0, 9.34));
			
			List<Double> notas3 = Arrays.asList(7d, 8.5, 3.0, 9.34);
			// notas3.add(5.54);
			// System.out.println(notas3);

			List<Double> notas4 = List.of(7d, 5.5, 2.54);
			// notas4.add(1d);
			// notas4.remove(7d);
			// System.out.println(notas4);

				
			List<Double> notas = new ArrayList<>();
			notas.add(7d);
			notas.add(4.54);
			notas.add(8.8);
			// System.out.println(notas);
			System.out.println(notas.toString());
			
			
			System.out.println(notas);
			// Retorna indice de elemento
			System.out.println("Índice da nota 4.54? " + notas.indexOf(4.54));
			
			// Adicionar elemento em posição
			notas.add(2, 8d);
			System.out.println(notas);

			// Substituir elemento em posição
			notas.set(notas.indexOf(7d), 6.42);
			System.out.println(notas);

			// notas.contains(7d);
			System.out.println("Contém um 7? " + notas.contains(7d));
		
			for (Double nota : notas) {
				System.out.println(nota);
			}

			System.out.println("Exiba a terceira das notas: " + notas.get(2));
			
			System.out.println("A maior nota:" + Collections.max(notas));
			
			// Soma das notas
			Iterator<Double> iterator = notas.iterator();
			double soma = 0;
			while(iterator.hasNext()) {
				Double next = iterator.next();
				soma += next;
			}
			System.out.println("Soma das notas:" + soma + "; Média das notas:" + (soma/notas.size()));

			notas.remove(0);
			notas.remove(6.42d);
			
			// Remover notas menores que 6
			Iterator<Double> iterator1 = notas.iterator();
			while(iterator1.hasNext()) {
				Double next = iterator1.next();
				if(next < 6)
					iterator1.remove();
			}
			System.out.println(notas);

			// Limpar lista
			notas.clear();
			System.out.println("Está vazia? " + notas.isEmpty());
		}
}
