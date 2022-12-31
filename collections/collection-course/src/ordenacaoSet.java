
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ordenacaoSet {
	public static void main(String[] args) {
		Set<Serie> mySeries = new HashSet<>() {{
			add(new Serie("bcs", 45, "drama"));
			add(new Serie("himym", 28, "comedia"));
			add(new Serie("The boys", 45, "ação"));
		}};
		System.out.println("Ordem de inserção:");
		for (Serie serie: mySeries) System.out.println(serie.getNome() + " - " 
			+ serie.getGenero() + " - " + serie.getTempoEp() + "min");
	

		// System.out.println("Ordem natural:");
		// Set<Serie> mySeries2 = new TreeSet<>(mySeries);
		// System.out.println(mySeries2);
		
		System.out.println("Ordem adaptavel maxima:");
		Set<Serie> mySeries3 = new TreeSet<>(new ComparatorWhole());
		mySeries3.addAll(mySeries);
		for (Serie serie: mySeries3) System.out.println(serie.getNome() + " - " 
			+ serie.getGenero() + " - " + serie.getTempoEp() + "min");
	
		
		System.out.println(mySeries3);
	}
	
}


class Serie implements Comparable<Serie>
{
	private String nome;
	private int tempoEp;
	private String genero;

	public Serie(String nome, Integer tempoEp, String genero) {
		this.nome = nome;
		this.tempoEp = tempoEp;
		this.genero = genero;
	}


	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoEp() {
		return this.tempoEp;
	}

	public void setTempoEp(int tempoEp) {
		this.tempoEp = tempoEp;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "{" + "nome:" + nome + ", tempo de ep.: " + tempoEp + ", genero: " + genero + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, tempoEp, genero);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Serie serie = (Serie) o;
		return (nome.equals(serie.nome) && genero.equals(serie.genero) && (tempoEp == serie.tempoEp));
	}

	@Override
	public int compareTo(Serie serie){
		int tempoEp = Integer.compare(this.getTempoEp(), serie.getTempoEp());
		if (tempoEp != 0) return tempoEp;
		return this.getGenero().compareTo(serie.getGenero());
	}

}


class ComparatorWhole implements Comparator<Serie> {

	@Override
	public int compare(Serie g1, Serie g2) {
		int tempoEp = Integer.compare(g1.getTempoEp(), g2.getTempoEp());
		if (tempoEp != 0) return tempoEp;

		int genero = g1.getGenero().compareToIgnoreCase(g2.getGenero());
		if (genero != 0) return genero;

		return g1.getNome().compareToIgnoreCase(g2.getNome());
	}
}