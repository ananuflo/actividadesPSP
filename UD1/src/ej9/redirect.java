package ej9;

import java.io.*;

public class redirect {

	public static void main(String[] args) {

	
			
			ProcessBuilder pb = new ProcessBuilder("bash", "dmesg");
			
			pb.redirectOutput(new File("salida.txt"));
			pb.redirectError(new File("errores.txt"));
			
			try {
				
				Process p = pb.start();
				p.waitFor();
				System.out.println("Finalizado");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
