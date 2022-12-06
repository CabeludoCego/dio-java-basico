public class Desafio01 {
    public static void main(String[] args) {

		// Scanner scanner = new Scanner(System.in);
        // String palavra = scanner.next();
        
		String var = "carro";
		int varL = var.length();
		char varV[] = var.toCharArray();

        // System.out.println(varV);

		
		for(int i=0;i<varL ;i++ ){
			for (int j=0;j<varL;j++){
				if (j<=i){
					System.out.print(varV[j]);	
				}
			}
			System.out.println("");
		}

		// for(int i=0;i<varL ;i++ ){
		// 	if (i<=k){
		// 		System.out.print(varV[i]);	
		// 	}
		// 	k += 1;
		// 	System.out.println("");
		// }
	}
}
