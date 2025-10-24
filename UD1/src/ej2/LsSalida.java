package ej2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LsSalida {

	public static void main(String[] args) {

		try {
			
			Process p = new ProcessBuilder("ls -l").start();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			
			String linea;
			while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
			
			int codigo = p.waitFor();
			
			if(codigo == 0) {
				System.out.println("Todo fue bien");
				
			}else {
				System.err.println("Error");
			}
			
			reader.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} 

	}
}
