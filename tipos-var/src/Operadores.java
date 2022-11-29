public class Operadores {
	public static void main(String[] args) throws Exception {
		double soma = 10 + 11.54;
		int subt = 10 - 3;
		int modulo = 18 % 6;

		// String textoUnido = "Dia de" + " " + "esforço máximo";
		// System.out.println(textoUnido);

		// // concatenação
		// // Números em sequência são somados.
		// // Strings são "colocadas" na posição que foram concatenadas.
		// String concate = 1 + 1 + "1" + 1;
		// String conca2 = "1" + 1 + "1" + "1";
		// System.out.println(concate);		
		// System.out.println(conca2);
	
		// // OPERADORES 2
		// // Negação, incremento, decremento, e negação booleana
		// int num1 = 10;
		// num1 = num1++;
		// System.out.println(- num1);
		// num1 = - num1;
		// System.out.println(num1);
		
		// OPERADORES 3
		int num2 = 2;
		num2++;
		// A ordem do incremento afeta o numero
		System.out.println(num2 ++);
		System.out.println(num2);
		System.out.println(++ num2);

		boolean varbin = true;
		varbin = !varbin;
		System.out.println(!varbin);
		System.out.println(varbin);

	}
}
