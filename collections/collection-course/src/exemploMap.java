import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class exemploMap {
	public static void main(String[] args) {
		System.out.println("Crie dicionário com chave - valor");
		Map<String, Double> carros = new HashMap<>(){{
			put("gol", 14.4);
			put("uno", 15d);
			put("celtinha", 18.8);
			put("corsa", 12.5);
		}};
		System.out.println("Carros populares:" + carros.toString());

		carros.put("gol",15.0);
		System.out.println("Tem tucson?" + carros.containsKey("tucson"));

		System.out.println("Consumo do uno:" + carros.get("uno"));

		// exibir modelos
		Set<String> modelos = carros.keySet();

		Collection<Double> consumos = carros.values();

		Double melhorConsumo = Collections.max(carros.values());
		Set<Map.Entry<String, Double>> entries = carros.entrySet();

		String modeloMaisEficiente = "";

		for (Map.Entry<String, Double> entry : entries){
			if (entry.getValue().equals(melhorConsumo)) 
				modeloMaisEficiente = entry.getKey(); 
		}

		System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " e seu consumo: " + melhorConsumo);

		Double piorConsumo = Collections.min(carros.values());
		String modeloMenosEficiente = "''";

		for (Map.Entry<String, Double> entry : carros.entrySet()) {
			if(entry.getValue().equals(piorConsumo)) {
				modeloMenosEficiente = entry.getKey();
			}
		}
		
		System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " e seu consumo: " + piorConsumo);

		Iterator<Double> iterator = carros.values().iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma += (double) iterator.next();
		}
		System.out.println("Soma dos consumos: " + soma + " e sua media:" + (soma/carros.size()));

		Iterator<Double> iterator2 = carros.values().iterator();
		while(iterator2.hasNext()) {
			if(iterator2.next().equals(15d)) {
				iterator2.remove();
			}
		}

		Map<String, Double> carrosTree = new TreeMap<>(carros);
		System.out.println("Dicionario ordenado: " + carrosTree.toString());

		carros.clear();
		System.out.println(carros.isEmpty());


	}
}