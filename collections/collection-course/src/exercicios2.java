import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class exercicios2 {
	public static void main(String[] args) {
		// questao1_arcoiris();
		questao2_ordenaLang();

	}

	public static void questao1_arcoiris () {
		// Exibir cores uma abaixo da outra
	
		Set<String> rainbow = new HashSet<>(Arrays.asList("Vermelho", "Azul", "Verde", "Amarelo", "Laranja", "Ciano", "Violeta"));

		// Qtd de cores, em ordem alfabetica, em ordem inversa, 
		System.out.println(rainbow.size());

		Set<String> orderRainbow = new TreeSet<>(rainbow);
		System.out.println(orderRainbow);

		for (String cor : rainbow) {
			System.out.println(cor);
		}

		// todas que começam com "v", remover quem não começa com "v"
		Iterator<String> iterator = rainbow.iterator();
		while (iterator.hasNext()) {
				if (!iterator.next().startsWith("V")) {
					iterator.remove();
				}
		}
		System.out.println(rainbow);
	
		// limpar conjunto, checar se está vazio
		rainbow.clear();
		System.out.println("Está vazio? " + rainbow.isEmpty());
	}
	
	public static void questao2_ordenaLang () {
		// class lang favorita
		// nome, anoCriacao, ide
		Set<Lang> languages = new HashSet<>() {{
			add(new Lang("Java", "Eclipse", 1992));
			add(new Lang("PHP", "VS Code", 1984));
			add(new Lang("Kotlin", "Android studio", 2008));
			add(new Lang("Python", "Pycharm", 2002));
		}};
		System.out.println("Ordem de inserção:");
		for(Lang lang: languages) {
			System.out.println(lang.getNome() + " - " + lang.getIde() + " - " + lang.getAnoCriacao());
		}
	
		System.out.println("Ordem natural:");
		Set<Lang> orderLang = new TreeSet<>(languages);
		System.out.println(orderLang);

		System.out.println("Ordenar por IDE:");
		
		Set<Lang> order1Langs = new TreeSet<>(new ComparatorIDE());
		order1Langs.addAll(languages);
		for(Lang lang: order1Langs)	{
			System.out.println(lang.getNome() + " - " + lang.getIde() + " - " + lang.getAnoCriacao());
		}


		System.out.println("Ordenar por Ano criação/nome:");
		Set<Lang> order2Langs = new TreeSet<>(new ComparatorAnoNome());
		order2Langs.addAll(languages);
		for(Lang lang: order2Langs) {
			System.out.println(lang.getNome() + " - " + lang.getIde() + " - " + lang.getAnoCriacao());
		}

		
		System.out.println("Ordenar por Nome/Ano/IDE");
		Set<Lang> ordermaxLangs = new TreeSet<>(new ComparatorN_A_I());
		ordermaxLangs.addAll(languages);
		for(Lang lang: ordermaxLangs) {
			System.out.println(lang.getNome() + " - " + lang.getIde() + " - " + lang.getAnoCriacao());
		}
		
		// Ordenar as langs por ordem de inserção, ordem natural, 
		// ide, ano de criação/nome e nome/ano/ide

	
	}

		

}


class Lang implements Comparable<Lang>{
	private String nome;
	private String ide;
	private int anoCriacao;
	
	public Lang(String nome, String ide, int anoCriacao) {
		this.nome = nome;
		this.ide = ide;
		this.anoCriacao = anoCriacao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIde() {
		return this.ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	public int getAnoCriacao() {
		return this.anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	@Override
	public int compareTo(Lang lang){
		return this.getIde().compareTo(lang.getIde());
	}

}

class ComparatorIDE implements Comparator<Lang> {
	@Override
	public int compare(Lang g1, Lang g2) {
		return g1.getIde().compareToIgnoreCase(g2.getIde());
	}
}

class ComparatorAnoNome implements Comparator<Lang> {
	@Override
	public int compare(Lang g1, Lang g2) {
		int anocomp = Integer.compare(g1.getAnoCriacao(), g2.getAnoCriacao());
		if (anocomp != 0) return anocomp;
		
		return g1.getNome().compareToIgnoreCase(g2.getNome());
	}
}


class ComparatorN_A_I implements Comparator<Lang> {
	@Override
	public int compare(Lang g1, Lang g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0) return nome;
		
		int anocomp = Integer.compare(g1.getAnoCriacao(), g2.getAnoCriacao());
		if (anocomp != 0) return anocomp;
		
		return g1.getIde().compareToIgnoreCase(g2.getIde());
	}
}