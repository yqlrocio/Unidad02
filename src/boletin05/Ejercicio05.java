package boletin05;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
				
		// Crear Ramdon
		Random rand = new Random();
					
		// Crear variables
			int numAleatorio;
			int min = 1;
			int max = 101;
					
			String respuesta;
					
		// Crear do-while para que el programa adivine el valor que piense el usuario
			do {
			numAleatorio = rand.nextInt(min, max);
			System.out.println("¿Es " + numAleatorio + "?");
			respuesta = reader.next();
						
			}while(!respuesta.equals("iguales"));
					
			// Cerrar Scanner
			reader.close();

		}
	}