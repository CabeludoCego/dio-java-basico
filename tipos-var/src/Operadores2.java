public class Operadores2 {
	public static void main(String[] args) throws Exception {
	int a = 5; int b = 7;
	String resultado = (a==b) ? "verdadeiro" : "falso";

	System.out.println(resultado);

	// // Operadores relacionais
	// int num1 = 1;
	// int num2 = 3;
	// boolean yesno = (num1 <= num2);
	// System.out.println("Numeros são iguais? " + yesno);

	// String nomeUm = "richarlison";
	// String nomeDois = new String("richarlison");
	// String nomeTres = "richarlison";	
	// System.out.println(nomeUm.equals(nomeDois));
	// System.out.println(nomeUm.equals(nomeTres));

	// Operadores logicos
	boolean condicao1 = true;
	boolean status = ((condicao1 || (8>11)) ? true : false);
	
	System.out.println(status);

	// Operadores extra:
	boolean b1 = true;
	boolean b2 = true;
	boolean b3 = false;
	boolean b4 = false;

	
	System.out.println("V + V :" + (b1 ^ b2));
	System.out.println("V + F :" + (b1 ^ b3));
	System.out.println("F + V :" + (b3 ^ b2));
	System.out.println("F + F :" + (b3 ^ b4));


	}
}
