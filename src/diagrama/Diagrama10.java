package diagrama;

import java.util.Scanner;

public class Diagrama10 {

	public static void main(String[] args) {
	
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Crear variables 
		int horas;
		int minutos;
		int segundos; 
		
		// Preguntar al usuario por una hora, minuto y segundo
		System.out.println("Introduzca las horas: ");
		horas = reader.nextInt(); 
		
		System.out.println("Introduzca los minutos: ");
		minutos = reader.nextInt(); 
		
		System.out.println("Introduzca los segundos: ");
		segundos = reader.nextInt(); 
		
		// Crear condicional para que sume un segundo y haga cambios a la hora, minutos y segundos introducidos por el usuario
		if (segundos < 59) {
			segundos++;
		} else {
			segundos = 0; 
			
			if (minutos < 59) {
				minutos++; 
			} else {
				minutos = 0; 
				if (horas < 23) { 
					horas++;
				} else {
					horas = 0; 
				} // fin else de las horas
			} // fin else de los minutos
		} // fin else de los segundos

	
		// Mostrar en pantalla las horas, los minutos y los segundos
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		// Cerrar Scanner
		reader.close(); 
	}

}
