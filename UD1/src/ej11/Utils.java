package ej11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utils {

	
	public static String Consola() {
        String linea = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.print("consola> ");
                linea = br.readLine();
                // Fin: línea vacía o comando de salida
                if (linea.isBlank()) break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return linea;
}
	
}
