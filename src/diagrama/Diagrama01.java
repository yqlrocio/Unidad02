package diagrama;

import java.util.Scanner;

public class Diagrama01 {

	public static void main(String[] args) {

		// Crear variables
		int edad;

		// Craer Scanner
		Scanner reader = new Scanner(System.in);

		// Preguntar usuario número
		System.out.println("Introduce edad: ");
		edad = reader.nextInt();

		// Crear conditional, si el usuario es mayor de edad se mostrará por pantalla
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		
		}

			// Cerrar Scanner
			reader.close();
	}

}
