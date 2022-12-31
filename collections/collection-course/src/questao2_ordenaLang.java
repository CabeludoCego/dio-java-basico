import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class questao2_ordenaLang {
	public static void main(String[] args) {
		
		// class lang favorita
		// nome, anoCriacao, ide
		Set<Lang> languages = new HashSet<>() {{
			add(new Lang("Java", "Eclipse", 1992));
			
			add(new Lang("Java", "Eclipse", 1992));



		// Ordenar as langs por ordem de inserção, ordem natural, 
		// ide, ano de criação/nome e nome/ano/ide
		}};
	
	}

		

}


class Lang implements Comparable<Lang> {
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