 package ej6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Enviroment {

	public static void main(String[] args) {

		
		try {
			
			ProcessBuilder pb = new ProcessBuilder("printenv","mi_var");
			
			pb.environment().put("mi_var", "UD1");
			
			Process p = pb.start();
			
			BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			
			
			String linea;
			System.out.println("Valor de la variable mi_var: ");
			
			while((linea = r.readLine()) !=null) {
				System.out.println(linea);
				
			}
			
			p.waitFor();
			r.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
