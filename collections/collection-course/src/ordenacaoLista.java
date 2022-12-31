

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenacaoLista {
	public static void main(String[] args) {

		List<Gato> meusGatos = new ArrayList<>(){{
			add(new Gato( "Rick", 10, "cinza"));
			add(new Gato( "Janjão", 17, "dourado fosco"));
			add(new Gato( "Cida", 4, "branco"));
			add(new Gato( "Cida", 6, "amarelo"));
			add(new Gato( "Cida", 7, "branco"));

		}};
		System.out.println(meusGatos);

		// Ordem aleatória
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);

		// Ordenado por nome
		Collections.sort(meusGatos);
		System.out.println(meusGatos);

		// Ordem de idade
		// Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);

		// Ordem de cor
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);

		// Ordenar pelos 3...
		// se nomeA=nomeB, usa o critério seguinte para ordenar
		meusGatos.sort(new ComparatorWhole());
		System.out.println(meusGatos);
		
	}
}





class Gato implements Comparable<Gato>
{
	private String nome;
	private int idade;
	private String cor;

	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "{" + "nome:" + nome + ", idade: " + idade + ", cor: " + cor + "}";
	}

	@Override
	public int compareTo(Gato gato){
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}



}

class ComparatorIdade implements Comparator<Gato> {
	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato> {
	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}



class ComparatorWhole implements Comparator<Gato> {
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0) return nome;

		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) return cor;

		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}