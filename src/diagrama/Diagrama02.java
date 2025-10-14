package diagrama;

import java.util.Scanner;

public class Diagrama02 {

	public static void main(String[] args) {
			// Crear variables
			int edad;

			// Craer Scanner
			Scanner reader = new Scanner(System.in);

			// Preguntar usuario número
			System.out.println("Introduce edad: ");
			edad = reader.nextInt();

			// Crear conditional para ver si el usuario es mayor o menor de edad
			if (edad >= 18) {
				System.out.println("Eres mayor de edad");
			} else { 
				System.out.println("Eres menor de edad");
			}

				// Cerrar Scanner
				reader.close();
		}

	}