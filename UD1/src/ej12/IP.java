package ej12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;

public class IP {

	public static void main(String[] args) {

		try {
			
			System.out.println("IP PÚBLICA");
			ProcessBuilder pb = new ProcessBuilder("bash", "-c", "curl -s https://api.ipify.org?format=json");
			
			Instant inicio = Instant.now();
			Process p= pb.start();
			
			BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String linea;
			
			linea = r.readLine();
			
			int codigo = p.waitFor();
			Duration duracion = Duration.between(inicio, Instant.now());
			
			System.out.println("Salida IP Pública: " + linea);
			System.out.println("Código de salida: " + codigo);
			System.out.println("Duración: " + duracion);
			
			if(p.isAlive()) {
				System.out.println("EL proceso sigue activo");
				p.destroyForcibly();
			}else {
				System.out.println("El proceso terminó correctamente");
			}
			
			System.out.println("IP PRIVADA");
			ProcessBuilder pb2 = new ProcessBuilder("bash", "-c", "curl -s https://api.ipify.org?format=json");
			
			Instant ini = Instant.now();
			Process p2= pb2.start();
			
			BufferedReader r2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));

			String linea2;
			
			linea2 = r2.readLine();
			
			int cod = p.waitFor();
			Duration durac = Duration.between(inicio, Instant.now());
			
			System.out.println("Salida IP Privada: " + linea2);
			System.out.println("Código de salida: " + cod);
			System.out.println("Duración: " + durac);
			
			if(p.isAlive()) {
				System.out.println("EL proceso sigue activo");
				p.destroyForcibly();
			}else {
				System.out.println("El proceso terminó correctamente");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
