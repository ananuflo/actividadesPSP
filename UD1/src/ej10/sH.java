package ej10;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class sH {

	public static void main(String[] args) {

		try {
			
			ProcessBuilder pb = new ProcessBuilder("bash","./prueba.sh", "Ana");
			pb.directory(new File("/home/usuario/Documentos/git_proyecto/actividadesPSP/UD1/scripts"));
			Process p = pb.start();
			
			BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			String linea;
			
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
