package ej8;

import java.util.concurrent.TimeUnit;

public class tiempoEspera {

	public static void main(String[] args) {

		ProcessBuilder pb = new ProcessBuilder("sleep", "10");
		
		try {
			
			Process p = pb.start();
			
			boolean fin = p.waitFor(2, TimeUnit.SECONDS);

			if(!fin) {
				System.out.println("El proceso tarda demasiado, finalizando...");
				p.destroy();
				
			}else {
				System.out.println("Proceso terminado normalmente en menos de 2 segundos");
			}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
