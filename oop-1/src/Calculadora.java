interface Calcular {
	void soma(double a, double b);

	void subtracao(double a, double b);
}

// Classe precisa definir os métodos. Informa erro se não o fizer.
class Calculadora implements Calcular {
	@Override
	public void soma(double a, double b)
	{
		System.out.println(a + b);
	}
	@Override
	public void subtracao(double a, double b)
	{
		System.out.println(a - b);
	}

}