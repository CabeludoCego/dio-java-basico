public class areasQuadrilat {


	
	public static double area(double lado){
		double res = lado*lado;
		return res;
	}

	public static double area(double lado1, double lado2){
		double res = lado1*lado2;
		return res;
	}

	public static double area(double baseM, double basem, double altura){
		double res = (baseM + basem)*altura/2;
		return res;
	}
}
