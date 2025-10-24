package ej3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LsError {

	public static void main(String[] args) {

		
		try {
			
			Process p = new ProcessBuilder("ls").start();
			
			BufferedReader error = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			
			String lineaErr;
			
			
			System.out.println("Mensaje de error del comando");
			
			while((lineaErr = error.readLine()) !=null) {
				System.err.println(lineaErr);
			}
			
			p.waitFor();
			error.close();
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
