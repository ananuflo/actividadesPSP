package ej1;

import java.io.IOException;

public class Echo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		try {
			
			ProcessBuilder p = new ProcessBuilder("echo", "Hola Mundo");
			
			Process proceso = p.start();
			int codigoResultado = proceso.waitFor();
			
			if(codigoResultado == 0) {
				System.out.println("Todo fue correcto");
			}
			
		}catch(Exception e) {
			System.err.println(e);
			
		}
		
		
		
	}

}
