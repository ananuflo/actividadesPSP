package ej7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Pipe {

	public static void main(String[] args) {

		try {
			
			Process p1 = new ProcessBuilder("echo", "hola mundo").start();
			Process p2 = new ProcessBuilder("wc", "-w").start();
			
			
			InputStream salidaP1= p1.getInputStream();
			OutputStream entradaP2 = p2.getOutputStream();
			
			salidaP1.transferTo(entradaP2);
			
			BufferedReader r = new BufferedReader(new InputStreamReader(p2.getInputStream()));
			
			
			String linea;
			System.out.println("Resultado del Pipe: ");
			
			while((linea = r.readLine()) != null) {
				System.out.println(linea);
			}
			
			p1.waitFor();
			p2.waitFor();
			r.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
