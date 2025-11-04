package ej7;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class Pipe2 {
	
	//Ejercicio Profesor

	public static void main(String[] args) {

		
		try {
			
			File tmp = File.createTempFile("Pipe", ".txt");
			
			ProcessBuilder pb1 = new ProcessBuilder("bash","-lc","echo","Hola Mundo");
			ProcessBuilder pb2= new ProcessBuilder("bash","-lc","wc","-w");
			
			pb2.redirectInput(tmp);
			Process p = pb1.start();
			
			
			String salida = new String(p.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
			p.waitFor();
			
			System.out.println(salida);

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
