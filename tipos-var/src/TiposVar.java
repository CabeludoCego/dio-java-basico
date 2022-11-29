public class TiposVar {
    public static void main(String[] args) throws Exception {

		// TIPAGEM BÁSICA
        double salarioMinimo = 1200.50;
		long numeral = 9875L;
		float pi = 3.1415F;
		// Long termina com L, float termina com f. Regras necessárias.
		// Java é fortemente tipado.

		// CASTING
		short num1 = 1;
		int numN = num1;
		// short num2 = numN; // Não pode converter de maior para short.
		// Solução: cast , conversão de tipagem.
		short num2 = (short) numN;

		// VARIÁVEIS E CONSTANTES
		final int NUM3 = 15;
		// "final" define constantes. Smp em caixa alta.
		// num3 = 16;

    }
}
