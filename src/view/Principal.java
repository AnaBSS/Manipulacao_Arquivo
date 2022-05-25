package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {

		IArquivosController arqCont = new ArquivosController ();
		String dirCaminho = "C:\\TEMP";
		String dirNome = "generic_food.csv";
		
		try {
//		arqCont.leDir(dirTEMP);
			arqCont.leArquivo(dirCaminho, dirNome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
