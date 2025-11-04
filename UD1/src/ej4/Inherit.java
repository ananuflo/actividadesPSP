package ej4;

public class Inherit {

	public static void main(String[] args) {

		try {
			
			new ProcessBuilder("top","-b","-n1")
			.inheritIO()
			.start()
			.waitFor();

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
