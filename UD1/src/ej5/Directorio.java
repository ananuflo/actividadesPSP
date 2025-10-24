package ej5;

import java.io.File;

public class Directorio {

	public static void main(String[] args) {

		try {
			
			new ProcessBuilder("pwd").directory(new File("/tmp")).start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
