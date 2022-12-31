import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class checkedExcep {
	public static void main(String[] args) {
		String nomeDoArquivo = "romance-blake-crouch.txt";
		try {
			imprimirArquivoNoConsole(nomeDoArquivo);
		}
		catch (FileNotFoundException e) {
			// e.printStackTrace();
			JOptionPane.showInputDialog(null, "Revise arquivo a imprimir.");
		}
		catch (IOException e) {
			JOptionPane.showInputDialog(null, "Erro inesperado! Contate o suporte.");
		}
		finally{
			System.out.println("Fim de run.");
		}

	}

	public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
		File file = new File(nomeDoArquivo);

		BufferedReader br = new BufferedReader(new FileReader(file.getName()));
		String line = br.readLine();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		do{
				bw.write(line);
				bw.newLine();
				line=br.readLine();
		} while(line != null);
		bw.flush();
		br.close();
}
}
