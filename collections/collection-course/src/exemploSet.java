

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class exemploSet {
	public static void main(String[] args) {
	
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 1.4, 3.66, 8d, 5.6));

		Set<Double> notas2 = new HashSet<>();
		notas.add(7.5); notas2.add(8d);
	
		System.out.println(notas);
		System.out.println(notas.toString());

		System.out.println("Nota 5 está inclusa? " + notas.contains(5d));
		
		System.out.println("Qual a menor nota? " + Collections.min(notas) );
	
		Iterator<Double> iterator = notas.iterator();
		double soma = 0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Soma das notas:" + soma + "; Média das notas:" + (soma/notas.size()));

		notas.remove(7d);

		// Remover menores que 6
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
				Double next = iterator1.next();
				if(next < 6)
					iterator1.remove();
			}
		System.out.println(notas);

		
		// LINKED HASH SET
		Set<Double> notasL = new LinkedHashSet<>();
		notasL.add(7d);	notasL.add(3d);	notasL.add(6.1);

		System.out.println(notasL);

		Set<Double> notas3 = new TreeSet<>(notasL);
		System.out.println(notas3);

		System.out.println("Conjuntos vazios? " + notas.isEmpty() + " " + notas3.isEmpty());

	}
	

	
}
