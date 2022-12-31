import javax.swing.*;

public class uncheckedExem {
	public static void main(String[] args) {
		boolean continueLoop = true;
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
	
			try{
				int res = dividir(Integer.parseInt(a), Integer.parseInt(b));
				System.out.println(res);
				continueLoop = false;
			} 
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada invalida! Erro:" + e.getMessage());
				// e.printStackTrace();
			} 
			catch (ArithmeticException e){
				JOptionPane.showMessageDialog(null, "Impossível dividir por 0!");
			}
			finally {
				System.out.println("Fim de execução.");
			}
		
		} while (continueLoop);


		System.out.println("Sucesso!");
	}
	
	public static int dividir(int a, int b) {
		return a / b;
	}
}
