package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController {		

	@Override
	public void leArquivo(String caminho, String nome) throws IOException {
		File arq = new File(caminho, nome);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);	
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader (leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if (linha.contains("fruit")) {
					String[] vetFrutas = linha.split(",");
					System.out.println(vetFrutas[0] + "          \t" + vetFrutas[1] + "          \t" + vetFrutas[3] + "          \t");
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo inválido");
		}
	}	
	
}
