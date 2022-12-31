import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class exercicios3 {
	public static void main(String[] args) {
		// questao1_estados();
		questao2_dados();
	}

	public static void questao1_estados(){
		Map<String, Integer> estadosNE = new HashMap<>(){{
			put("PE", 9616600);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		// Estado = PE - População = 9.616.621
		// Estado = AL - População = 3.351.543
		// Estado = CE - População = 9.187.103
		// Estado = RN - População = 3.534.265

		// Conferir se há PB. Se não, add.
		System.out.println("Tem PB?" + estadosNE.containsKey("PB"));
		if (!estadosNE.containsKey("PB")){
			estadosNE.put("PB", 4000300);
		}

		// Exibir população PE
		System.out.println("Estado PE: " + estadosNE.get("PE"));

		// Exiba estados na ordem informada
		for (Map.Entry<String, Integer> entry : estadosNE.entrySet()){
			// System.out.println("Estado data:" + entry);
			System.out.println("Estado:" + entry.getKey() + "-" + entry.getValue());
		}


		// Em ordem alfabetica
		Map<String, Integer> estadosNEOrd = new LinkedHashMap<String, Integer>() {{
			put("PE", 9616600);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		estadosNEOrd.put("PB", 4000300);
		for (Map.Entry<String, Integer> entry : estadosNEOrd.entrySet()){
			// System.out.println("Estado data:" + entry);
			System.out.println("Estado ordenado:" + entry.getKey() + "-" + entry.getValue());
		}

		// Exibir estado com menor população
		// Com maior população
		
		Set<String> estados = estadosNE.keySet();
		Collection<Integer> pops = estadosNE.values();

		Integer maiorpop = Collections.max(estadosNE.values());
		Integer menorpop = Collections.min(estadosNE.values());
		Set<Map.Entry<String, Integer>> entries = estadosNE.entrySet();

		String estadoMaiorpop = "";    String estadoMenorpop = "";

		for (Map.Entry<String, Integer> entry : entries){
			if (entry.getValue().equals(maiorpop)) 
				estadoMaiorpop = entry.getKey(); 
			
			if (entry.getValue().equals(menorpop)) 
				estadoMenorpop = entry.getKey(); 
		}
		System.out.println("Estado com maior pop: " + estadoMaiorpop + ", com " + maiorpop + " habitantes.");
		System.out.println("Estado com menor pop: " + estadoMenorpop + ", com " + menorpop + " habitantes.");

		// Soma das populações

		Iterator<Integer> iterator = estadosNE.values().iterator();
		Integer soma = 0;
		while(iterator.hasNext()) {
			soma += (Integer) iterator.next();
		}

		System.out.println("Soma das populações:" + soma + " com média de " + (soma/estadosNE.size()));
		// Média

		// Remover estados com pop menor que 4mi
		Iterator<Integer> incinerator = estadosNE.values().iterator();
		while(incinerator.hasNext()) {
			if(incinerator.next() < 4000000) {
				incinerator.remove();
			}

		}
		System.out.println(estadosNE);


		// Apagar e verificar se está vazio
		estadosNE.clear();
		System.out.println("Vazio? " + estadosNE.isEmpty());

	}
	public static void questao2_dados(){

		List<Integer> lancamentos = new ArrayList<Integer>();
		Random giroDados = new Random();
		for (int i = 0; i < 100; i++){
			lancamentos.add(giroDados.nextInt(6) + 1);
		}
		
		Map<Integer, Integer> dados = new HashMap<>(){{
			put(1, 0); put(2, 0);
			put(3, 0); put(4, 0);
			put(5, 0); put(6, 0);
		}};
		for (int l : lancamentos){
			dados.put(l, (dados.get(l) + 1));
		}
		// Programa que simule lançamento de dados 100 vezes
		// Armazene
		// Exibir quantas vezes cada valor apareceu.
		for(Map.Entry<Integer,Integer> entry : dados.entrySet()){
			System.out.println("Face do dado:" + entry.getKey() + ", apareceu:" + entry.getValue());
		}
	}
}
