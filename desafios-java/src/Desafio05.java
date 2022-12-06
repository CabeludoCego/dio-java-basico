import java.util.Scanner;

public class Desafio05 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
        int ano;
        ano = ent.nextInt();

		if((ano % 4 == 0) || ((ano % 400 == 0)  && (ano % 100 != 0)) ){
			System.out.println("Bissexto");
		}
		else{
			System.out.println("Nao Bissexto");
		}
	}
}
